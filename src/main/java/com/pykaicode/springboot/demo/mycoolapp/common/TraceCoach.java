package com.pykaicode.springboot.demo.mycoolapp.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TraceCoach implements Coach {

  public TraceCoach() {
    System.err.println("In constructor " + getClass().getSimpleName());
  }

  @Override
  public String getDailyWorkout() {
    return "Run a hard 5k!";
  }

}
