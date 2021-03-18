package com.project.idtrust.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.project.idtrust.model.Price;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceDTO implements Serializable {

    private Long price_id;
    private String name;
    private String ask;

    public PriceDTO(Price price){
        if(price != null){
            this.price_id = price.getPrice_id();
            this.name = price.getName();
            this.ask = price.getAsk();
        }
    }
}
