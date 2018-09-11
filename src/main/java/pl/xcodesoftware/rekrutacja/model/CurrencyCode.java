package pl.xcodesoftware.rekrutacja.Entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CurrencyCode {

    @JsonProperty("currency")
    public String code;

    public CurrencyCode() {
    }
}

