package com.escolha.matricula.controller;

import com.escolha.matricula.model.Disciplina;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.escolha.matricula.service.DisciplinaService;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {

    @Autowired
    private DisciplinaService disciplinaService;

    @GetMapping
    public List<Disciplina> getAllDisciplinas() {
        return disciplinaService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Disciplina> getDisciplinaById(@PathVariable Long id) {
        return disciplinaService.findById(id);
    }

    @PostMapping
    public Disciplina createDisciplina(@RequestBody Disciplina disciplina) {
        return disciplinaService.save(disciplina);
    }

    @PutMapping("/{id}")
    public Disciplina updateDisciplina(@PathVariable Long id, @RequestBody Disciplina updatedDisciplina) {
        return disciplinaService.findById(id)
                .map(disciplina -> {
                    disciplina.setNome(updatedDisciplina.getNome());
                    return disciplinaService.save(disciplina);
                }).orElseThrow(() -> new RuntimeException("Disciplina não encontrada com o id: " + id));
    }

    @DeleteMapping("/{id}")
    public void deleteDisciplina(@PathVariable Long id) {
        disciplinaService.deleteById(id);
    }
}
