package cn.home1.oss.lib.webmvc.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class LibWebmvcTestApplicationIT {

  private static final Logger log = LoggerFactory.getLogger(LibWebmvcTestApplicationIT.class);

  @Autowired
  private TestRestTemplate restTemplate;

  @Test
  public void testHello() {
    log.info("testHello");
    final ResponseEntity<String> responseEntity = this.restTemplate.getForEntity("/api/hello", String.class);
    assertEquals("hello", responseEntity.getBody());
  }
}
