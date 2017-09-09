package cn.home1.oss.lib.webmvc.test;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LibWebmvcTestApplication {

  @RequestMapping("/api/hello")
  public String user() {
    return "hello";
  }

  public static void main(final String... args) {
    SpringApplication.run(LibWebmvcTestApplication.class, args);
  }
}
