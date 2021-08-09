package moe.ardor.picgo.controller

import io.swagger.annotations.ApiOperation
import kotlinx.coroutines.runBlocking
import moe.peanutmelonseedbigalmond.pixiv.net.PixivSniBypassClient
import moe.peanutmelonseedbigalmond.pixiv.response.IllustrationInfoResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController


@RestController
class queryData {
    @GetMapping("/illust")
    fun illustPage(): String {
        return "请以“/illust/{pid}({pid}改为你所查询图片的id)”形式进行查询"
    }
    @ApiOperation("查询一张Pixiv图片")
    @GetMapping("/illust/{pid}")
    fun queryInfobyPid(@PathVariable("pid")pid:String): IllustrationInfoResponse {
        return runBlocking {
            val pixivClient = PixivSniBypassClient()
            return@runBlocking pixivClient.getIllustrationInfoByPid(pid)
        }

    }
}