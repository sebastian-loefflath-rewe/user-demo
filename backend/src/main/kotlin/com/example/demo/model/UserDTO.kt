package com.example.demo.model

import java.time.LocalDate
import java.util.UUID

data class UserDTO(
    val id: UUID,
    val email: String,
    val dateOfBirth: LocalDate?
)
