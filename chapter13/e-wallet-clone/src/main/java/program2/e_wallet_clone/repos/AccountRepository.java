package program2.e_wallet_clone.repos;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import program2.e_wallet_clone.models.Account;
import program2.e_wallet_clone.models.AccountRowMapper;


@Repository
public class AccountRepository {
    private final JdbcTemplate jdbc;
    
    public AccountRepository(JdbcTemplate jdbc){
        this.jdbc = jdbc;
    }

    public Account findAccoundById(Long id){
        String sql = "SELECT * FROM account where id = ?";
        return jdbc.queryForObject(sql, new AccountRowMapper(), id);
    }

    public void changeAmount(Long id, BigDecimal amount){
        String sql = "update account set amount = ? where id = ?";
        jdbc.update(sql, amount, id);
    }

    public List<Account> findAllAccount(){
        String sql = "select * from account";
        return jdbc.query(sql, new AccountRowMapper());
    }
}
