package br.com.dimdim.transaction_service

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RootController {

    @GetMapping("/")
    fun root(): Map<String, String> = mapOf(
        "app" to "transaction-service",
        "status" to "ok"
    )

}
