package program1.ch9_ex1.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    public final LoginProcessor login;

    public LoginController(LoginProcessor login){
        this.login = login;
    }

    @GetMapping("/")
    public String loginGet(){
        return "login.html";
    }

    @PostMapping("/")
    public String loginPost(
        String username,
        String password,
        Model model
    ){
        System.out.println(login);
        this.login.setUsername(username);
        this.login.setPassword(password);

        boolean loggedIn = login.login();
        if(loggedIn){
            return "redirect:/main";
        }
        else{
            return "login.html";
        }

    }
}
