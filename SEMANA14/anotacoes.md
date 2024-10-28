# Spring Boot

## O que é Spring Boot?

**Spring Boot** é um projeto da **Spring Framework** que simplifica o desenvolvimento de aplicações Java, tornando possível criar aplicações com o mínimo de configuração. Ele proporciona uma maneira rápida de configurar e executar uma aplicação, sem a necessidade de lidar com a complexidade de configurar manualmente uma aplicação Spring tradicional.

Alguns dos principais recursos oferecidos pelo Spring Boot incluem:

- **Configuração automática** (*Auto Configuration*): Ele automaticamente configura vários componentes do Spring Framework com base nas dependências presentes no projeto.
- **Servidor embutido**: Aplicações Spring Boot podem ser executadas em servidores web embutidos, como Tomcat, Jetty ou Undertow, sem a necessidade de configurar ou implantar manualmente um WAR em um servidor externo.
- **Gerenciamento de dependências**: O Spring Boot simplifica o gerenciamento de dependências através de **Starters**, que são pacotes predefinidos com todas as dependências necessárias para uma funcionalidade específica.
- **Pronto para produção**: Fornece ferramentas para monitoramento, métricas e outras funcionalidades úteis para rodar a aplicação em ambiente de produção.

## Por que usar Spring Boot?

Spring Boot é amplamente utilizado para construir **APIs REST**, **aplicações de microserviços** e outras aplicações robustas que exigem escalabilidade, facilidade de desenvolvimento e um ciclo de vida ágil. Ele permite aos desenvolvedores focar na escrita de código de negócios sem se preocupar tanto com configurações.

Algumas vantagens de usar Spring Boot incluem:

- Redução do **tempo de desenvolvimento** devido à configuração mínima.
- **Escalabilidade** por ser projetado para funcionar bem com microsserviços.
- Integração com diversas bibliotecas e tecnologias.
- Extensa **documentação** e suporte da comunidade.

## Como iniciar um projeto com Spring Boot?

Uma das formas mais rápidas e convenientes de iniciar um projeto Spring Boot é utilizando o [**Spring Initializr**](https://start.spring.io/), uma ferramenta online que gera a estrutura básica do projeto Spring Boot. Com o Spring Initializr, você pode configurar as dependências iniciais e baixar um arquivo ZIP contendo o esqueleto do projeto.

### Passos para usar o Spring Initializr:

1. Acesse [start.spring.io](https://start.spring.io/).
2. Selecione as seguintes opções de acordo com suas necessidades:
   - **Projeto**: Escolha **Maven** ou **Gradle**.
   - **Linguagem**: Escolha **Java**.
   - **Versão do Spring Boot**: Escolha a versão mais recente estável.
3. Configure o nome do grupo (**Group**), o nome do artefato (**Artifact**), e outras opções, como **nome da descrição**, **pacote base**, etc.
4. Selecione as **dependências** necessárias para o seu projeto. Por exemplo:
   - **Spring Web** para criar APIs web.
   - **Spring Data JPA** para acesso a banco de dados.
   - **Spring Security** para controle de autenticação e autorização.
5. Clique em **Generate** para baixar o projeto.
6. Importe o projeto baixado no seu IDE de preferência (IntelliJ, Eclipse, VS Code, etc.).

## Links úteis

Aqui estão alguns links importantes para a documentação oficial e outros recursos úteis sobre Spring Boot:

- [Documentação oficial do Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
- [Guia de introdução ao Spring Boot](https://spring.io/guides/gs/spring-boot/)
- [Spring Boot no GitHub](https://github.com/spring-projects/spring-boot)
- [Spring Initializr - Crie seu projeto Spring Boot](https://start.spring.io/)

---

Esse arquivo em markdown oferece uma visão geral do Spring Boot, como iniciar um projeto utilizando o **Spring Initializr**, e links úteis para mais informações. Essa ferramenta facilita a criação de novos projetos Spring Boot com a configuração desejada.


---

## application.properties

spring.application.name=crudproject

spring.datasource.url=jdbc:h2:mem:testdb

spring.datasource.driverClassName=org.h2.Driver

spring.datasource.username=sa

spring.datasource.password=

spring.h2.console.enabled=true

spring.jpa.hibernate.ddl-auto=update

server.port=8090