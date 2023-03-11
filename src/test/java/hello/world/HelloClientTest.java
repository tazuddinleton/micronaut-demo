package hello.world;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

@MicronautTest
public class HelloClientTest {
    @Inject
    HelloClient client;

    @Test
    public void testHelloWorldResponse() {
        Assertions.assertEquals("Hello World!", Mono.from(client.hello()).block());
    }
}
