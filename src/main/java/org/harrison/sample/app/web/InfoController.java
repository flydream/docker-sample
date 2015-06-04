package org.harrison.sample.app.web;

import org.harrison.sample.app.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InfoController {
  @Autowired
  private InfoService infoService;

  @RequestMapping("/")
  @ResponseBody
  public String info() {
    return infoService.environment().toString();
  }
}
