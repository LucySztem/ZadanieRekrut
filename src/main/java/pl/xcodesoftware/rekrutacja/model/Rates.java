package pl.xcodesoftware.rekrutacja.model;

import lombok.Data;

/*Klasa reprezentująca obiekty w tabeli rates ze strony NBP*/
@Data
public class Rates {

    public String currency;
    public String code;
    public double mid;

    public Rates() {
    }
}
