package org.example.view;

import org.example.model.Tarefa;
import java.util.List;
import java.util.Scanner;

public class TarefaView {
    private Scanner scanner;

    public TarefaView() {
        this.scanner = new Scanner(System.in);
    }

    // Exibir todas as tarefas para o usuário
    public void exibirTarefas(List<Tarefa> tarefas) {
        System.out.println("\nTarefas:");
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            for (Tarefa tarefa : tarefas) {
                System.out.println(tarefa);
            }
        }
    }

    // Coletar nova tarefa do usuário
    public String solicitarDescricaoTarefa() {
        System.out.print("\nDigite a descrição da nova tarefa: ");
        return scanner.nextLine();
    }

    // Coletar ID da tarefa a ser marcada como completa
    public int solicitarIdTarefa() {
        System.out.print("\nDigite o ID da tarefa que deseja marcar como completa: ");
        return scanner.nextInt();
    }

    // Exibir mensagem de sucesso ou erro ao marcar tarefa como completa
    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}

