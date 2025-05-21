# 📚 Repositório de Projetos Spring Boot

Este repositório contém pequenos projetos desenvolvidos com **Java + Spring Boot**, com o objetivo de praticar APIs REST, persistência de dados com JPA, testes com Postman e integração com banco de dados.

---

## 📁 Projetos

### 🔹 [`produtosapi`](./produtosapi)
API simples de CRUD de produtos, criada para praticar os conceitos de:
- Spring Boot + Spring Data JPA
- Banco de dados **H2 (em memória)**, usado apenas para testes
- Requisições HTTP com mapeamentos `@GetMapping`, `@PostMapping`, etc.
- Testes com **Postman**
- Lombok para facilitar a criação de classes

📎 Veja o [README do projeto Produtos](./produtosapi/README.md)

---

### 🔹 [`libraryapi`](./libraryapi/README.md)
API de gerenciamento de uma biblioteca fictícia, com integração real com banco de dados.

Recursos utilizados:
- Spring Boot + Spring Data JPA
- Banco de dados **PostgreSQL**
- Uso do **Docker** para subir o container do banco de dados
- Mapeamentos RESTful com Spring MVC
- Lombok
- Postman para testes

📎 Veja o [README do projeto Library](./libraryapi/README.md)

---

## 🛠️ Tecnologias em comum

- Java 17+
- Spring Boot
- Spring Data JPA
- Lombok
- Postman (para testar as APIs)
- Docker (no projeto `libraryapi`)

---

Sinta-se à vontade para explorar os projetos, clonar, testar e sugerir melhorias! 😄
