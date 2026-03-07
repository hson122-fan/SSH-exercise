package program1.ch9_ex1.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {
    private final LoggedUser loggedUser;
    private final LoginCount countUser;
    private String username;
    private String password;

    public LoginProcessor(LoggedUser loggedUser, LoginCount count
    ){
        this.loggedUser = loggedUser;
        this.countUser = count;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public boolean login(){
        
        if("anderson".equals(this.username) && "password".equals(this.password)){
            this.countUser.increase();
            loggedUser.setUsername(username);
            return true;
        }
        else{
            return false;
        }
    }
}
