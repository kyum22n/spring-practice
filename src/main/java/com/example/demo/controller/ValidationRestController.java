package com.example.demo.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Member;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/validation-rest")
public class ValidationRestController {
  @RequestMapping("/request-parameter")
  public String requestParameter(@ModelAttribute @Valid Member member) {
    

    return "{\"validation\": \"success\"}";
  }
  
  @RequestMapping("/json")
  public String json(@RequestBody @Valid Member member) {


    return "{\"validation\": \"success\"}";
  }
}
