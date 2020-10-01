package com.graph.simplewallet

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@ComponentScan(basePackages = ["com.graph"])
@SpringBootApplication
class SimpleWalletApplication

fun main(args: Array<String>) {
	runApplication<SimpleWalletApplication>(*args)
}

