package pl.xcodesoftware.rekrutacja;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.util.Assert;
import pl.xcodesoftware.rekrutacja.Entities.CurrencyCode;
import pl.xcodesoftware.rekrutacja.Service.EndpointThreeService;

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
    public void currencyCodeIsNotNull(CurrencyCode givenCode) {

//        client = client.post().uri("/numbers/sort-command")
//                .accept(MediaType.APPLICATION_JSON_UTF8)
//                .exchange()
//                .expectStatus().isOk()
//                .expectHeader().contentType(MediaType.APPLICATION_JSON_UTF8)
//                .exchange()
//                .expectStatus().isOk()
//                .expectBody(CurrencyCode.class);

        Assert.notNull(givenCode, "Currency code cannot be null");

    }

}
