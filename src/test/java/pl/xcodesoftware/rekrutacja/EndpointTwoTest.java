package pl.xcodesoftware.rekrutacja;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.xcodesoftware.rekrutacja.Entities.NumbersToSort;
import pl.xcodesoftware.rekrutacja.Service.EndpointTwoService;


import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EndpointTwoTest {

    @Autowired
    private EndpointTwoService endpointTwoService;


    @Test
    public void sortTableOfNumbersByGivenCommand(){

        List<Integer> listOfNumbers = new ArrayList<Integer>();

        listOfNumbers.add(8);
        listOfNumbers.add(1);
        listOfNumbers.add(6);
        listOfNumbers.add(4);

        NumbersToSort numbersToSortAsc = new NumbersToSort();
        numbersToSortAsc.numbers = listOfNumbers;
        numbersToSortAsc.order = "asc";

        NumbersToSort numbersToSortDesc = new NumbersToSort();
        numbersToSortDesc.numbers = listOfNumbers;
        numbersToSortDesc.order = "desc";

        Assert.assertEquals("[1,4,6,8]", endpointTwoService.sortTheNumbers(numbersToSortAsc));
        Assert.assertEquals("[8,6,4,1]", endpointTwoService.sortTheNumbers(numbersToSortDesc));
    }


}
