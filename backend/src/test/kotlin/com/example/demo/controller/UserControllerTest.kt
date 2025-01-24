package com.example.demo.controller

import com.example.demo.repository.UserDAO
import com.example.demo.repository.UserRepository
import com.ninjasquad.springmockk.MockkBean
import io.mockk.every
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.bean.override.mockito.MockitoBean
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import java.time.LocalDate
import java.util.UUID
import kotlin.test.Test

@WebMvcTest(controllers = [UserController::class])
class UserControllerTest @Autowired constructor(
    private val mockMvc: MockMvc,
) {
    
    @MockkBean
    private lateinit var userRepository: UserRepository
    
    @Test
    fun getUser() {
        val userId = UUID.randomUUID()
        every { userRepository.findAll() } returns listOf(UserDAO(userId, "test@bar.local", LocalDate.of(2020, 12, 24)))
        
        mockMvc.perform(get("/users"))
            .andExpect(status().isOk)
            .andExpect(jsonPath("$.size()").value(1))
            .andExpect(jsonPath("$[0].id").value(userId.toString()))
            .andExpect(jsonPath("$[0].email").value("test@bar.local"))
            .andExpect(jsonPath("$[0].dateOfBirth").value("2020-12-24"))
    }
    
}