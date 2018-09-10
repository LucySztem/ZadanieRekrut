package pl.xcodesoftware.rekrutacja.Entities;

import lombok.Data;

/*Klasa posiadające zmienne odpowiadające tablicy obiektów rates ze strony NBP*/
@Data
public class Currency {

    public String currency;
    public String code;
    public double mid;

    public Currency() {
    }
}
