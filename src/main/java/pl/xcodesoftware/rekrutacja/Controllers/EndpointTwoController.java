package pl.xcodesoftware.rekrutacja.Controllers;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.xcodesoftware.rekrutacja.Entities.NumbersToSort;
import pl.xcodesoftware.rekrutacja.Service.EndpointTwoService;
import springfox.documentation.spring.web.json.Json;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;



@RestController
@RequestMapping("/numbers")
public class EndpointTwoController {

    @Autowired
    private EndpointTwoService endpointTwoService;


        @PostMapping("/sort-command")
        private List<Integer> sortingNumbers(@RequestBody NumbersToSort numbersToSort) {
            return endpointTwoService.sortTheNumbers(numbersToSort);
        }
}
