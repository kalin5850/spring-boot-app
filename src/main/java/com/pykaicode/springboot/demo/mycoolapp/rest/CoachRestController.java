package com.pykaicode.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import com.pykaicode.springboot.demo.mycoolapp.common.Coach;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class CoachRestController {
  private Coach myCoach;
  private Coach anotherCoach;

  @Autowired
  public CoachRestController(
      @Qualifier("traceCoach") Coach myCoach,
      @Qualifier("traceCoach") Coach anotherCoach) {
    System.err.println("In constructor " + getClass().getSimpleName());
    this.myCoach = myCoach;
    this.anotherCoach = anotherCoach;
  }

  @GetMapping("/dailyworkout")
  public String getDailyWorkout() {
    return myCoach.getDailyWorkout();
  }

  @GetMapping("/check")
  public String check() {
    return "Comparing beans: myCoach == anotherCoach, " +
        (this.myCoach == this.anotherCoach);
  }

}
