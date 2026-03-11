package program1.e_wallet.repos;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import program1.e_wallet.models.Account;

// import java.math.BigDecimal;
// import java.util.List;

// import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.stereotype.Repository;

// import program1.e_wallet.models.Account;
// import program1.e_wallet.models.AccountRowMapper;


// @Repository
// public class AccountRepository extends <Account, Long>{
//     private final JdbcTemplate jdbc;
    
//     public AccountRepository(JdbcTemplate jdbc){
//         this.jdbc = jdbc;
//     }

//     public Account findAccoundById(Long id){
//         String sql = "SELECT * FROM account where id = ?";
//         return jdbc.queryForObject(sql, new AccountRowMapper(), id);
//     }

//     public void changeAmount(Long id, BigDecimal amount){
//         String sql = "update account set amount = ? where id = ?";
//         jdbc.update(sql, amount, id);
//     }

//     public List<Account> findAllAccount(){
//         String sql = "select * from account";
//         return jdbc.query(sql, new AccountRowMapper());
//     }
// }

public interface AccountRepository extends CrudRepository<Account, Long>{

    @Query("select * from account where name = :name")
    List<Account> findAccountsByName(String name);

    @Query("select * from account where id = :id")
    Account findAccountsById(Long id);

    @Modifying
    @Query("update account set amount = :amount where id = :id")
    void changeAmount(Long id, BigDecimal amount);
    
}
