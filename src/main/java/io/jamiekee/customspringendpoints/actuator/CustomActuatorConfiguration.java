package io.jamiekee.customspringendpoints.actuator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomActuatorConfiguration {

  @Bean
  public HelloWorldEndpoint helloWorldEndpoint() {
    return new HelloWorldEndpoint();
  }

}
