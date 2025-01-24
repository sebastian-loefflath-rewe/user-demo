package com.example.demo.model

import java.time.OffsetDateTime
import java.util.UUID

data class UserDTO(
    val id: UUID,
    val email: String,
    val dateOfBirth: OffsetDateTime?
)
