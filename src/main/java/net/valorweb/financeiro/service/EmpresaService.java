package net.valorweb.financeiro.service;

import net.valorweb.financeiro.model.Empresa;
import net.valorweb.financeiro.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {

    @Autowired
    EmpresaRepository repository;

    public List<Empresa> findAll() {
        return repository.findAll();
    }

    public Empresa save(Empresa obj) {
        return repository.save(obj);
    }

    public void delete(Long id) {

        repository.delete(findById(id));
    }

    public Empresa findById(Long id) {

        return repository.findById(id).orElse(null);
    }
}
