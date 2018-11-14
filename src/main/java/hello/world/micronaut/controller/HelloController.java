package hello.world.micronaut.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;

@Controller
public class HelloController {
    @Get(produces = MediaType.TEXT_PLAIN)
    public String index (){
        return "Hello World Micronaut";
    }
}
