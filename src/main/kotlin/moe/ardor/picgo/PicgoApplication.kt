package moe.ardor.picgo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PicgoApplication

fun main(args: Array<String>) {
	runApplication<PicgoApplication>(*args)
}
