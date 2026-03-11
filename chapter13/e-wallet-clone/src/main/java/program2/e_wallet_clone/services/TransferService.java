package program2.e_wallet_clone.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import program2.e_wallet_clone.models.Account;
import program2.e_wallet_clone.repos.AccountRepository;

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

        System.out.println("sender before: " + repo.findAccoundById(idSender).getAmount());
        System.out.println("receiver before: " + repo.findAccoundById(idReceiver).getAmount());

        repo.changeAmount(idSender, senderNewAmount);
        repo.changeAmount(idReceiver, receiverNewAmount);

        System.out.println("sender after: " + repo.findAccoundById(idSender).getAmount());
        System.out.println("receiver after: " + repo.findAccoundById(idReceiver).getAmount());

        throw new RuntimeException("Oh no, where is transaction!!!");
    }

    public List<Account> getAllAccounts(){
        return repo.findAllAccount();
    }
}
