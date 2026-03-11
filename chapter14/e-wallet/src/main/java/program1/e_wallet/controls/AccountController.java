package program1.e_wallet.controls;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import program1.e_wallet.models.Account;
import program1.e_wallet.models.TransferRequest;
import program1.e_wallet.services.TransferService;


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
    public Iterable<Account> getAllAccount(){
        return trans.getAllAccounts();
    }
}
