package com.ioet.pair;

import org.junit.Assert;
import org.junit.Test;

public class GreetingsTest {

    @Test
    public void shouldSayHelloPlusName() {
        String name = "Rene";
        Greetings greetings = new Greetings();
        Assert.assertEquals("Hello " + name, greetings.sayHello(name));
    }
}
