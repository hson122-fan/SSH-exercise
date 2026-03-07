package program1.ch8_ex1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class MainController {
    
    @RequestMapping("/home")
    public String home(Model page){
        page.addAttribute("username", "Son");
        page.addAttribute("color", "red");

        return "home.html";
    }
}
