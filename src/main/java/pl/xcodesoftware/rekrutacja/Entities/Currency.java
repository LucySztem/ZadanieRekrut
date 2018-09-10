package pl.xcodesoftware.rekrutacja.Entities;

import lombok.Data;

/*Klasa reprezentująca obiekty w tabeli rates ze strony NBP*/
@Data
public class Currency {

    public String currency;
    public String code;
    public double mid;

    public Currency() {
    }
}
