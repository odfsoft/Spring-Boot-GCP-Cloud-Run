package com.odfsoft.cloudrungcp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CloudRunGcpApplication

fun main(args: Array<String>) {
	runApplication<CloudRunGcpApplication>(*args)
}
