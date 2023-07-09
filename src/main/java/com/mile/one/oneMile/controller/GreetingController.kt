package com.mile.one.oneMile.controller

import com.mile.one.oneMile.models.Greeting
import com.mile.one.oneMile.models.Rich
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {
    private val template = "Hello, %s!"
    private val counter = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): Greeting {
        return Greeting(counter.incrementAndGet(), java.lang.String.format(template, name))
    }
    @GetMapping("/rich")
    fun rich(@RequestParam(value = "name", defaultValue = "World") name: String): Rich {
        return Rich(counter.incrementAndGet(), java.lang.String.format(template, name))
    }
}