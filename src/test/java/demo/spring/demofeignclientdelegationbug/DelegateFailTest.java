package demo.spring.demofeignclientdelegationbug;

import demo.spring.demofeignclientdelegationbug.client.GoogleFeignClient;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

//app will not start
@SpringBootTest(webEnvironment = RANDOM_PORT)
@ExtendWith(SpringExtension.class)
class DelegateFailTest {

    @Autowired
    GoogleFeignClient googleFeignClient;

    @Test
    void contextLoads() {
        googleFeignClient.search("hello");
    }

}
