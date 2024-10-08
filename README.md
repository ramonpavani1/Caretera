# Caretera
Esta é uma API RESTful desenvolvida em Java com Spring Boot para gerenciar o controle financeiro pessoal, focando em gastos e ganhos. A API permite que os usuários autentiquem-se e realizem operações como criação, consulta, atualização e exclusão de registros de gastos e ganhos. Além disso, os registros podem ser filtrados por categorias e períodos de tempo (mensal e anual), proporcionando uma visão clara da gestão financeira ao longo do tempo.


Funcionalidades
Autenticação de Usuário: Proteção dos endpoints com JWT, garantindo que apenas usuários autenticados possam acessar os recursos.
Gerenciamento de Registros: Criação, atualização, listagem e exclusão de registros de gastos e ganhos.
Classificação por Categorias: Registros financeiros podem ser associados a categorias personalizadas.
Filtragem por Período: Exibição dos registros por intervalos mensais ou anuais.
Banco de Dados H2: Utilização de banco de dados H2 em memória para armazenar os dados de forma leve e eficiente.


Tecnologias Utilizadas
Java 17
Spring Boot 3.0
Spring Data JPA
JWT para Autenticação
Banco de Dados H2
Maven


Endpoints Principais
/api/auth/login: Autenticação de usuários e geração de token JWT.
/api/registros: CRUD de registros financeiros (gastos e ganhos).
/api/registros/mes: Filtragem de registros por mês.
/api/registros/ano: Filtragem de registros por ano.
/api/registros/categoria/{id}: Filtragem de registros por categoria.
