import Model.Temperature;
import Service.DataConversion;
import Service.Request;

public class Main {
    public static void main(String[] args) {
        DataConversion convert = new DataConversion();
        Request request = new Request();
        Temperature temperature;

        temperature = convert.jsonToClass(request.getData(), Temperature.class);
        String message = temperature.daily().apparent_temperature_mean().getFirst() + temperature.daily_units().apparent_temperature_mean() + "  \uD83D\uDCA7:" + temperature.daily().precipitation_probability_mean().getFirst() + "%";

        System.out.println("{\"text\":\"" + message +"\"}");
    }
}