# Sistema de Gerenciamento de Tarefas Kanban

## Descrição
Este projeto implementa uma API REST para gerenciar um quadro **Kanban** de tarefas. O sistema permite a criação, edição, movimentação e exclusão de tarefas através de três colunas principais: **A Fazer (To Do)**, **Em Progresso (In Progress)** e **Concluído (Done)**. Cada tarefa pode ser movida entre essas colunas conforme seu progresso.

## Tecnologias Utilizadas
- **Java Spring Boot**
- **Banco de dados H2** (in-memory)
- **Postman** (para testes de API)
- **JWT (opcional)** para autenticação
- **OAuth2PasswordBearer (opcional)** para segurança adicional

## Requisitos Funcionais
1. **Cadastro de Tarefas (0,5 ponto)**:
   - Cada tarefa deve conter:
     - Título (obrigatório)
     - Descrição (opcional)
     - Data de criação (gerada automaticamente)
     - Status (A Fazer, Em Progresso, Concluído)
     - Prioridade (baixa, média, alta)
     - Data limite (opcional)

2. **Gerenciamento de Tarefas (0,5 ponto)**:
   - Criar novas tarefas na coluna "A Fazer".
   - Listar todas as tarefas organizadas por coluna (A Fazer, Em Progresso, Concluído).
   - Mover uma tarefa entre as colunas do Kanban (A Fazer → Em Progresso → Concluído).
   - Editar uma tarefa (alterar título, descrição, prioridade, etc.).
   - Excluir uma tarefa.

3. **Funcionalidades Extras (0,5 ponto)**:
   - Ordenar tarefas dentro de cada coluna por prioridade.
   - Filtrar tarefas por prioridade e data limite.
   - Gerar um relatório que liste as tarefas por coluna e destaque as tarefas atrasadas (com data limite passada e status não "Concluído").

## Regras de Negócio
- As tarefas só podem ser criadas na coluna "A Fazer".
- A tarefa deve ser movida entre as colunas na ordem: A Fazer → Em Progresso → Concluído.
- O título da tarefa é obrigatório; descrição e data limite são opcionais.

## Endpoints da API

### Tarefas
- **POST** `/tasks`: Criar uma nova tarefa na coluna "A Fazer".
- **GET** `/tasks`: Listar todas as tarefas organizadas por coluna.
- **PUT** `/tasks/{id}/move`: Mover uma tarefa para a próxima coluna.
- **PUT** `/tasks/{id}`: Atualizar uma tarefa (título, descrição, prioridade).
- **DELETE** `/tasks/{id}`: Excluir uma tarefa.

### Exemplos de Requisições com Postman
1. **Criar uma Tarefa**:
   ```http
   POST /tasks
   {
       "title": "Comprar suprimentos",
       "description": "Comprar suprimentos para o escritório",
       "dueDate": "2024-10-30",
       "priority": "alta"
   }

## Autenticação com JWT (Opcional)

Este sistema pode utilizar autenticação via **OAuth2** com **JWT (JSON Web Token)** para proteger os endpoints da API. Quando habilitada, apenas usuários autenticados podem criar, atualizar ou excluir tarefas. O fluxo de autenticação segue o padrão **OAuth2PasswordBearer**, em que o usuário envia suas credenciais (nome de usuário e senha) para receber um token JWT, que deverá ser incluído nas requisições subsequentes para acessar recursos protegidos.

### 1. **Endpoint de Login**:
O primeiro passo para obter um token JWT é enviar uma requisição POST com as credenciais do usuário para o endpoint de login.

#### Exemplo de Requisição para Login:
```http
POST /auth/login
{
  "username": "usuario_exemplo",
  "password": "senha_exemplo"
}