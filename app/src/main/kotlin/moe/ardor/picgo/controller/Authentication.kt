package moe.ardor.picgo.controller

import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.*

@RestController
class Authentication {
    @ApiOperation("生成APIKey")
    @GetMapping("/keys")
    fun geneApikey(): String {
        //TODO: Apikey生成部分代码
        return "开发中"
    }
    @ApiOperation("删除APIKey")
    @DeleteMapping("/keys")
    fun delApikey(): String {
        //TODO: Apikey删除部分代码
        return "开发中"
    }
}