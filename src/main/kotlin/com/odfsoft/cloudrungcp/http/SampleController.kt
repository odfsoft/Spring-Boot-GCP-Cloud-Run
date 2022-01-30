package com.odfsoft.cloudrungcp.http

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/message/")
class KafkaController {

    @PostMapping("/{message}")
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    suspend fun sendMessage(@PathVariable message: String): Response {
        println("message from api: $message")
        return Response(message)
    }
}

data class Response(
    val message: String
)