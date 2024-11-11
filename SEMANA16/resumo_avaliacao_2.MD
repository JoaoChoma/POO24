# Programação Orientada a Objetos (POO) e Spring Boot

## Introdução à Programação Orientada a Objetos (POO)

A Programação Orientada a Objetos (POO) é um paradigma de programação que organiza o código em torno de objetos. Cada objeto representa uma entidade do mundo real e possui atributos (propriedades) e métodos (comportamentos). A POO possui quatro pilares fundamentais:

**Encapsulamento:** Restrição de acesso direto a partes específicas de um objeto, permitindo interações controladas.

**Abstração:** Simplificação de conceitos complexos, expondo apenas os aspectos essenciais.

**Herança:** Capacidade de uma classe derivar características de outra, promovendo reutilização.

**Polimorfismo:** Habilidade de diferentes classes responderem ao mesmo método de maneiras distintas.

## Introdução ao Spring Boot

O Spring Boot é um framework Java baseado no Spring Framework, projetado para facilitar a criação de aplicações web e serviços. Ele simplifica o processo de configuração do projeto, permitindo o desenvolvimento rápido e a criação de APIs RESTful.

### Criando um Novo Projeto no Spring Initializr

Para iniciar um novo projeto Spring Boot, siga os passos abaixo:

+ Acesse o Spring Initializr.
+ Configure as opções do projeto:
+ Project: Selecione "Maven Project" ou "Gradle Project".
+ Language: Escolha "Java".
+ Spring Boot Version: Recomenda-se usar a versão estável mais recente.
+ Preencha os campos Group (por exemplo, com.exemplo) e Artifact (nome do projeto).

`Em Dependencies, adicione as dependências necessárias, como:`

    - Spring Web para criar APIs RESTful.
    - Spring Data JPA para integração com banco de dados.
    - H2 Database ou MySQL para o banco de dados (se necessário).
+ Clique em Generate para baixar o projeto.
+ Extraia o arquivo e importe o projeto em uma IDE, como IntelliJ IDEA.

### Arquitetura em Camadas no Spring Boot

Ao desenvolver uma aplicação Spring Boot, utilizamos uma arquitetura em camadas para separar responsabilidades. As principais camadas são:

**1. Model**

A camada Model representa a estrutura de dados da aplicação, ou seja, as entidades. Cada classe de entidade corresponde a uma tabela no banco de dados e contém atributos com suas respectivas anotações JPA.

Exemplo:

```java
@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Double preco;
    // Getters e Setters
}
```

**2. Repository**

A camada Repository é responsável pela comunicação com o banco de dados. Usando Spring Data JPA, podemos criar interfaces que herdam de JpaRepository, ganhando métodos para operações CRUD (Create, Read, Update, Delete) sem escrever código SQL manualmente.

Exemplo:

```java
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
```

**3. Service**

A camada Service contém a lógica de negócio da aplicação. É aqui que implementamos as regras de negócio e coordenamos as operações entre o Model e o Repository.

Exemplo:

```java
@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }
    
    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }
}
```

**4. Controller**

A camada Controller é responsável por gerenciar as requisições HTTP e interagir com a camada Service para manipular os dados. Cada método na classe Controller mapeia uma rota (endpoint) e responde a diferentes métodos HTTP (GET, POST, PUT, DELETE).

Exemplo:

```java
@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public List<Produto> listarTodos() {
        return produtoService.listarTodos();
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        return produtoService.salvar(produto);
    }
}
```

## Endpoints e Testes no Postman

**O que são Endpoints?**

Endpoints são os pontos de entrada da API, onde diferentes rotas e métodos HTTP permitem que os usuários interajam com os dados e funcionalidades da aplicação. Em uma API RESTful, os principais métodos HTTP são:

`GET:` Recupera dados.

`POST:` Cria novos dados.

`PUT:` Atualiza dados existentes.

`DELETE:` Remove dados.

**Como Testar Endpoints no Postman**

O Postman é uma ferramenta popular para testar APIs. Aqui está um guia básico para usá-lo:

+ Criar uma Nova Requisição: Abra o Postman e clique em “New” > “Request”.
+ Selecionar Método HTTP e URL: Escolha o método (GET, POST, PUT, DELETE) e insira o URL do endpoint, como http://localhost:8080/produtos.
+ Configurar o Corpo da Requisição (POST/PUT): Para requisições POST ou PUT, vá até a aba “Body”, selecione “raw” e escolha “JSON”. Insira o JSON com os dados necessários, por exemplo:

```json
{
    "nome": "Produto Exemplo",
    "preco": 29.99
}
````

+ Enviar Requisição e Analisar a Resposta: Clique em “Send” para enviar a requisição e ver a resposta no painel inferior. A resposta mostrará o status e dados retornados pela API.

Com o Postman, é possível verificar o funcionamento de cada endpoint e confirmar se o sistema responde conforme esperado.

