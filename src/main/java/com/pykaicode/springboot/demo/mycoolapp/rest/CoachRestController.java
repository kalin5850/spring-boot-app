package com.pykaicode.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import com.pykaicode.springboot.demo.mycoolapp.common.Coach;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CoachRestController {
  private Coach myCoach;
  private Coach anotherCoach;
  private Coach swimCoach;

  @Autowired
  public CoachRestController(
      @Qualifier("traceCoach") Coach myCoach,
      @Qualifier("traceCoach") Coach anotherCoach,
      @Qualifier("aquatic") Coach swimCoach) {
    System.err.println("In constructor " + getClass().getSimpleName());
    this.myCoach = myCoach;
    this.anotherCoach = anotherCoach;
    this.swimCoach = swimCoach;
  }

  @GetMapping("/dailyworkout")
  public String getDailyWorkout() {
    return this.swimCoach.getDailyWorkout();
  }

  @GetMapping("/check")
  public String check() {
    return "Comparing beans: myCoach == anotherCoach, " +
        (this.myCoach == this.anotherCoach);
  }

}
