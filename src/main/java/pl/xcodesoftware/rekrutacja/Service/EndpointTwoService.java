package pl.xcodesoftware.rekrutacja.Service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import pl.xcodesoftware.rekrutacja.Entities.NumbersToSort;
import java.util.Collections;
import java.util.List;

@Service
public class EndpointTwoService {

    public List<Integer> sortTheNumbers(NumbersToSort numbers){

        NumbersToSort numbersToSort = new NumbersToSort();
        ObjectMapper objMapper = new ObjectMapper();
        objMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        numbersToSort = objMapper.readValue(numbersToSort, NumbersToSort.class);

        if(numbersToSort.numbers == null || numbersToSort.order == null ) {
            throw new NullPointerException();

        } else if (numbersToSort.numbers.isEmpty() ||  numbersToSort.order.isEmpty()){

            //trzeba wyrzucic info mowiace ze operacja nie zostanie wykonana doppoki nie zostana podane porpawne dane

        } else if (numbersToSort.order.equalsIgnoreCase("ASC")){
            Collections.sort(numbersToSort.numbers);
        } else if (numbersToSort.order.equalsIgnoreCase("DESC")){
            Collections.sort(numbersToSort.numbers, Collections.reverseOrder());
        }else {
            throw new RuntimeException("Dane są nie poprawne");
        }

        // zwracam tylko liste integerow z klasy
        return numbersToSort.numbers;

    }
}
