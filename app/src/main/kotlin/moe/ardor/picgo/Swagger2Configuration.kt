package moe.ardor.picgo

import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@Configuration
@EnableSwagger2

class Swagger2Configuration {
    fun apiInfo(): ApiInfo {
        return ApiInfoBuilder().title("Pixivgo Api接口文档")
            .description("如有问题请联系Email：echoffical@mail.ru")
            .version("1.0.0")
            .build()
    }

    fun createRestApi(): Docket {
        return Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors.basePackage("moe"))
            .paths(PathSelectors.any())
            .build()

    }
}