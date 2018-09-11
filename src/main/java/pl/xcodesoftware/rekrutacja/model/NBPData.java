package pl.xcodesoftware.rekrutacja.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class NBPData {

        public String table;
        public String no;
        public Date effectiveDate;
        public List<Rates> currencyRates;



    public NBPData() {
    }

    public List<Rates> getRates() {
        return currencyRates;
    }

    public void setRates(List<Rates> rates) {
        this.currencyRates = rates;
    }
}
