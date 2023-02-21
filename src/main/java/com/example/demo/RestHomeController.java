package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class RestHomeController {
  @GetMapping("/home")
  public String home() {
    log.debug("debug");
    log.info("info");
    log.warn("warn");
    log.error("error");
    return "여기가 출력되는 곳 spring gradle test!!!!!";
  }
}
