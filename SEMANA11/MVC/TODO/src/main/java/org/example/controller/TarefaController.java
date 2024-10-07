package org.example.controller;

import org.example.model.GerenciadorTarefas;
import org.example.view.TarefaView;

public class TarefaController {
    private GerenciadorTarefas gerenciadorTarefas;
    private TarefaView tarefaView;

    public TarefaController(GerenciadorTarefas gerenciadorTarefas, TarefaView tarefaView) {
        this.gerenciadorTarefas = gerenciadorTarefas;
        this.tarefaView = tarefaView;
    }

    // Método para adicionar uma nova tarefa
    public void adicionarTarefa() {
        String descricao = tarefaView.solicitarDescricaoTarefa();
        gerenciadorTarefas.adicionarTarefa(descricao);
        tarefaView.exibirMensagem("Tarefa adicionada com sucesso!");
    }

    // Método para listar todas as tarefas
    public void listarTarefas() {
        tarefaView.exibirTarefas(gerenciadorTarefas.listarTarefas());
    }

    // Método para marcar tarefa como completa
    public void marcarTarefaComoCompleta() {
        int id = tarefaView.solicitarIdTarefa();
        boolean sucesso = gerenciadorTarefas.marcarTarefaComoCompleta(id);
        if (sucesso) {
            tarefaView.exibirMensagem("Tarefa marcada como completa!");
        } else {
            tarefaView.exibirMensagem("Tarefa não encontrada!");
        }
    }
}
