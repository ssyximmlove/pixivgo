package moe.ardor.picgo.controller

import org.springframework.web.bind.annotation.*

@RestController
class Authentication {
    @GetMapping("/keys")
    fun geneApikey(): String {
        //TODO: Apikey生成部分代码
        return "开发中"
    }
    @DeleteMapping("/keys")
    fun delApikey(): String {
        //TODO: Apikey删除部分代码
        return "开发中"
    }
}