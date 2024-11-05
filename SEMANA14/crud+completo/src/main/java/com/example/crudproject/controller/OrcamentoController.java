package com.example.crudproject.controller;


import com.example.crudproject.model.Orcamento;
import com.example.crudproject.service.OrcamentoService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orcamento")
public class OrcamentoController {

    @Autowired
    private OrcamentoService orcamentoService;

    @PostMapping
    public Orcamento criarOrcamento(@RequestBody Orcamento orcamento){
        return orcamentoService.insertOrcamento(orcamento);
    }

    @GetMapping
    public List<Orcamento> listarOrcamento(){
        return orcamentoService.selectAllOrcamento();
    }

    @PutMapping("/{id}/aprovar")
    public Orcamento aprovarOrcamento(@PathVariable int id){
        return orcamentoService.aprovarOrcamento(id);
    }

    @GetMapping("/{id}")
    public Orcamento buscarById(@PathVariable int id){
        return orcamentoService.selectOrcamentoById(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id){
        orcamentoService.deletarOrcamento(id);
    }
}
