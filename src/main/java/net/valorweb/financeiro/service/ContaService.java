package net.valorweb.financeiro.service;

import net.valorweb.financeiro.model.Conta;
import net.valorweb.financeiro.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaService {

    @Autowired
    ContaRepository contaRepository;

    public List<Conta> findAll() {
        return contaRepository.findAll();
    }
}
