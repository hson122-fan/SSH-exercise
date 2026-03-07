package program1.ch9_ex1.login;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component
@ApplicationScope
public class LoginCount {
    private int count = 0;

    public void increase(){
        this.count++;
    }

    public int getCount(){
        return this.count;
    }
}
