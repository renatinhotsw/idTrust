package com.project.idtrust.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.Map;

public class MapperUtil {

    private static Map<String, Object> result;

    public static Map<String, Object> getMapperResult(String json){
        try {
            result = new ObjectMapper().readValue(json, HashMap.class);
        }  catch (
                JsonMappingException e) {
                e.printStackTrace();
        } catch (
                JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }


}
