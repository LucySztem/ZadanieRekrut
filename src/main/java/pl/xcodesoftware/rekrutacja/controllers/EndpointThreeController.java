package pl.xcodesoftware.rekrutacja.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.xcodesoftware.rekrutacja.model.CurrencyCode;
import pl.xcodesoftware.rekrutacja.model.CurrencyValue;
import pl.xcodesoftware.rekrutacja.service.EndpointThreeService;

import java.io.IOException;

@RestController
@RequestMapping("/currencies")
public class EndpointThreeController {

    @Autowired
    private EndpointThreeService endpointThreeService;

    @PostMapping("/get-current-currency-value-command")
    public ResponseEntity<?> getCurrencyCurrentValue(@RequestBody CurrencyCode currencyCode) throws IOException {

        if(currencyCode.code == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//       chciałam spr czy podany kod zawiera 3 litery
//        } else if (currencyCode.code.matches("[a-zA-Z]{3}")) {
//            CurrencyValue curVal = endpointThreeService.getCurrencyValue(currencyCode);
//            return new ResponseEntity<>(curVal, HttpStatus.OK);
//        }
        } else if (currencyCode.code.length() == 3){
            CurrencyValue curVal = endpointThreeService.getCurrencyValue(currencyCode);
            return new ResponseEntity<>(curVal, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }
}
