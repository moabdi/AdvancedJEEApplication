package com.moabdi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author moabdi
 *
 */
@RequestMapping("/")
@Controller
public class MainController {

  @RequestMapping("/")
  @ResponseBody
  public String index() {
    return "Welcome to HR APPLICATION";
  }

}
