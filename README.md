# Lista de Jogos

O projeto consiste na criação de APIs para o retorno de diferentes listas de jogos como:
Ex: 
- Jogos de RPG
- Jogos de Esportes
- Jogos de Aventuras e ação

Para isso foi utilizado as seguintes tecnologias
- Java
- Spring Boot
- H2
- Hibernate
- Json
- Postgreen

### Modelo de Classe
![Image](https://github.com/user-attachments/assets/d50b80e3-6fd7-4ea6-a046-e741929040eb)

### Padrão de camadas
![Image](https://github.com/user-attachments/assets/1de097b1-1c37-4055-94fb-4e9d1695c4b9)

### Endpoints
#### Retorna todos os jogos 
- http://localhost:8080/games
#### Retorna as informações completa de um jogo
- http://localhost:8080/games/{id}
#### Retorna as lista de jogos 
- http://localhost:8080/lists
#### Retorna os jogos de uma lista em especifico
- http://localhost:8080/lists/{id}/games
### Retorno do Chamado do Serviço
![Image](https://github.com/user-attachments/assets/8ae9e8f2-285f-4256-b383-c5b4c4684f0c)

