package com.example.demo.controller

import com.example.demo.model.UserDTO
import com.example.demo.repository.UserRepository
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin
class UserController(
    private val userRepository: UserRepository,
) {
    
    
    @GetMapping("users")
    @ResponseStatus(HttpStatus.OK)
    fun getUsers(): List<UserDTO> {
        return userRepository.findAll()
            .map { dao ->
                UserDTO(
                    id = dao.id,
                    email = dao.email,
                    dateOfBirth = dao.dateOfBirth,
                )
            }
    }
}