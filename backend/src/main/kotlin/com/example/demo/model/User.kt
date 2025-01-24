package com.example.demo.model

import java.time.OffsetDateTime
import java.util.UUID

data class User(
    val id: UUID,
    val email: String,
    val dateOfBirth: OffsetDateTime?
)
