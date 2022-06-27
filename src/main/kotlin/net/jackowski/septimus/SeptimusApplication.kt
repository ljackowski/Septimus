package net.jackowski.septimus

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SeptimusApplication

fun main(args: Array<String>) {
    runApplication<SeptimusApplication>(*args)
}
