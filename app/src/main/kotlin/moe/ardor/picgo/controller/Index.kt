package moe.ardor.picgo.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class Index {
    @GetMapping("/")
    fun indexPage(): String {
        //TODO: Api Docs相关代码
        return "Developing"
    }
}