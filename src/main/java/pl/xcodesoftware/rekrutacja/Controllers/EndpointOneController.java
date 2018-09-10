package pl.xcodesoftware.rekrutacja.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class EndpointOneController {

    @GetMapping("/ping")
    public String getStatus(){
        return "Pong";
    }
}
