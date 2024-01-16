package com.pykaicode.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.pykaicode.util.Coach;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CoachRestController {
  private Coach myCoach;

  @Autowired
  public CoachRestController(Coach myCoach) {
    this.myCoach = myCoach;
  }

  @GetMapping("/dailyworkout")
  public String getDailyWorkout() {
    return myCoach.getDailyWorkout();
  }

}
