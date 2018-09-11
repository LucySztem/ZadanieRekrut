package pl.xcodesoftware.rekrutacja.Service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import pl.xcodesoftware.rekrutacja.Entities.NumbersToSort;
import java.util.Collections;
import java.util.List;

@Service
public class EndpointTwoService {

    public List<Integer> sortTheNumbers(NumbersToSort numbersToSort){

        if(numbersToSort.order == null ) {
            throw new NullPointerException() ;

        } else if ( numbersToSort.order.isEmpty()){

            throw new RuntimeException("Order musi być podany");

        } else if (numbersToSort.order.equalsIgnoreCase("ASC")){
            Collections.sort(numbersToSort.numbers);
        } else if (numbersToSort.order.equalsIgnoreCase("DESC")){
            Collections.sort(numbersToSort.numbers, Collections.reverseOrder());
        }else {
            throw new RuntimeException("Dane są nie poprawne");
        }


        return numbersToSort.numbers;

    }
}
