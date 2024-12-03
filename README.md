# OrderServiceProject

Backend de Sistema de Gerenciamento de Pedidos


Requisitos:

- Java 8

Para instalar dependências:

    ./mvnw dependency:resolve

Para executar:

    ./mvnw spring-boot:run

# Acesso ao Banco Dados H2

http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:orderdb
User Name: sa
Password: password

# Endpoints disponíveis:

	- Criar Pedido: POST /orders
	{
	  "products": [
		{"name": "Product A", "price": 10.0},
		{"name": "Product B", "price": 20.0}
	  ]
	}

	- Consultar Pedidos: GET /orders
		- O serviço retorna todos os pedidos e a soma total dos produtos de cada um
