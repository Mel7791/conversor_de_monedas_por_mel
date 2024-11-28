import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConnectingWithAPI {
    public CurrencyRecord buscarMoneda(String moneda_base, String moneda_target) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/84cd35fe5d74a0ef62ceeb41/pair/" + moneda_base + "/" + moneda_target);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() != 200) {
                System.out.println("ERROR: Currency code not found / El codigo de la moneda no se encontro ");
                return null;
            }
            return new Gson().fromJson(response.body(), CurrencyRecord.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

