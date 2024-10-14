# ARQUITETURA MVC

1. Model (Modelo):
O Model representa os dados e a lógica de negócios. Vamos criar uma classe User que representa um usuário no sistema.

2. View (Visão):
A View será responsável por exibir informações ao usuário e coletar as entradas. Será uma interface simples de console.

3. Controller (Controlador):
O Controller controla o fluxo de dados entre o Model e a View. Ele processa as entradas do usuário e atualiza os dados do Model.

---

# PROJETO

O projeto será um Sistema de Cadastro de Usuários, que permite adicionar, visualizar e listar usuários.

# Estrutura do projeto 
* /src
  * /model
    * User.java
  * /view
    * UserView.java
  * /controller
    * UserController.java
    * Main.java
