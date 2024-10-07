package org.example.model;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {

    private List<Tarefa> tarefas;
    private int contadorId;

    public GerenciadorTarefas() {
        this.tarefas = new ArrayList<>();
        this.contadorId = 1;
    }


    public void adicionarTarefa(String descricao) {
        Tarefa novaTarefa = new Tarefa(contadorId++, descricao);
        tarefas.add(novaTarefa);
    }

    public List<Tarefa> listarTarefas() {
        return tarefas;
    }

    // Método para marcar uma tarefa como completa
    public boolean marcarTarefaComoCompleta(int id) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() == id) {
                tarefa.setCompleta(true);
                return true;
            }
        }
        return false;
    }
}
