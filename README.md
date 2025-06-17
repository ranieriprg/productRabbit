# productRabbit
O sistema tem como objetivo realizar o controle de cadastro de produtos, gestão de estoque e processamento assíncrono de eventos utilizando RabbitMQ para comunicação entre serviços.

✅ Principais funcionalidades:
Cadastro, atualização e exclusão de produtos

Controle de estoque: entrada e saída de itens, com atualização em tempo real

Consulta de produtos e níveis de estoque

Notificação assíncrona via RabbitMQ:

Envio de eventos de criação, atualização ou baixa de estoque para outras aplicações (exemplo: sistema de faturamento, relatórios, etc.)

Processamento de mensagens de forma desacoplada e tolerante a falhas

✅ Tecnologias utilizadas:
Spring Boot para desenvolvimento da API

RabbitMQ para mensageria

MySQL ou PostgreSQL para persistência de dados

Swagger/OpenAPI para documentação da API

Docker (opcional) para ambiente de desenvolvimento e testes

✅ Exemplo de fluxo com RabbitMQ:
Produto cadastrado ou estoque alterado

Sistema publica uma mensagem no RabbitMQ (exemplo: queue.stock.events)

Outros sistemas (exemplo: módulo de relatórios ou faturamento) podem consumir esse evento e reagir de forma assíncrona
