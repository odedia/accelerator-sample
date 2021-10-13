package com.example.springboot;

import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


	@RequestMapping("/")
	public String index() {
          Integer i = 5;
          System.out.println("Returning message... i=" + i);
          return "Greetings from Tanzu!";
	}

    @Bean
    public HttpTraceRepository htttpTraceRepository() {
            return new InMemoryHttpTraceRepository();
    }

}
