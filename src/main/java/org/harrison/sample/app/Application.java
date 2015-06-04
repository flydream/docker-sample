package org.harrison.sample.app;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {
  private static Log logger = LogFactory.getLog(Application.class);

  public static void main(final String[] args) throws Exception {
    SpringApplication.run(Application.class, args);
  }

  @Bean
  protected ServletContextListener listener() {
    return new ServletContextListener() {
      @Override
      public void contextInitialized(final ServletContextEvent sce) {
        logger.info("ServletContext initialized");
      }

      @Override
      public void contextDestroyed(final ServletContextEvent sce) {
        logger.info("ServletContext destroyed");
      }
    };
  }

}
