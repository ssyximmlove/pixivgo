package moe.ardor.picgo.controller

import kotlinx.coroutines.runBlocking
import moe.peanutmelonseedbigalmond.pixiv.net.PixivSniBypassClient
import moe.peanutmelonseedbigalmond.pixiv.response.IllustrationInfoResponse
import moe.peanutmelonseedbigalmond.pixiv.response.ImagesInfoResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController


@RestController
class QueryData {
    @GetMapping("/illust")
    fun illustPage(): String {
        return "请以“/illust/{pid}({pid}改为你所查询图片的id)”形式进行查询"
    }
    @GetMapping("/illust/{pid}")
    fun queryInfobyPid(@PathVariable("pid")pid:String): IllustrationInfoResponse {
        return runBlocking {
            val pixivClient = PixivSniBypassClient()
            return@runBlocking pixivClient.getIllustrationInfoByPid(pid)
        }

    }
    @GetMapping("/img/{pid}")
    fun queryImagebyPid(@PathVariable("pid")pid:String): ImagesInfoResponse {
        return runBlocking {
            val pixivClient = PixivSniBypassClient()
            return@runBlocking pixivClient.getIllustrationImagesByPid(pid)
        }

    }
}