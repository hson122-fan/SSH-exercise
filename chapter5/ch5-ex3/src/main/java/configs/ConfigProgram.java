package configs;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import controls.CommentRepository;
import services.CommentService;
import services.UserService;

@Configuration
@ComponentScan(basePackages = {"controls", "services"})
public class ConfigProgram {
    
}
