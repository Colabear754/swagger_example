package com.colabear754.swagger_example.controllers

import io.swagger.annotations.Api
import io.swagger.annotations.ApiImplicitParam
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import springfox.documentation.annotations.ApiIgnore

@Api(tags = ["예제 API"], description = "Swagger 테스트용 API")
@RestController
@RequestMapping("/")
class ExampleController {
    @ApiOperation(value = "문자열 반복", notes = "파라미터로 받은 문자열을 2번 반복합니다.")
    @ApiImplicitParam(name = "str", value = "2번 반복할 문자열")
    @GetMapping("/returnStr")
    fun returnStr(@RequestParam str: String) = "$str\n$str"

    @GetMapping("/example")
    fun example() = "예시 API"

    @ApiIgnore
    @GetMapping("/ignore")
    fun ignore() = "무시되는 API"
}