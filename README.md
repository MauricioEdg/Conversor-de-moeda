# 💱Conversor de Moedas em Java

Um simples Conversor de Moedas desenvolvido em Java, que consome dados em tempo real da ExchangeRate-API para converter valores entre diferentes moedas.
Este projeto foi criado para resolver o Challange de Alura One sobre como integrar uma API REST a uma aplicação Java.
Funcionalidades

✅ Conversão em tempo real entre diferentes moedas <br>
✅ Consumo de API externa usando HttpURLConnection <br>
✅ Leitura e tratamento de JSON com Gson <br>
✅ Entrada de dados via console <br>
✅ Estrutura simples e compatível com IntelliJ IDEA, NetBeans ou Eclipse <br>

## Tecnologias utilizadas

Java 21 <br>
Gson (para processar JSON) <br>
ExchangeRate-API (para taxas de câmbio)

## 📦 Como configurar o projeto

1️⃣ Clone ou baixe o repositório
git clone https://github.com/MauricioEdg/Conversor-de-moeda.git

2️⃣ Abra o projeto no IntelliJ IDEA <br>
Vá em File → Open <br> 
Selecione a pasta do projeto <br>
Aguarde o IntelliJ baixar as dependências (caso use Maven) <br>

3️⃣ Adicione a biblioteca Gson <br>
Se não estiver usando Maven, adicione manualmente: <br>
Vá em: File → Project Structure → Libraries → + → From Maven <br>
Pesquise e adicione: <br>
com.google.code.gson:gson:2.10 <br> 
Ou, se estiver usando Maven, adicione no seu pom.xml: <br>
`<dependency>`

    <groupId>com.google.code.gson</groupId> 
    
    <artifactId>gson</artifactId> 
    
    <version>2.10</version> 
    
`</dependency>`

4️⃣ Configure sua chave da API
Crie uma conta gratuita em https://www.exchangerate-api.com <br>
Copie sua API Key e substitua no código: <br>
String apiKey = "SUA_API_KEY_AQUI"; <br>

## 🧩 Exemplo de uso
Execução via console: <br>
=== CONVERSOR DE MOEDAS === <br>
Digite a moeda de origem (ex: USD): USD <br>
Digite a moeda de destino (ex: BRL): BRL <br>
Digite o valor: 10 <br>

💱 10.00 USD = 56.32 BRL
