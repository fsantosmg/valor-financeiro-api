package net.valorweb.financeiro.service;

import net.valorweb.financeiro.model.Categoria;
import net.valorweb.financeiro.model.Conta;
import net.valorweb.financeiro.model.Empresa;
import net.valorweb.financeiro.repository.CategoriaRepository;
import net.valorweb.financeiro.repository.ContaRepository;
import net.valorweb.financeiro.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;

@Service
public class DBService {

    @Autowired
    private ContaRepository contaRepository;

    @Autowired
    private EmpresaRepository empresaRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    public void instantiateTestDataBase() throws ParseException{
        insertConta();

        insertEmpresa();

        insertCategoria();


    }

    private void insertCategoria() {
        Categoria receita = new Categoria(null,null,empresaRepository.getOne(1L),"Receita", 1);
        Categoria despesa = new Categoria(null,null,empresaRepository.getOne(1L),"Despesa", -1);
        categoriaRepository.save(receita);
        categoriaRepository.save(despesa);

    }

    private void insertConta() {
        Conta conta = new Conta(null, "caixa", "caixa local", new Date(), BigDecimal.ZERO, Boolean.TRUE);
        contaRepository.save(conta);
    }

    private void insertEmpresa() {
        Empresa empresa = new Empresa(null, "ValorWeb");
        empresaRepository.save(empresa);
    }
}
