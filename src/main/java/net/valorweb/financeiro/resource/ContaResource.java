package net.valorweb.financeiro.resource;

import net.valorweb.financeiro.model.Conta;
import net.valorweb.financeiro.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/contas")
public class ContaResource {

    @Autowired
    ContaService service;

    @GetMapping
    public ResponseEntity<List<Conta>> listAll(){

        return ResponseEntity.ok().body(service.findAll());

    }


    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public Conta create(@RequestBody Conta obj){
       return service.save(obj);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        service.delete(id);
    }



}
