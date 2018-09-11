package pl.xcodesoftware.rekrutacja.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class NBPData {

        @JsonProperty("table")
        public String table;

        @JsonProperty("no")
        public String no;

        @JsonProperty("effectiveDate")
        public Date effectiveDate;

        @JsonProperty("rates")
        public List<NBPRates> rates;



    public NBPData() {
    }


}
