package kda.dockerbench.service1.controller;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GW {

	Logger logger = LoggerFactory.getLogger(GW.class);

	@Value("${service11.url}")
	private String service11Url;

	@GetMapping("/s11/infotest")
	public ResponseEntity<Void> redirectS11InfoTest() {
		//logger.info(service11Url);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(URI.create(service11Url + "info"));
		return new ResponseEntity<>(headers, HttpStatus.MOVED_PERMANENTLY);
	}

	@GetMapping(value="/s11/info", produces = MediaType.APPLICATION_JSON_VALUE)
	public String redirectS11Info() {
		//logger.info("redirectS11Info - /s11/info");
		//logger.info("URL:"+service11Url + "info");
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		return restTemplate.exchange(URI.create(service11Url + "info"), HttpMethod.GET, entity, String.class).getBody();
	}
}
