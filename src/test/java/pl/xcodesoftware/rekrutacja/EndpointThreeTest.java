package pl.xcodesoftware.rekrutacja;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import pl.xcodesoftware.rekrutacja.Entities.CurrencyCode;
import pl.xcodesoftware.rekrutacja.Service.EndpointThreeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EndpointThreeTest {

    @Autowired
    private EndpointThreeService endpointThreeService;

    @Test
    public void currencyCodeIsNotNull(CurrencyCode givenCode) {

        Assert.notNull(givenCode, "Currency code cannot be null");

    }

    @Test
    public void getValueOfRequestedCurrency(){



    }


}
