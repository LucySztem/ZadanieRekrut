package pl.xcodesoftware.rekrutacja;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.EntityExchangeResult;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.util.Assert;
import pl.xcodesoftware.rekrutacja.model.CurrencyCode;
import pl.xcodesoftware.rekrutacja.service.EndpointThreeService;

import javax.validation.constraints.AssertTrue;
import java.util.regex.Pattern;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EndpointThreeTest {

    @Autowired
    private EndpointThreeService endpointThreeService;

    private WebTestClient client;


    //łączenie się z serwerem
    @Before
    public void setUp(){
        client = WebTestClient.bindToServer().baseUrl("http://localhost:8080").build();
    }

    @Test
    public void returnRequestedObject(){

        EntityExchangeResult<CurrencyCode> result = client.post().uri("/currencies/get-current-currency-value-command")
                .accept(MediaType.APPLICATION_JSON_UTF8)
                .exchange()
                .expectStatus().isOk()
                .expectBody(CurrencyCode.class)
                .returnResult();
    }

    @Test
    public void currencyCodeContainsThreeLetters(CurrencyCode givenCode) {

        Pattern currCode = Pattern.compile("[a-zA-Z]{3}]");
        assertTrue(currCode.matcher("abc").matches());
        assertFalse(currCode.matcher("abdc").matches());

    }

}
