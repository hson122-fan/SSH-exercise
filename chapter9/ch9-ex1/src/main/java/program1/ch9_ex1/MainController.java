package program1.ch9_ex1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import program1.ch9_ex1.login.LoggedUser;
import program1.ch9_ex1.login.LoginCount;


@Controller
public class MainController {
    private final LoggedUser loggedUser;
    private final LoginCount countUser;

    public MainController(LoggedUser loggedUser, LoginCount count){
        this.loggedUser = loggedUser;
        this.countUser = count;
    }

    @GetMapping("/main")
    public String home(
        @RequestParam(required = false) String logout,
        Model model
    ){

        if(logout != null){
            loggedUser.setUsername(null);
        }
        if(loggedUser.getUsername() == null){
            return "redirect:/";
        }

        model.addAttribute("username", loggedUser.getUsername());
        model.addAttribute("loginCount", this.countUser.getCount());
        return "main.html";
    }
}
