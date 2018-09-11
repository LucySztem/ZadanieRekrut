package pl.xcodesoftware.rekrutacja.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CurrencyValue {

    @JsonProperty("value")
    public double value;


}
