package guru.springframework.springmsbrewery.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import guru.springframework.springmsbrewery.web.model.CustomerDto;
import guru.springframework.springmsbrewery.web.services.CustomerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.core.Is.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(CustomerController.class)
class CustomerControllerTest {

    @MockBean
    CustomerService customerService;

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    CustomerDto validDto;
    CustomerDto nonValidDto;

    @BeforeEach
    void setUp() {
        validDto = CustomerDto.builder().id(UUID.randomUUID()).name("John").build();
        nonValidDto = CustomerDto.builder().id(UUID.randomUUID()).name("Ax").build();
    }

    @Test
    void getCustomer() {
    }

    @Test
    void createValidCustomer() throws Exception {
        String jsonDto = objectMapper.writeValueAsString(validDto);
        given(customerService.save(any())).willReturn(validDto);
        mockMvc.perform(
                post("/api/v1/customer")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(jsonDto))
                .andExpect(status().isCreated());
    }

    @Test
    void createNonValidCustomer() throws Exception {
        String jsonDto = objectMapper.writeValueAsString(nonValidDto);
        given(customerService.save(any())).willReturn(nonValidDto);
        mockMvc.perform(
                post("/api/v1/customer")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(jsonDto))
                .andExpect(status().isBadRequest());
    }

    @Test
    void updateCustomer() {
    }

    @Test
    void deleteCustomer() {
    }
}