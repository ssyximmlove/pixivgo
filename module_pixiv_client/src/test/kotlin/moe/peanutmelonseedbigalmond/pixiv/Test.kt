package moe.peanutmelonseedbigalmond.pixiv

import kotlinx.coroutines.runBlocking
import moe.peanutmelonseedbigalmond.pixiv.net.PixivSniBypassClient
import org.junit.Test


class Test {
    @Test
    fun exampleTest(){
        runBlocking {
            val client=PixivSniBypassClient()
            val response=client.getIllustrationInfoByPid("91088436")
            println(response)
        }
    }
}