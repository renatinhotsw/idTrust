package com.project.idtrust.controller;

import com.project.idtrust.util.Constants;
import com.project.idtrust.util.MapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.Map;


@RestController
@RequestMapping("/coins") //trocar pra PriceResource
public class CoinController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/all")
    public Map<String,Object>getCoins(){
        String json = restTemplate.getForObject(
                Constants.ALL_COINS, String.class
        );
        Map<String,Object> result = new MapperUtil().getMapperResult(json);
        return result;
    }
}
