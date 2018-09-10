package pl.xcodesoftware.rekrutacja.Entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CurrencyValue {

    @JsonProperty("value")
    public double value;
}
