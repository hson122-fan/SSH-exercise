package configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import controls.CommentRepository;
import services.UserService;

@Configuration
@ComponentScan(basePackages = {"controls", "services"})
public class ConfigProgram {
    
    @Bean
    UserService user_service(CommentRepository repo){
        return new UserService(repo);
    }
}
