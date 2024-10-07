# Projeto: Sistema de Gerenciamento de Tarefas com MVC

## Estrutura do Projeto:

- Model: Representa a estrutura de uma tarefa e mantém a lista de tarefas.
- View: Responsável por exibir as informações e interagir com o usuário (entrada e saída no console).
- Controller: Intermediário entre o modelo e a visão, gerenciando a lógica de negócios e o fluxo de dados.

/src

  /model

    Tarefa.java
    GerenciadorTarefas.java
  
  /view
  
    TarefaView.java
  
  /controller
  
    TarefaController.java

Main.java

---

# Explicação do Projeto:

## Model:

Tarefa: Representa uma tarefa individual com um ID, uma descrição e um status de completa ou incompleta.
GerenciadorTarefas: Gerencia a lista de tarefas, permitindo adicionar novas e marcar como completas.
View:

TarefaView: Responsável por exibir as tarefas e solicitar informações ao usuário, como a descrição de uma nova tarefa ou o ID de uma tarefa a ser marcada como completa.

## Controller:

TarefaController: Faz a ponte entre o GerenciadorTarefas e a TarefaView, recebendo entradas da visão, atualizando o modelo e retornando resultados para a visão exibir.

## Main:

Um menu simples no console permite ao usuário interagir com o sistema, adicionando tarefas, listando-as ou marcando-as como completas.
