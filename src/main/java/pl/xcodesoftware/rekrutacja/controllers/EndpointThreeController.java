package pl.xcodesoftware.rekrutacja.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.xcodesoftware.rekrutacja.Entities.CurrencyCode;
import pl.xcodesoftware.rekrutacja.Entities.Currency;
import pl.xcodesoftware.rekrutacja.Entities.CurrencyValue;
import pl.xcodesoftware.rekrutacja.Service.EndpointThreeService;

import java.io.IOException;

@RestController
@RequestMapping("/currencies")
public class EndpointThreeController {

    @Autowired
    private EndpointThreeService endpointThreeService;

    @PostMapping("/get-current-currency-value-command")
    public CurrencyValue getCurrencyValue(@RequestBody CurrencyCode currencyCode) throws IOException {

        CurrencyValue currencyValueCommand = new CurrencyValue();
        currencyValueCommand = endpointThreeService.getCurrencyValue(currencyCode);

        //zwracam obiekt z wartością szukanej waluty
        return currencyValueCommand ;
    }
}