package com.example.demo.repository

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.springframework.data.repository.ListCrudRepository
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID

interface UserRepository : ListCrudRepository<UserDAO, UUID>

@Entity(name = "users")
data class UserDAO(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID = UUID(0,0),
    val email: String,
    @Column(columnDefinition = "DATE")
    val dateOfBirth: LocalDate,
)