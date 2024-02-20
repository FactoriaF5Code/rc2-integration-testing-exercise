package com.example.rc2apitesting;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class IntegrationTests {

	@Autowired
	private MockMvc api;

	@Test
	void devuelve_un_producto() throws Exception{
		// cuando hacemos GET /products/5
		api.perform(get("/products/5"))
		// entonces nos tiene que devolver el secador de pelo (200 OK)
			.andExpect(status().isOk())
			.andExpect(jsonPath("$.id", equalTo("5")))
			.andExpect(jsonPath("$.name", equalTo("secador de pelo")))
			.andExpect(jsonPath("$.price", equalTo("89.99")));
	}

}
