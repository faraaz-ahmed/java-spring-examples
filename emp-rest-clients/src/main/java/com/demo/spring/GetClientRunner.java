package com.demo.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GetClientRunner implements CommandLineRunner{
	@Override
	public void run(String... args) throws  Exception{
		RestTemplate rt = new RestTemplate();
//		ResponseEntity<String> resp = rt.getForEntity("http://localhost:8181/app/app/emp/find/104", String )
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", "application/xml");
		HttpEntity requestObj = new HttpEntity<>(headers);
		rt.exchange("http://localhost:8181/app/app/emp/find/104",HttpMethod.GET,requestObj, String.class)
		System.out.println(resp.getBody());
	}
}
