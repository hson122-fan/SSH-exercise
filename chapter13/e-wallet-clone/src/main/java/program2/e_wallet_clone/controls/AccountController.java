package program2.e_wallet_clone.controls;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import program2.e_wallet_clone.models.Account;
import program2.e_wallet_clone.models.TransferRequest;
import program2.e_wallet_clone.services.TransferService;


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
