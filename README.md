# RH Ellos - Backend

Sistema de Gestão de Recursos Humanos desenvolvido com Java e Spring Boot, estruturado em arquitetura RESTful seguindo boas práticas de organização em camadas.

---

## 📌 Objetivo do Projeto

Construir uma API robusta para gerenciamento de funcionários, permitindo operações completas de CRUD, servindo como base para integração com frontend moderno e futura expansão para ambiente corporativo.

---

## 🏗 Arquitetura

O projeto segue o padrão em camadas:

- Controller → Responsável pelos endpoints REST
- Service → Regras de negócio
- Repository → Comunicação com banco de dados
- Model → Entidades do sistema

Arquitetura baseada em padrão MVC adaptado para API REST.

---

## 🚀 Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Data JPA
- Maven
- Banco de Dados Relacional
- API REST

---

## 📂 Estrutura do Projeto
src/
└── main/
├── java/
│ ├── controller/
│ ├── service/
│ ├── repository/
│ └── model/
└── resources/

---

## 🔗 Endpoints Principais

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET    | /funcionarios | Lista todos os funcionários |
| GET    | /funcionarios/{id} | Busca funcionário por ID |
| POST   | /funcionarios | Cadastra novo funcionário |
| PUT    | /funcionarios/{id} | Atualiza funcionário |
| DELETE | /funcionarios/{id} | Remove funcionário |

---

## ▶ Como Executar o Projeto

1. Clonar o repositório:

git clone https://github.com/breno2210/rh-ellos-backend.git

2. Entrar na pasta do projeto:

cd rh-ellos-backend

3. Executar a aplicação:

./mvnw spring-boot:run

A aplicação iniciará na porta padrão 8080.

---

## 📈 Próximas Evoluções

- Integração com frontend React  
- Implementação de autenticação (JWT)  
- Documentação com Swagger  
- Deploy em ambiente cloud  
- Evolução para arquitetura corporativa  

---

## 👨‍💻 Autor

Breno Ferreira  
Projeto desenvolvido para portfólio profissional.