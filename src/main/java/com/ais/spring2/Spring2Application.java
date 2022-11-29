package com.ais.spring2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Spring2Application {

  public static void main(String[] args) {
    SpringApplication.run(Spring2Application.class, args);
  }

  @RequestMapping("/spring")
  public String getString() {
    return "Hello world 2";
  }

}
