# Introdução ao Postman

## O que é o Postman?

Postman é uma plataforma amplamente utilizada para desenvolvimento e testes de APIs. Ele permite aos desenvolvedores enviar requisições HTTP, visualizar respostas e realizar testes automáticos, facilitando o trabalho com APIs RESTful e simplificando o processo de desenvolvimento e depuração de endpoints.

## Principais Funcionalidades do Postman

1. **Envio de Requisições HTTP**: Permite enviar requisições GET, POST, PUT, DELETE e outras.
2. **Coleções de Requisições**: Agrupe várias requisições em uma coleção, permitindo testes organizados e reutilizáveis.
3. **Ambientes**: Crie variáveis de ambiente para gerenciar diferentes configurações (como URLs e tokens de acesso) sem precisar editar cada requisição manualmente.
4. **Testes Automatizados**: Utilize scripts para validar automaticamente as respostas das requisições e gerar relatórios.
5. **Documentação e Compartilhamento**: Documente e compartilhe suas APIs com a equipe de forma colaborativa.

## Instalando o Postman

Para instalar o Postman, siga os passos abaixo:

1. Acesse o site oficial: [https://www.postman.com/downloads/](https://www.postman.com/downloads/).
2. Escolha a versão para o seu sistema operacional (Windows, macOS, ou Linux).
3. Após o download, execute o instalador e siga as instruções.

## Como Usar o Postman: Passo a Passo

### 1. Criando uma Requisição Simples

1. Abra o Postman e clique em **"New"** > **"Request"** para criar uma nova requisição.
2. Insira o URL do endpoint no campo de URL e escolha o método HTTP (GET, POST, etc.).
3. Clique em **"Send"** para enviar a requisição e visualize a resposta na seção inferior.

### 2. Usando Variáveis de Ambiente

1. Crie um ambiente no Postman clicando em **"Environment"** > **"Add"**.
2. Defina variáveis, como `baseURL` para armazenar a URL da API.
3. Em uma requisição, utilize `{{baseURL}}/endpoint` para substituir automaticamente o valor da variável.

### 3. Automatizando Testes de Resposta

Você pode adicionar scripts de teste para validar automaticamente a resposta de uma requisição:

1. Na aba **"Tests"** da sua requisição, insira um script JavaScript. Exemplo:
   ```javascript
   pm.test("Status code is 200", function () {
       pm.response.to.have.status(200);
   });

2. Clique em **"Send"** e o teste será executado automaticamente, informando se o código de status foi 200.

### 4. Criando Coleções

Para organizar várias requisições em um projeto:

Clique em **"New"** > **"Collection"** e dê um nome à coleção.
Arraste suas requisições para dentro da coleção ou crie novas diretamente dentro dela.
Execute todas as requisições da coleção de uma só vez, clicando em "Run".