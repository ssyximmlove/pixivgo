package moe.peanutmelonseedbigalmond.pixiv.net

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
class PixivSniBypassClient (maxRetryCount: Int = 3) {
    private val client = OkHttpClient.Builder()
        .sslSocketFactory(MySslSocketFactory.getSSLSocketFactory, MyTrustManager)
        .hostnameVerifier(MyHostnameVerifier)
        .addInterceptor {
            val newRequestBuilder = it.request().newBuilder()
            newRequestBuilder.addHeader("Referer", "www.pixiv.net")
                .addHeader("Host", "www.pixiv.net")
                .addHeader(
                    "User-Agent",
                    "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.212 Safari/537.36"
                )
                .addHeader("Accept-Language", "zh-CN,zh;q=0.9,en;q=0.8,ja;q=0.7,zh-TW;q=0.6")
            val newRequest = newRequestBuilder.build()
            return@addInterceptor it.proceed(newRequest)
        }
        .addInterceptor(RetryInterceptor(maxRetryCount))
        .build()
    private val service = Retrofit.Builder()
        .client(client)
        .baseUrl(PixivApi.PIXIV_IP_ADDRESS)
        .addConverterFactory(GsonConverterFactory.create())
        .build().create(PixivApi::class.java)

    suspend fun getIllustrationInfoByPid(pid: String) = service.getIllustrationInfo(pid)

    suspend fun getIllustrationImagesByPid(pid: String) = service.getIllustrationImagesInfo(pid)
}