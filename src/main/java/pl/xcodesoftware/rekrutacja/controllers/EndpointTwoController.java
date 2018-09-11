package pl.xcodesoftware.rekrutacja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.xcodesoftware.rekrutacja.model.NumbersToSort;
import pl.xcodesoftware.rekrutacja.service.EndpointTwoService;


@RestController
@RequestMapping("/numbers")
public class EndpointTwoController {

    @Autowired
    private EndpointTwoService endpointTwoService;


    @PostMapping("/sort-command")
    private ResponseEntity<?> sortingNumbers(@RequestBody NumbersToSort numbersToSort) {

        if(numbersToSort.order == null || numbersToSort.order.isEmpty() ) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }else if (!"ASC".equals(numbersToSort.order) && !"DESC".equals(numbersToSort.order)) {
            return new ResponseEntity<>(HttpStatus.UNPROCESSABLE_ENTITY);
        }else {
            numbersToSort.setNumbers(endpointTwoService.sortTheNumbers(numbersToSort));
            return new ResponseEntity<>(numbersToSort.getNumbers(), HttpStatus.OK);
        }
    }
}
