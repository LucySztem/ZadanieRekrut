package pl.xcodesoftware.rekrutacja.service;

import org.springframework.stereotype.Service;
import pl.xcodesoftware.rekrutacja.model.NumbersToSort;
import java.util.Collections;
import java.util.List;

@Service
public class EndpointTwoService {

    public List<Integer> sortTheNumbers(NumbersToSort numbersToSort){

        if (numbersToSort.order.equalsIgnoreCase("ASC")){
            Collections.sort(numbersToSort.numbers);
        } else if (numbersToSort.order.equalsIgnoreCase("DESC")) {
            Collections.sort(numbersToSort.numbers, Collections.reverseOrder());
        }

        return numbersToSort.numbers;
    }
}
