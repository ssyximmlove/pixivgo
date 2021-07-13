package moe.peanutmelonseedbigalmond.pixiv.net

import okhttp3.Interceptor
import okhttp3.Response

class RetryInterceptor(private val maxRetryCount:Int):Interceptor {
    private var retryCount=0
    override fun intercept(chain: Interceptor.Chain): Response {
        val request=chain.request()
        var response:Response?=null
        try {
            response=chain.proceed(request)
            while (!response?.isSuccessful!! &&retryCount>maxRetryCount){
                retryCount++
                response=intercept(chain)
            }
        }catch (e:Exception){
            while (retryCount< maxRetryCount){
                retryCount++
                response=intercept(chain)
            }
        }
        return response!!
    }
}