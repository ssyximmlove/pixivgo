package moe.peanutmelonseedbigalmond.pixiv.net

import moe.peanutmelonseedbigalmond.pixiv.response.IllustrationInfoResponse
import moe.peanutmelonseedbigalmond.pixiv.response.ImagesInfoResponse
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Path

internal interface PixivApi {
    @GET("/")
    suspend fun test(): ResponseBody

    @GET("/ajax/illust/{illustrationId}")
    suspend fun getIllustrationInfo(
        @Path("illustrationId") pid: String
    ): IllustrationInfoResponse

    @GET("/ajax/illust/{illustrationId}/pages")
    suspend fun getIllustrationImagesInfo(
        @Path("illustrationId") pid: String
    ): ImagesInfoResponse


    companion object {
        const val PIXIV_IP_ADDRESS = "https://210.140.131.199/"
    }
}