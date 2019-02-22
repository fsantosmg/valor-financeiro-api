package net.valorweb.financeiro.service;

import net.valorweb.financeiro.model.Categoria;
import net.valorweb.financeiro.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepository repository;

    public List<Categoria> findAll() {
        return repository.findAll();
    }

    public Categoria save(Categoria obj) {
        return repository.save(obj);
    }

    public void delete(Long id) {

        repository.delete(findById(id));
    }

    public Categoria findById(Long id) {

        return repository.findById(id).orElse(null);
    }
}
