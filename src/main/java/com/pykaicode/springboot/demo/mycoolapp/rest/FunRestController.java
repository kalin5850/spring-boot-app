package com.pykaicode.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class FunRestController {

  @Value("${coach.name}")
  private String coachName;

  @GetMapping("/")
  public String sayHello() {
    return "Hello World !!";
  }

  @GetMapping("/applicationprops")
  public String printApplicationProperties() {
    return this.coachName;
  }

}
