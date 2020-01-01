package forever;

import org.springframework.context.annotation.Bean;

public class UserConfiguration {

    @Bean
    public User getUser(){
        User user = new User();
        user.setUserName("Hello");
        user.setAge(20);
        return user;
    }
}
