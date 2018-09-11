package pl.xcodesoftware.rekrutacja.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/*Klasa reprezentująca obiekty w tabeli rates ze strony NBP*/
@Data
public class NBPRates {

    @JsonProperty("currency")
    public String currency;

    @JsonProperty("code")
    public String code;

    @JsonProperty("mid")
    public double mid;

    public NBPRates() {
    }
}
