import SpringAndSpringBoot.GreetClient;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class ServerTester {
    @Test
    public void givenGreetingClient_whenServerRespondsWhenStarted_thenCorrect() throws IOException {
        GreetClient client = new GreetClient();
        client.startConnection("127.0.0.1", 6666);
        String response = client.sendMessage("Hello server");
        assertEquals("Hello client", response);
    }

}