<h2>Sistema de gerenciamento de pessoas em API REST com Spring Boot - DIO.me</h2>

Este é um sistema simples para o gerenciamento de pessoas 
através de uma API REST, criada com o Spring Boot, baseado em um curso da DIO.me.

O projeto está rodando no HEROKU [aqui](https://personapi-fcc7a5e6efc0.herokuapp.com/api/v1/people)

O sistema possui os seguintes tópicos:

* Controller -> Recebe as requisições
* Entity -> Modelo de dados para o mapeamento de entidades em bancos de dados
* Mapper -> Mapeamento entre a Entidade e o DTO
* Desenvolvimento de operações de gerenciamento de usuários (Cadastro, leitura, atualização e remoção de pessoas de um sistema).
* Cada uma das operações acima usando o padrão arquitetural REST
* Implantação do sistema na nuvem através do Heroku

Para executar o projeto no terminal, digite o seguinte comando:

```shell script
mvn spring-boot:run 
```

Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

```
http://localhost:8080/api/v1/people
```


### Ferramentas e Frameworks

* Java 11 ou versões superiores.
* Maven 3.6.3 ou versões superiores.
* Intellj IDEA Community Edition ou sua IDE favorita.
* Controle de versão GIT instalado na sua máquina.
* Conta no GitHub para o armazenamento do seu projeto na nuvem.
* Conta no Heroku para o deploy do projeto na nuvem

### Postman exemplo: 
#### GET - Obter dados
<img width="872" height="806" alt="image" src="https://github.com/user-attachments/assets/15449ad9-ae86-4453-85ee-05144af17a8c" />
<img width="844" height="687" alt="image" src="https://github.com/user-attachments/assets/42e05516-2a1a-4c94-8cc1-594d4f650399" />

#### POST - Criação
<img width="969" height="674" alt="image" src="https://github.com/user-attachments/assets/d3714d86-b1ec-47f5-8d7e-3b96c2405767" />

#### PUT - Atualização
<img width="967" height="722" alt="image" src="https://github.com/user-attachments/assets/d5627a36-7a31-49c0-857c-6c55ef13d8de" />


### Links úteis:
* [Referência do Intellij IDEA Community, para download](https://www.jetbrains.com/idea/download)
* [Palheta de atalhos de comandos do Intellij](https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf)
* [Site oficial do Spring](https://spring.io/)
* [Site oficial do Spring Initialzr, para setup do projeto](https://start.spring.io/)
* [Site oficial do Heroku](https://www.heroku.com/)
* [Site oficial do GIT](https://git-scm.com/)
* [Site oficial do GitHub](http://github.com/)
* [Documentação oficial do Lombok](https://projectlombok.org/)
* [Documentação oficial do Map Struct](https://mapstruct.org/)
* [Referência para o padrão arquitetural REST](https://restfulapi.net/)
