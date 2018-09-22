package pl.xcodesoftware.rekrutacja.service;



import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import pl.xcodesoftware.rekrutacja.model.CurrencyCode;
import pl.xcodesoftware.rekrutacja.model.CurrencyValue;
import pl.xcodesoftware.rekrutacja.model.NBPData;
import pl.xcodesoftware.rekrutacja.model.NBPRates;


import java.io.IOException;
import java.net.URL;
import java.util.List;

@Service
public class EndpointThreeService {

    public CurrencyValue getCurrencyValue(CurrencyCode currencyCode) throws IOException {

        CurrencyValue currencyValueCommand = new CurrencyValue();
        String url = "http://api.nbp.pl/api/exchangerates/tables/A?format=json";
        String currCode = currencyCode.code;

        ObjectMapper objMapper = new ObjectMapper();
        objMapper.configure(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY, true);

        // zwracany obiekt to tablica dwuwymiarowa
        List<NBPData> nbpDataList = objMapper.readValue(new URL(url), new TypeReference<List<NBPData>>() {
        });


        for (NBPRates c : nbpDataList.get(0).rates) {
            if (c.code.equalsIgnoreCase(currCode)) {
                currencyValueCommand.value = c.mid;
                // jesli znajdzie podana walute to ja zwroci, jesli nie spelni warunku wychodzi z "if"
                return currencyValueCommand;
            }
        }
            throw new RuntimeException("Podany kod waluty jest niepoprawny");


    }


}
