package program1.e_wallet.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import program1.e_wallet.exceptions.AccountNotFoundException;
import program1.e_wallet.models.Account;
import program1.e_wallet.repos.AccountRepository;


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
        Account sender = repo.findById(idSender)
                            .orElseThrow(() -> new AccountNotFoundException());
        Account receiver = repo.findById(idReceiver)
                            .orElseThrow(() -> new AccountNotFoundException());

        BigDecimal senderNewAmount = sender.getAmount().subtract(amount);
        BigDecimal receiverNewAmount = receiver.getAmount().add(amount);

        repo.changeAmount(idSender, senderNewAmount);
        repo.changeAmount(idReceiver, receiverNewAmount);
    }

    public Iterable<Account> getAllAccounts(){
        return repo.findAll();
    }

    public List<Account> findAccountsByName(String name){
        return repo.findAccountsByName(name);
    }
}
