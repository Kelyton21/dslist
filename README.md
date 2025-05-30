# 🎮 Lista de Jogos - API de Catálogo de Games

## 📋 Visão Geral do Projeto

Este projeto consiste na criação de **APIs RESTful** para o gerenciamento e consulta de diferentes categorias de jogos, proporcionando uma solução completa para catalogação e busca de games por categoria.

### 🎯 Categorias Disponíveis

O sistema oferece suporte às seguintes categorias de jogos:

- **🐉 Jogos de RPG** - Role-playing games com elementos de progressão e narrativa
- **⚽ Jogos de Esportes** - Simuladores esportivos e jogos de competição
- **🗡️ Jogos de Aventura e Ação** - Games focados em exploração, combate e desafios

---

## 🛠️ Stack Tecnológica

O projeto foi desenvolvido utilizando as seguintes tecnologias modernas e robustas:

### Backend
- ☕ **Java** - Linguagem de programação principal
- 🚀 **Spring Boot** - Framework para desenvolvimento rápido e eficiente
- 🗄️ **H2 Database** - Banco de dados em memória para desenvolvimento e testes
- 🔄 **Hibernate** - ORM para mapeamento objeto-relacional
- 🐘 **PostgreSQL** - Banco de dados relacional para produção

### Formato de Dados
- 📄 **JSON** - Formato de intercâmbio de dados leve e eficiente

---

## 🏗️ Arquitetura do Sistema

### 📊 Modelo de Classes

![Diagrama do Modelo de Classes](https://github.com/user-attachments/assets/d50b80e3-6fd7-4ea6-a046-e741929040eb)

*O diagrama acima ilustra a estrutura das entidades principais do sistema, demonstrando os relacionamentos entre jogos e suas respectivas categorias.*

### 🏛️ Padrão de Camadas

![Arquitetura em Camadas](https://github.com/user-attachments/assets/1de097b1-1c37-4055-94fb-4e9d1695c4b9)

*A arquitetura segue o padrão de camadas bem definidas, garantindo separação de responsabilidades e facilidade de manutenção.*

---

## 🔗 Endpoints da API

### 🎮 Jogos

#### 📜 Listar Todos os Jogos
```http
GET http://localhost:8080/games
```
**Descrição:** Retorna uma lista completa de todos os jogos disponíveis no catálogo.

#### 🔍 Buscar Jogo por ID
```http
GET http://localhost:8080/games/{id}
```
**Descrição:** Retorna informações detalhadas de um jogo específico baseado no seu identificador único.

### 📂 Listas de Categorias

#### 📋 Listar Todas as Categorias
```http
GET http://localhost:8080/lists
```
**Descrição:** Retorna todas as categorias de jogos disponíveis no sistema.

#### 🎯 Jogos por Categoria
```http
GET http://localhost:8080/lists/{id}/games
```
**Descrição:** Retorna todos os jogos pertencentes a uma categoria específica.

---

## 📱 Exemplo de Resposta da API

### 💻 Retorno do Serviço

![Exemplo de Resposta JSON](https://github.com/user-attachments/assets/8ae9e8f2-285f-4256-b383-c5b4c4684f0c)

*Exemplo de resposta JSON estruturada retornada pela API, mostrando os dados formatados e organizados para fácil consumo.*

---

## 🚀 Como Executar

1. **Clone o repositório**
2. **Configure o banco de dados** (H2 para Teste, PostgreSQL para Homolocação)
3. **Execute o comando:** `mvn spring-boot:run`
4. **Acesse:** `http://localhost:8080`

---

## 📝 Notas Importantes

- 🔧 A API utiliza o padrão REST para comunicação
- 📊 Todos os dados são retornados em formato JSON
- 🛡️ O sistema é preparado tanto para Teste (H2) quanto Homologação (PostgreSQL)
- 🎯 A arquitetura em camadas facilita manutenção e escalabilidade
