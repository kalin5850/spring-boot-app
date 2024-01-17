package com.pykaicode.springboot.demo.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

  public BaseballCoach() {
    System.err.println("In constructor " + getClass().getSimpleName());
  }

  @Override
  public String getDailyWorkout() {
    return "Speed 30 minutes in batting practice";
  }

}
