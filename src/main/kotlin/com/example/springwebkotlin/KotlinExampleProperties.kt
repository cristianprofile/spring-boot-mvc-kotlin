package com.example.springwebkotlin

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component


@Component
@ConfigurationProperties("my.property")
class KotlinExampleProperties {

    lateinit var name: String

    lateinit var description: String
}