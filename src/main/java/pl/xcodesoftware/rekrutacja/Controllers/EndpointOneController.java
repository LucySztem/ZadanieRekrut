package pl.xcodesoftware.rekrutacja.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class EndpointOneController {

    @GetMapping("status/ping")
    public String getStatus(){
        return "Pong";
    }
}
