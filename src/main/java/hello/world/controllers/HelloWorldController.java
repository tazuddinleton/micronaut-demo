package hello.world.controllers;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

@Controller("/hello")
public class HelloWorldController {
    @Get(produces = MediaType.TEXT_PLAIN)
    public String Greeting() {
        return "Hello World!";
    }

    @Post(produces = MediaType.TEXT_PLAIN)
    public String Greeting(@Body String name) {
        return "Hello " + name + ", How do you do.";
    }
}
