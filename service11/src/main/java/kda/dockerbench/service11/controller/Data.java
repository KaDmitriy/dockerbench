package kda.dockerbench.service11.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kda.dockerbench.service11.dto.InfoDTO;

@RestController
public class Data {

	@GetMapping("/info")
	public InfoDTO getInfo() {
		return new InfoDTO("test version");
	}
	
}
