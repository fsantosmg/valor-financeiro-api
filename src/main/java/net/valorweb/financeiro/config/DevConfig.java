package net.valorweb.financeiro.config;

import net.valorweb.financeiro.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.text.ParseException;

@Configuration
@Profile("dev")
public class DevConfig {

    @Autowired
    private DBService dbService;

    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String dbStrategy;

    @Bean
    public boolean instantiateDatabase() throws ParseException {

        if ("create-drop".equals(dbStrategy)) {

            dbService.instantiateTestDataBase();
            return true;
        }

        return false;
    }
}
