package com.pykaicode.springboot.demo.mycoolapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pykaicode.springboot.demo.mycoolapp.common.Coach;
import com.pykaicode.springboot.demo.mycoolapp.common.SwimCoach;

@Configuration
public class SportConfig {

  @Bean("aquatic")
  public Coach swimCoach() {
    return new SwimCoach();
  }

}
