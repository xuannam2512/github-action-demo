package com.gihubaction.githubactiondemo.controller;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "test")
public class TestController {

  @GetMapping
  public ResponseEntity<String> test() {
    return ResponseEntity.ok().body("Hello world");
  }
}
