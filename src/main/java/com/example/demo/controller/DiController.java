package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/di")
public class DiController {
  @RequestMapping("")
  public String di() {
    return "di/ui";
  }
}
