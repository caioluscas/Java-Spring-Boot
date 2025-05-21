# 🛠️ CRUD de Produtos com Java Spring Boot

Este projeto é um exemplo simples de uma API REST para gerenciamento de produtos, utilizando **Java com Spring Boot**. O objetivo principal foi praticar os conceitos de CRUD (Create, Read, Update, Delete) e o uso de banco de dados em memória com **H2 Database**.

---

## 🚀 Tecnologias utilizadas

- ✅ Java 17+
- ✅ Spring Boot
    - `spring-boot-starter-web`
    - `spring-boot-starter-data-jpa`
    - `spring-boot-devtools`
- ✅ H2 Database (apenas para testes)
- ✅ Lombok

---

## 💡 Observação importante

> ⚠️ **O H2 Database foi usado apenas para fins de aprendizado.**  
> Ele é um banco de dados em memória e, por isso, **os dados são apagados assim que a aplicação é finalizada**.  
> **Não recomendado para produção.**

---

## ▶️ Como executar o projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/caioluscas/Java-Spring-Boot.git
   cd produtosapi
2. Abra em sua IDE (Eclipse, IntelliJ, VS Code)
3. Rode o projeto (pelo botão "Run" ou com o comando):
    ```bash
    ./mvnw spring-boot:run

4. Acesse a API no Postman:
   http://localhost:8080/produtos
5. Acesse o console do H2 (opcional):
   http://localhost:8080/h2-console

## 📸 Demonstração
![ezgif-2f0c61a6907952.gif](..%2F..%2F..%2F..%2FDownloads%2Fezgif-2f0c61a6907952.gif)
https://www.linkedin.com/posts/caio-lucas-7951b01a3_java-springboot-backend-activity-7330287515574145024-goKD?utm_source=share&utm_medium=member_desktop&rcm=ACoAAC-Me2EB6adaBvAo--FAC9JRoiVw_i54KK8