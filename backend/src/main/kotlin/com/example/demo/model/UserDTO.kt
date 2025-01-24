package com.example.demo.model

import java.time.LocalDate
import java.util.UUID

data class UserDTO(
    val id: UUID? = null,
    val email: String,
    val dateOfBirth: LocalDate?
)
