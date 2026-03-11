package program1.ch12_ex1.configs;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class ProjectConfig {
    @Value("${custom.datasource.url}")
    private String datasourceUrl;

    @Value("${custom.datasource.username}")
    private String datasourceUsername;
    
    @Value("${custom.datasource.password}")
    private String datasourcePassword;

    @Bean
    public DataSource dataSource(){
        HikariDataSource dataSourceInstance = new HikariDataSource();
        dataSourceInstance.setJdbcUrl(datasourceUrl);
        dataSourceInstance.setUsername(datasourceUsername);
        dataSourceInstance.setPassword(datasourcePassword); 
        dataSourceInstance.setConnectionTimeout(1000);
        return dataSourceInstance;
    }
}
