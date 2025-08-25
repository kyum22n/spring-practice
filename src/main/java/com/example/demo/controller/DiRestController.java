package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/di-rest")
public class DiRestController {
  @GetMapping("/field-di")
  public String fieldDi(){
    return "필드 주입";
  }

  @GetMapping("/constructor-di")
  public String constructorDi() {
    return "생성자 주입";
  }

  @GetMapping("/setter-di")
  public String setterDi() {
    return "Setter 메소드 주입";
  }

  @GetMapping("/named-di")
  public String namedDi() {
    return "이름으로 주입";
  }
}
