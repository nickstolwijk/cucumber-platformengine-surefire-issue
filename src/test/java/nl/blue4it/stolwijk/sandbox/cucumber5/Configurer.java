package nl.blue4it.stolwijk.sandbox.cucumber5;

import java.lang.reflect.Type;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.DefaultDataTableCellTransformer;
import io.cucumber.java.DefaultDataTableEntryTransformer;
import io.cucumber.java.DefaultParameterTransformer;


public class Configurer {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @DefaultParameterTransformer
    @DefaultDataTableEntryTransformer
    @DefaultDataTableCellTransformer
    public Object defaultTransformer(Object fromValue, Type toValueType) {
        System.out.println("Mapping '" + fromValue + "' to '" + toValueType.getTypeName() + "'.");
        JavaType javaType = objectMapper.constructType(toValueType);
        return objectMapper.convertValue(fromValue, javaType);
    }
}
