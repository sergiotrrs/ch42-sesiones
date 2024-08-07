package com.pakasio.app.rest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class UserRestTest {
	
	@Autowired private MockMvc mockMvc;
	
	@Test
	void postUser() throws Exception {

		ResultActions result = mockMvc.perform( post("/api/v1/users")
				.content( buildMockJsonUser() )
				.header(HttpHeaders.CONTENT_TYPE,"application/json") )
				.andDo(print());
		
		// Assert
        result.andExpect(status().isCreated() )
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(jsonPath("$.id").isNotEmpty() )
        .andExpect(jsonPath("$.firstName").value("Bob"))
        .andExpect(jsonPath("$.email").value("bob@nickelodeon.com"));
        
        // Extraer el contenido de la respuesta
        MvcResult mvcResult = result.andReturn();
        String responseContent = mvcResult.getResponse().getContentAsString();
        
        // Extraer el ID del JSON de la respuesta
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(responseContent);
        String userId = rootNode.path("id").asText();
        
        // Imprimir el ID del usuario
        System.out.println("ID del usuario creado: " + userId);
	}
	
/*	
	@Test
	void getUser() throws Exception {
		mockMvc.perform( get("/api/v1/users"))
				.andDo(print()).andExpect( status().isOk());
		
	}
*/	
	String buildMockJsonUser() {
		StringBuilder builder = new StringBuilder(); 
		builder.append("{");
		builder.append("\"firstName\": \"Bob\",");
		builder.append("\"lastName\": \"Esponja\",");
		builder.append("\"email\": \"bob@nickelodeon.com\",");
		builder.append("\"password\": \"Cangreburguer\",");
		builder.append("\"avatar\": \"https://randomuser.me/api/portraits/women/51.jp\",");
		builder.append("\"birthdate\": \"1973-09-08\",");
		builder.append("\"roles\": null");
		builder.append("}");
		return builder.toString();
	}
	

}
