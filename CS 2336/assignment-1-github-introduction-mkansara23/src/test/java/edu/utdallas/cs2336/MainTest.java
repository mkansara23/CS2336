package edu.utdallas.cs2336;

import org.junit.jupiter.api.Test;

import edu.utdallas.cs2336.Main;

public class MainTest {

    @Test
    public void testMain() {
        String response = Main.hello();
        assert response.startsWith("Hello, my name is ");
        assert !response.endsWith("my name is ");
    }
}
