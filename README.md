# API de Gerenciamento de Ninjas e Missões

## 📝 Sobre o Projeto

Este projeto é uma API RESTful desenvolvida em Java e Spring Boot para o gerenciamento de Ninjas e suas respectivas Missões. A aplicação permite realizar operações de CRUD (Criar, Ler, Atualizar e Deletar) para ambas as entidades, sendo um excelente exemplo prático de uma aplicação backend bem estruturada.

Considerando seu perfil, este projeto é um ótimo portfólio para demonstrar suas habilidades em Java e Spring na sua transição de carreira para a área de desenvolvimento.

## ✨ Funcionalidades

  * **CRUD de Ninjas:**
      * Cadastrar um novo ninja.
      * Listar todos os ninjas.
      * Buscar um ninja por ID.
      * Atualizar os dados de um ninja.
      * Deletar um ninja.
        
  * **CRUD de Missões:**
      * Cadastrar uma nova missão.
      * Listar todas as missões.
      * Buscar uma missão por ID.
      * Atualizar uma missão.
      * Deletar uma missão.

## 🚀 Tecnologias Utilizadas

  * **Java 17**
  * **Spring Boot 3**
  * **Spring Data JPA**
  * **Spring Web**
  * **Maven**
  * **Banco de Dados H2 (em memória)**
  * **Lombok**

## 🏁 Como Executar o Projeto

Siga os passos abaixo para executar a API em seu ambiente local.

### Pré-requisitos

  * **Java 17 ou superior** instalado.
  * **Maven** instalado e configurado.
  * Um cliente de API, como **Postman** ou **Insomnia**, para testar os endpoints.

### Passos

1.  **Clone o repositório:**

    ```bash
    git clone https://github.com/DIEGOAPICELLO/Java10x.git
    ```

2.  **Acesse o diretório correto do projeto:**

    ```bash
    cd Java10x/ninja-missions
    ```

3.  **Compile e execute o projeto com o Maven:**

    ```bash
    mvn spring-boot:run
    ```

A API estará em execução e acessível em `http://localhost:8080`.

## ⚙️ Endpoints da API

A seguir estão os endpoints disponíveis para interagir com a API.

### Ninjas

  * `POST /ninjas` - Cria um novo ninja.
  * `GET /ninjas` - Lista todos os ninjas.
  * `GET /ninjas/{id}` - Busca um ninja pelo ID.
  * `PUT /ninjas/{id}` - Atualiza os dados de um ninja.
  * `DELETE /ninjas/{id}` - Deleta o registro de um ninja.

**Exemplo de corpo (JSON) para criar um novo ninja (`POST /ninjas`):**

```json
{
    "name": "Naruto Uzumaki",
    "email": "naruto@konoha.com",
    "age": 17
}
```

### Missões

  * `POST /missoes` - Cria uma nova missão.
  * `GET /missoes` - Lista todas as missões.
  * `GET /missoes/{id}` - Busca uma missão pelo ID.
  * `PUT /missoes/{id}` - Atualiza uma missão.
  * `DELETE /missoes/{id}` - Deleta uma missão.

**Exemplo de corpo (JSON) para criar uma nova missão (`POST /missoes`):**

```json
{
    "name": "Resgatar o Sasuke",
    "dificuldadeMissao": "RANK_A"
}
```

**Observação:** Os valores para `dificuldadeMissao` são definidos pelo Enum e podem ser `RANK_D`, `RANK_C`, `RANK_B`, `RANK_A`, 

## ✒️ Autor

  * **Diego Apicello** - [GitHub](https://www.google.com/search?q=https://github.com/DIEGOAPICELLO)
