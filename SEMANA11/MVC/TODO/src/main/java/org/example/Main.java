package org.example;

import org.example.controller.TarefaController;
import org.example.model.GerenciadorTarefas;
import org.example.view.TarefaView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GerenciadorTarefas gerenciadorTarefas = new GerenciadorTarefas();
        TarefaView tarefaView = new TarefaView();
        TarefaController controller = new TarefaController(gerenciadorTarefas, tarefaView);

        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("\nSistema de Gerenciamento de Tarefas");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Marcar Tarefa como Completa");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    controller.adicionarTarefa();
                    break;
                case 2:
                    controller.listarTarefas();
                    break;
                case 3:
                    controller.marcarTarefaComoCompleta();
                    break;
                case 4:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}