package com.odfsoft.cloudrungcp.http

import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/message/")
class SampleController(
    @Value("\${spring.profiles.active}")
    private val environment: String,
)
{

    @PostMapping("/{message}")
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    suspend fun sendMessage(@PathVariable message: String): Response {
        val messageResponse = "message from api: $message and env [$environment]"
        println(messageResponse)
        return Response(messageResponse)
    }
}

data class Response(
    val message: String
)