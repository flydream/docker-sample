package org.harrison.sample.app.service;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class InfoService {
  public Map<String, String> getSystemProperties() {
    return System.getenv();
  }
}
