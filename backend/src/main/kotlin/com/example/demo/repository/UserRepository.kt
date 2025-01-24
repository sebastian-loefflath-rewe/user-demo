package com.example.demo.repository

import jakarta.persistence.Entity
import jakarta.persistence.Id
import org.springframework.data.jpa.repository.JpaRepository
import java.time.OffsetDateTime
import java.util.UUID

//interface UserRepository : JpaRepository<UserDAO, UUID>
//
//@Entity
//data class UserDAO(
//    @Id
//    @Gener
//    val id: UUID = UUID(0,0),
//    val email: String,
//    val dateOfBirth: OffsetDateTime,
//)