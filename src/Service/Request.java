package Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Request {
    public String getData() {
        // Change these variables to your location. To check your coordinates search in https://open-meteo.com/en/docs
        double latitude = -15.7797;
        double longitude = -47.9297;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://api.open-meteo.com/v1/forecast?latitude="+ latitude + "&longitude="+ longitude +"&daily=precipitation_probability_mean&daily=apparent_temperature_mean")).build();
        HttpResponse<String> response = null;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return response.body();
    }
}
