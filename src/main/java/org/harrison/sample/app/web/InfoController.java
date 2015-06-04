package org.harrison.sample.app.web;

import java.util.Collections;
import java.util.Map;

import org.harrison.sample.app.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InfoController {
  @Autowired
  private InfoService infoService;

  @RequestMapping("/")
  @ResponseBody
  public ModelAndView info() {
    final Map<String, Map<String, String>> model = Collections.singletonMap("environment",
        infoService.getSystemProperties());

    return new ModelAndView("info", model);
  }
}
