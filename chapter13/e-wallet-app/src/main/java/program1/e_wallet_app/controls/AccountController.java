package program1.e_wallet_app.controls;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import program1.e_wallet_app.models.Account;
import program1.e_wallet_app.models.TransferRequest;
import program1.e_wallet_app.services.TransferService;

@RestController
public class AccountController {
    private final TransferService trans;

    public AccountController(TransferService trans){
        this.trans = trans;
    }

    @PostMapping("/transfer")
    public void transferMoney(@RequestBody TransferRequest request){
        trans.transferMoney(
            request.getSenderId(),
            request.getReceiverId(),
            request.getAmount()
        );
    }

    @GetMapping("/accounts")
    public List<Account> getAllAccount(){
        return trans.getAllAccounts();
    }
}
