package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/validation")
public class ValidationController {
  @GetMapping("/request-parameter")
  public String requestParameter() {
    return "validation/request-parameter";
  }
  
  @GetMapping("/json")
  public String json() {
    return "validation/json";
  }
  
}
