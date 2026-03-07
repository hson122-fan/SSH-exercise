package program1.ch9_ex1.login;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class LoggedUser {
    private String username;

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return this.username;
    }
}
