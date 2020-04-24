package com.vm.test;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController 
@RequestMapping(path = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class MathController {
	@PostMapping(path = "/add")
	public String getSum(@RequestBody String json) throws Exception {
		Math addRequest = null;
		try {
			ObjectMapper mapper = new ObjectMapper();

			addRequest = mapper.readValue(json, Math.class);
			
			
		} catch (JsonProcessingException | IllegalArgumentException e) {
			throw new MalformedJsonException("Incorrect Json.");

		}

		if (addRequest.getX() == null || addRequest.getY() == null) {
			throw new MalformedJsonException("Incorrect values for X and Y.");
		}

		Long result = (long) (addRequest.getX() + addRequest.getY());

		ObjectMapper mapper = new ObjectMapper();
		ObjectNode objectNode1 = mapper.createObjectNode();
		objectNode1.put("result", result);

		return objectNode1.toString();

		
	}
	
	
	@PostMapping(path = "/diff")
	public String getDifference(@RequestBody String json) throws Exception {
		Math addRequest = null;
		try {
			ObjectMapper mapper = new ObjectMapper();

			addRequest = mapper.readValue(json, Math.class);
			
			
		} catch (JsonProcessingException | IllegalArgumentException e) {
			throw new MalformedJsonException("Incorrect Json.");

		}

		if (addRequest.getX() == null || addRequest.getY() == null) {
			throw new MalformedJsonException("Incorrect values for X and Y.");
		}

		Integer result = addRequest.getX() - addRequest.getY();

		ObjectMapper mapper = new ObjectMapper();
		ObjectNode objectNode1 = mapper.createObjectNode();
		objectNode1.put("result", result);

		return objectNode1.toString();
		
	}
}
