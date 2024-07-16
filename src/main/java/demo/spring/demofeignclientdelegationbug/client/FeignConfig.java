package demo.spring.demofeignclientdelegationbug.client;

import feign.Client;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

public class FeignConfig {

    //@Bean this works ok as it does not inject Client
    //public Client client() {
        //return new Client.Default(null, null);
    //}

    @Bean
    public Client client(Client client) {
        return client;
    }

}
