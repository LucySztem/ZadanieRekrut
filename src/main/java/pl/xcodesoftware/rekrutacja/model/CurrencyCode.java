package pl.xcodesoftware.rekrutacja.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CurrencyCode {

    @JsonProperty("currency")
    public String code;

    public CurrencyCode() {
    }
}

