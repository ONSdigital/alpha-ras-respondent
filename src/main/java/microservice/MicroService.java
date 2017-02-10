package microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;




@EnableDiscoveryClient
@RestController
@SpringBootApplication
@EnableOAuth2Sso
public class MicroService {


  @RequestMapping(value = "/available")
  public String available() {
    return "Spring Microservice in Action";
  }

  @RequestMapping(value = "/checked-out")
  public String checkedOut() {
    return "Spring Boot in Action";
  }

  public static void main(String[] args) {
    SpringApplication.run(MicroService.class, args);
  }
}


//TODO: set up eureka registry
//TODO: look at comments in Application.java in ras-gateway
//
