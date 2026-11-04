[readme_md.md](https://github.com/user-attachments/files/34389359/readme_md.md)
# 🚀 TechByte - API REST com Spring Boot

Este projeto é uma API REST desenvolvida em Java utilizando o ecossistema Spring Boot. A aplicação disponibiliza endpoints para o gerenciamento e consulta de produtos, retornando dados estruturados no formato JSON.

---

## 🛠️ 1. Configurando o Spring Initializr

O **Spring Initializr** é a ferramenta oficial do Spring para gerar a estrutura base do projeto Java.

### **Passo a Passo:**

1. **Acesse o site:** Entre em [start.spring.io](https://start.spring.io/).
2. **Preencha os dados do projeto (Painel Esquerdo):**
   * **Project:** Escolha `Maven` (gerenciador de dependências e build do projeto).
   * **Language:** Selecione `Java`.
   * **Spring Boot:** Escolha uma versão estável (ex: `3.x.x` ou `4.1.2`).
   * **Project Metadata:**
     * **Group:** `com.dt2`
     * **Artifact:** `techbyte`
     * **Name:** `techbyte`
     * **Package name:** `com.dt2.techbyte`
     * **Packaging:** `Jar`
     * **Java:** Selecione `17` ou `21` (ou `25` se houver suporte no seu ambiente).
3. **Adicione as Dependências (Painel Direito):**
   * Clique no botão **`ADD DEPENDENCIES...`** (ou aperte `CTRL + B`).
   * Busque e adicione:
     1. **Spring Web:** Para criar os controladores e expor a API RESTful com o Apache Tomcat embarcado.
     2. **Spring Data JPA:** Para a comunicação e manipulação do banco de dados via ORM/Hibernate.
     3. **MySQL Driver:** Para permitir a conexão com o banco de dados MySQL.
4. **Gerar e Importar:**
   * Clique no botão **`GENERATE`** no rodapé para baixar o arquivo `.zip`.
   * Extraia o arquivo e abra a pasta na sua IDE preferida (IntelliJ IDEA, VS Code ou Eclipse).

---

## 💻 2. Estrutura e Explicação do Código

A aplicação segue a arquitetura padrão do Spring Boot para rotas REST:

### **A. Modelo / Entidade (`Produto`)**
A classe `Produto` representa o modelo de dados retornado pela API com os seguintes atributos:
* `id` (`int` / `Long`): Identificador único do produto.
* `nome` (`String`): Nome do produto (ex: `"Luz colorida"`).
* `descricao` (`String`): Detalhes do produto (ex: `"ele é bem legal"`).
* `preco` (`double` / `BigDecimal`): Valor monetário do produto (ex: `123.12`).

### **B. Controlador (`ProdutoController`)**
O controlador expõe o endpoint HTTP do tipo `GET` na rota `/Produto`. Quando acionado, ele retorna os dados formatados em JSON:

```json
{
  "preco": 123.12,
  "descricao": "ele é bem legal",
  "nome": "Luz colorida",
  "id": 0
}
```

---

## 📬 3. Configurando e Testando a API no Postman

O **Postman** permite enviar requisições HTTP para a API para testar os retornos JSON.

### **Passo a Passo:**

1. **Inicie a aplicação Java:**
   * Na sua IDE, execute a classe principal `TechbyteApplication.java` ou rode o comando `./mvnw spring-boot:run` no terminal.
   * Certifique-se de que o console exiba que o servidor foi iniciado na porta **8080**.

2. **Criar a Requisição no Postman:**
   * Abra o Postman e clique no botão **`+`** (*New HTTP Request*) para abrir uma nova aba.
   * Selecione o método HTTP **`GET`** no menu suspenso à esquerda.
   * No campo de URL, insira:
     ```text
     http://localhost:8080/Produto
     ```

3. **Enviar a Requisição:**
   * Clique no botão azul **`Send`**.

4. **Analisar a Resposta (Painel Inferior):**
   * **Status:** Verifique se o código retornado é `200 OK` (indica sucesso).
   * **Body / JSON:** Na aba **Body** com a opção **JSON** selecionada, o retorno exibido deve ser:
     ```json
     {
         "preco": 123.12,
         "descricao": "ele é bem legal",
         "nome": "Luz colorida",
         "id": 0
     }
     ```

---

## 🌐 4. Teste Direto pelo Navegador

Como a rota `/Produto` responde a requisições do tipo `GET`, você também pode testar digitando o seguinte endereço na barra do navegador:

```text
http://localhost:8080/Produto
```

---

## 📦 5. Como Clonar e Executar o Projeto Localmente

1. Clone o repositório:
   ```bash
   git clone https://github.com/IgorBarretodeLima/Spring_Techbyte.git
   ```
2. Entra no diretório do projeto:
   ```bash
   cd Spring_Techbyte
   ```
3. Execute o projeto via Maven Wrapper:
   ```bash
   ./mvnw spring-boot:run
   ```
## 6. como vai ficar 
--Spring initiliazr
<img width="1639" height="739" alt="Captura de tela 2026-11-04 160740" src="https://github.com/user-attachments/assets/76d10d0e-7671-4b8c-be02-24f0b7f3a038" />

--Postman 
<img width="1918" height="1028" alt="Captura de tela 2026-11-04 151156" src="https://github.com/user-attachments/assets/228d8568-7162-4cdb-9b7c-23f97cc14ce2" />

--Pagina web 
<img width="879" height="363" alt="Captura de tela 2026-11-04 152443" src="https://github.com/user-attachments/assets/631cf899-7ace-4d05-a68f-87324bdd799c" />




