package com.example.rc2apitesting;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class UnicornioTest {

	@Autowired
	private MockMvc api;

	@Test
	void crea_un_pokemon() throws Exception {
		// cuando hacemos GET /microfono?muted=true
		api.perform(delete("/unicornio?q=100&p=80"))
				// entonces nos tiene que devolver el secador de pelo (200 OK)
				.andExpect(status().isOk())
				.andExpect(content().string("Eliminados 100 unicornios por un total de 8000 euros"));
	}

}
