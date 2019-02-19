package net.valorweb.financeiro.service;

import net.valorweb.financeiro.model.Conta;
import net.valorweb.financeiro.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;

@Service
public class DBService {

    @Autowired
    private ContaRepository contaRepository;

    public void instantiateTestDataBase() throws ParseException{
        Conta conta = new Conta(null, "caixa", "caixa local", new Date(), BigDecimal.ZERO, Boolean.TRUE);
        contaRepository.save(conta);
    }
}
