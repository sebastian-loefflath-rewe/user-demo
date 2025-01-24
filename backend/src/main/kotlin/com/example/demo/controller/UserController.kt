package com.example.demo.controller

import com.example.demo.model.User
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.time.OffsetDateTime
import java.util.UUID

@RestController
class UserController {
    
    @GetMapping("users/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun getUser(@PathVariable id: UUID): User {
        // TODO dummy implementation
        return User(
            id = id,
            email = "test@example.com",
            dateOfBirth = OffsetDateTime.now()
        )
    }
}