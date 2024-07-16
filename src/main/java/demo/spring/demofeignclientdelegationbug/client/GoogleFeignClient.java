package demo.spring.demofeignclientdelegationbug.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "google", url = "https://www.google.com", configuration = FeignConfig.class)
public interface GoogleFeignClient {

    @GetMapping("/search")
    String search(@RequestParam("q") String text);

}
