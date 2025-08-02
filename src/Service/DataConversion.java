package Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataConversion {
    private final ObjectMapper convert = new ObjectMapper();

    public <T> T jsonToClass(String json, Class<T> classe) {
        try {
            return convert.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error converting JSON to class", e);
        }
    }
}
