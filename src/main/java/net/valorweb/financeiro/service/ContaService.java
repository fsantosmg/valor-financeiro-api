package net.valorweb.financeiro.service;

import net.valorweb.financeiro.model.Conta;
import net.valorweb.financeiro.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContaService {

    @Autowired
    ContaRepository repository;

    public List<Conta> findAll() {
        return repository.findAll();
    }

    public Conta save(Conta obj) {
        return repository.save(obj);
    }

    public void delete(Long id) {

        repository.delete(findById(id));
    }

    public Conta findById(Long id) {

        return repository.findById(id).orElse(null);
    }
}
