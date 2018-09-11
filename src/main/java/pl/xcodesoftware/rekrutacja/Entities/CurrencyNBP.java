package pl.xcodesoftware.rekrutacja.Entities;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class CurrencyNBP {

        public String table;
        public long no;
        public Date effectiveDate;
        public List<Currency> rates;


    public CurrencyNBP() {
    }

    public List<Currency> getRates() {
        return rates;
    }

    public void setRates(List<Currency> rates) {
        this.rates = rates;
    }
}
