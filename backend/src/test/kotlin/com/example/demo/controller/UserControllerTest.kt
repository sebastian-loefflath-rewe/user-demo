package com.example.demo.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import java.util.UUID
import kotlin.test.Test

@WebMvcTest(controllers = [UserController::class])
class UserControllerTest @Autowired constructor(
    private val mockMvc: MockMvc,
) {
    
    @Test
    fun getUser() {
        val userId = UUID.randomUUID()
        mockMvc.perform(get("/users/$userId"))
            .andExpect(status().isOk)
            .andExpect(jsonPath("$.id").value(userId.toString()))
            .andExpect(jsonPath("$.email").exists())
            .andExpect(jsonPath("$.dateOfBirth").exists())
    }
    
    
    
}