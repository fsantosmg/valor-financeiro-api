package net.valorweb.financeiro.resource;

import net.valorweb.financeiro.model.Empresa;
import net.valorweb.financeiro.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/empresas")
public class EmpresaResource {

    @Autowired
    EmpresaService service;

    @GetMapping
    public ResponseEntity<List<Empresa>> listAll(){

        return ResponseEntity.ok().body(service.findAll());

    }


    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public Empresa create(@RequestBody Empresa obj){
       return service.save(obj);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        service.delete(id);
    }



}
