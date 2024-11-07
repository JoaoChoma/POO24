package com.escolha.matricula.controller;

import com.escolha.matricula.model.Aluno;
import com.escolha.matricula.model.Disciplina;
import com.escolha.matricula.service.AlunoService;
import com.escolha.matricula.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @Autowired
    private DisciplinaService disciplinaService;

    @GetMapping
    public List<Aluno> getAllAlunos() {
        return alunoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Aluno> getAlunoById(@PathVariable Long id) {
        return alunoService.findById(id);
    }

    @PostMapping("/{disciplinaId}")
    public Aluno createAluno(@PathVariable Long disciplinaId, @RequestBody Aluno aluno) {
        Optional<Disciplina> disciplina = disciplinaService.findById(disciplinaId);
        if (disciplina.isPresent()) {
            aluno.setDisciplina(disciplina.get());
            return alunoService.save(aluno);
        } else {
            throw new RuntimeException("Disciplina não encontrada com o id: " + disciplinaId);
        }
    }

    @PutMapping("/{id}")
    public Aluno updateAluno(@PathVariable Long id, @RequestBody Aluno updatedAluno) {
        return alunoService.findById(id)
                .map(aluno -> {
                    aluno.setNome(updatedAluno.getNome());
                    aluno.setDisciplina(updatedAluno.getDisciplina());
                    return alunoService.save(aluno);
                }).orElseThrow(() -> new RuntimeException("Aluno não encontrado com o id: " + id));
    }

    @DeleteMapping("/{id}")
    public void deleteAluno(@PathVariable Long id) {
        alunoService.deleteById(id);
    }
}


