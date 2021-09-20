package no.jpro.springnativedemo.controller

import no.jpro.springnativedemo.model.Person
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @RequestMapping("/hello")
    fun sayHello(person: Person): String {
        return "Hello ${person.name}!"
    }
}