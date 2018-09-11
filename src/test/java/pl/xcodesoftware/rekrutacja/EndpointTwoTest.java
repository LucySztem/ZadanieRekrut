package pl.xcodesoftware.rekrutacja;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import pl.xcodesoftware.rekrutacja.Entities.CurrencyCode;
import pl.xcodesoftware.rekrutacja.Entities.NumbersToSort;
import pl.xcodesoftware.rekrutacja.Service.EndpointTwoService;


import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EndpointTwoTest {

    @Autowired
    private EndpointTwoService endpointTwoService;

    private WebTestClient client;

    //łączenie się z serwerem
    @Before
    public void setUp(){
        client = WebTestClient.bindToServer().baseUrl("http://localhost:8080").build();
    }

    @Test
    public void sortTableOfNumbersByGivenCommand(){

//        client = client.post().uri("/numbers/sort-command")
//                .accept(MediaType.APPLICATION_JSON_UTF8)
//                .exchange()
//                .expectStatus().isOk()
//                .expectHeader().contentType(MediaType.APPLICATION_JSON_UTF8)
//                .exchange()
//                .expectStatus().isOk()
//                .expectBody(NumbersToSort.class);



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
