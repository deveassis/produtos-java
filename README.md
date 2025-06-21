# Produtos Java API

API RESTful desenvolvida em **Java com Spring Boot** para gerenciamento de produtos. Esta aplicação permite realizar operações CRUD (Create, Read, Update, Delete) em uma base de dados.

## 🛠️ Tecnologias utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 Database (banco de dados em memória)
- Maven
- Git

## 📌 Funcionalidades

- ✅ Criar produto (POST `/produtos`)
- ✅ Listar todos os produtos (GET `/produtos`)
- ✅ Buscar produto por ID (GET `/produtos/{id}`)
- ✅ Atualizar produto (PUT `/produtos/{id}`)
- ✅ Deletar produto (DELETE `/produtos/{id}`)

## 🚀 Como executar o projeto

### Pré-requisitos

- Java 17 instalado
- Maven instalado

### Passos

1. Clone o repositório:
   ```bash
   git clone https://github.com/deveassis/produtos-java.git
   cd produtos-java


Execute o projeto:

bash
Copiar
Editar
./mvnw spring-boot:run
Acesse:

API: http://localhost:8080/produtos

Console H2: http://localhost:8080/h2-console

🧪 Testes da API
Você pode testar os endpoints usando ferramentas como:

Postman

Insomnia

cURL

Exemplo de JSON para criação de produto:
json
Copiar
Editar
{
"nome": "Notebook",
"preco": 4500.00,
"quantidade": 10
}
📂 Estrutura do Projeto
css
Copiar
Editar
src/
├── main/
│   ├── java/
│   │   └── com.exemplo.produtos/
│   │       ├── controller/
│   │       ├── model/
│   │       ├── repository/
│   │       └── ProdutosApiApplication.java
│   └── resources/
│       ├── application.properties
│       └── data.sql (opcional)
✍️ Autor
Gabriel Assis