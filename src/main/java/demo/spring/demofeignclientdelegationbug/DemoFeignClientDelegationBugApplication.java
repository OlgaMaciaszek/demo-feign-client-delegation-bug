package demo.spring.demofeignclientdelegationbug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DemoFeignClientDelegationBugApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoFeignClientDelegationBugApplication.class, args);
    }

}
