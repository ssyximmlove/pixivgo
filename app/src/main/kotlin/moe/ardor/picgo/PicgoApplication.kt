package moe.ardor.picgo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import springfox.documentation.swagger2.annotations.EnableSwagger2

@SpringBootApplication
@EnableSwagger2
class PicgoApplication

fun main(args: Array<String>) {
	runApplication<PicgoApplication>(*args)
	//TODO: 完成Swagger2文档部分
}
