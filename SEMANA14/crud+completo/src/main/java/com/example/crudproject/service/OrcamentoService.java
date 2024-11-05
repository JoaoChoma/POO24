package com.example.crudproject.service;

import com.example.crudproject.model.Orcamento;
import com.example.crudproject.repository.OrcamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrcamentoService {

    @Autowired
    private OrcamentoRepository orcamentoRepository;

    public Orcamento insertOrcamento(Orcamento orcamento){
        return orcamentoRepository.save(orcamento);
    }

    public List<Orcamento> selectAllOrcamento(){
        return orcamentoRepository.findAll();
    }

    // select * from orcamento where "id"=id
    public Orcamento selectOrcamentoById(int id){
        Optional<Orcamento> oc = orcamentoRepository.findById(id);
        if(oc.isPresent()){
            return oc.get();
        }else{
            throw new RuntimeException("Orcamento nao encotrado.");
        }
    }

    // status Pendente -> Aprovado

    public Orcamento aprovarOrcamento(int id){
        Orcamento oc = selectOrcamentoById(id);
        oc.setStatus("Aprovado");
        return orcamentoRepository.save(oc);
    }

    public void deletarOrcamento(int id){
        orcamentoRepository.deleteById(id);
    }
}
