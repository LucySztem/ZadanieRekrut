package pl.xcodesoftware.rekrutacja.Service;



import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;
import pl.xcodesoftware.rekrutacja.Entities.Currency;
import pl.xcodesoftware.rekrutacja.Entities.CurrencyCode;
import pl.xcodesoftware.rekrutacja.Entities.CurrencyNBP;
import pl.xcodesoftware.rekrutacja.Entities.CurrencyValue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class EndpointThreeService {

        public CurrencyValue getCurrencyValue(CurrencyCode currencyCode) throws IOException {

         CurrencyValue currencyValueCommand = new CurrencyValue();
         String url = "http://api.nbp.pl/api/exchangerates/tables/A?format=json";

        ObjectMapper objMapper = new ObjectMapper();
        CurrencyNBP currenciesFromNBP = objMapper.readValue("http://api.nbp.pl/api/exchangerates/tables/A?format=json", CurrencyNBP.class);


        List<Currency> currencies = new ArrayList<Currency>();

         currencies = currenciesFromNBP.rates;

        for (Currency c : currencies){
            if(c.code.equalsIgnoreCase(currencyCode.code)){
                currencyValueCommand.value = c.mid;
            } else {
                throw new RuntimeException("Nie ma takiej waluty");
            }
        }
         return currencyValueCommand;
        }
}
