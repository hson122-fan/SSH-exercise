package program1.e_wallet_app.models;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AccountRowMapper implements RowMapper<Account> {
    
    @Override
    public Account mapRow(ResultSet resultSet, int i) throws SQLException{
        Account a = new Account();
        a.setId(resultSet.getLong("id"));
        a.setName(resultSet.getString("name"));
        a.setAmount(resultSet.getBigDecimal("amount"));
        return a;
    }
}
