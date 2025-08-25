package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Member2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/receive-data-rest")
public class ReceiveDataRestController {
  @GetMapping("/path-variable1/{bno}")
  public Map<String, Integer> pathVariable1(@PathVariable("bno") int bno) {
    Map<String, Integer> map = new HashMap<>();
    map.put("bno", bno);
    return map;
  }

  @GetMapping("/path-variable/{kind}/{bno}")
  public Map<String, Object> pathVariable2(
    @PathVariable("kind") String kind,
    @PathVariable("bno") int bno
  ) {
    Map<String, Object> map = new HashMap<>();
    map.put("kind", kind);
    map.put("bno", bno);
    return map;
  }

  @RequestMapping("/request-parameter1")
  public Map<String, String> requestParamter1(
    @RequestParam("mid") String mid,
    @RequestParam("mname") String mname,
    @RequestParam("mpwd") String mpwd
  ) {
    Map<String, String> map = new HashMap<>();
    map.put("mid", mid);
    map.put("mname", mname);
    map.put("mpwd", mpwd);

    return map;
  }

  @RequestMapping("/request-parameter2")
  public Map<String, String> requestParameter2(@ModelAttribute Member2 member) {
    Map<String, String> map = new HashMap<>();
    map.put("mid", member.getMid());
    map.put("mname", member.getMname());
    map.put("mpwd", member.getMpwd());

    return map;
  }

  @RequestMapping("/json")
  public Map<String, String> json(@RequestBody Member2 member) {
    Map<String, String> map = new HashMap<>();
    map.put("mid", member.getMid());
    map.put("mname", member.getMname());
    map.put("mpwd", member.getMpwd());

    return map;
  }
}
