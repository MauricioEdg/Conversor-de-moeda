package org.example;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
public class ConversorMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CONVERSOR DE MOEDAS ===");
        System.out.print("Digite a moeda de origem (ex: USD): ");
        String origem = scanner.next().toUpperCase();

        System.out.print("Digite a moeda de destino (ex: BRL): ");
        String destino = scanner.next().toUpperCase();

        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();

        try {
            double convertido = converterMoeda(origem, destino, valor);
            System.out.printf("%.2f %s = %.2f %s%n", valor, origem, convertido, destino);
        } catch (IOException e) {
            System.out.println("Erro ao acessar a API: " + e.getMessage());
        }
    }
    public static double converterMoeda(String from, String to, double amount) throws IOException {
        String apiKey = "key"; 
        String urlStr = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + from;

        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();

        int responseCode = conn.getResponseCode();
        if (responseCode != 200) {
            throw new RuntimeException("Erro: Código de resposta HTTP " + responseCode);
        }

        Scanner scanner = new Scanner(url.openStream());
        StringBuilder json = new StringBuilder();
        while (scanner.hasNext()) {
            json.append(scanner.nextLine());
        }
        scanner.close();

        JsonObject jsonObject = JsonParser.parseString(json.toString()).getAsJsonObject();
        JsonObject rates = jsonObject.getAsJsonObject("conversion_rates");

        double taxa = rates.get(to).getAsDouble();
        return amount * taxa;
    }
}
