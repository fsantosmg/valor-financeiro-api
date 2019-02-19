package net.valorweb.financeiro.resource;

import net.valorweb.financeiro.model.Conta;
import net.valorweb.financeiro.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/contas")
public class ContaResource {

    @Autowired
    ContaService contaService;

    @GetMapping
    public ResponseEntity<List<Conta>> listAll(){

        return ResponseEntity.ok().body(contaService.findAll());

    }


}
