package program1.e_wallet_app.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import program1.e_wallet_app.models.Account;
import program1.e_wallet_app.repos.AccountRepository;

@Service
public class TransferService {
    
    private AccountRepository repo;
    public TransferService(AccountRepository repo){
        this.repo = repo;
    }

    @Transactional
    public void transferMoney(
        Long idSender,
        Long idReceiver,
        BigDecimal amount
    ){
        Account sender = repo.findAccoundById(idSender);
        Account receiver = repo.findAccoundById(idReceiver);

        BigDecimal senderNewAmount = sender.getAmount().subtract(amount);
        BigDecimal receiverNewAmount = receiver.getAmount().add(amount);

        repo.changeAmount(idSender, senderNewAmount);
        repo.changeAmount(idReceiver, receiverNewAmount);
    }

    public List<Account> getAllAccounts(){
        return repo.findAllAccount();
    }
}
