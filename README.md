# Product Manager Spring Boot API 📦🔧

Este projeto é uma API para gerenciamento de produtos construída com Spring Boot. Ele oferece funcionalidades CRUD (Create, Read, Update, Delete) para manipulação de dados de produtos.

## Funcionalidades 📊
- Listar todos os produtos
- Criar um novo produto
- Consultar um produto específico
- Atualizar informações de um produto
- Excluir um produto

## Tecnologias Utilizadas ⚙️
- Spring Boot
- Java 17
- Maven
- MySQL
- Spring Data JPA
- 
## Configuração do Ambiente 🔧
1. Clone o repositório:

    ```bash
    git clone https://github.com/tiago-honorato/product-manager-springboot-api.git
    cd product-manager-springboot-api
    ```
2. Configure o banco de dados MySQL:
   - Crie um banco de dados chamado *productsDB*
   - Atualize as credenciais de conexão no arquivo `application.properties`
3. Execute o programa:
   - ./mvnw spring-boot:run
4. Acesse as API's
   - Acesse a API em http://localhost:8080/produtos
   - Utilize o Postman ou Insomnia para testar as rotas.
