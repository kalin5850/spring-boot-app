package com.pykaicode.springboot.demo.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component
public class TraceCoach implements Coach {

  @Override
  public String getDailyWorkout() {
    return "Run a hard 5k!";
  }

}
