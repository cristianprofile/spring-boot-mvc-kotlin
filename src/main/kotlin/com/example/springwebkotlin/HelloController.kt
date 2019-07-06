package com.example.springwebkotlin

import org.springframework.beans.factory.annotation.Value
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@Validated
@RequestMapping("/hello")
class HelloController(@Value("\${my.property.name}") val myproperty: String,
                      @Value("\${my.property.description}") val mypropertyDescription: String) {


    @GetMapping
    fun getEnvironmentProperty(): String = myproperty

}