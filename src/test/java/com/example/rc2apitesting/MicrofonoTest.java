package com.example.rc2apitesting;

import static org.hamcrest.Matchers.equalTo;
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
class MicrofonoTest {

	@Autowired
	private MockMvc api;

	@Test
	void crea_un_pokemon() throws Exception {
		// cuando hacemos GET /microfono?muted=true
		api.perform(put("/microfono?muted=true"))
				// entonces nos tiene que devolver el secador de pelo (200 OK)
				.andExpect(status().isOk())
				.andExpect(content().string("muteada"));
	}

}
