package dev.singtel.interview;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class DuckTest extends BaseTest{

    private String singCheck = "Quack, quack\r\n";
    private String swimCheck = "duck swimming\r\n";

    private Duck b = new Duck();


    @Before
    public void setup(){
        System.setOut(out);
    }
    @Test
    public void sing() {
        b.makeSound();
        String out = byteOut.toString();
        assertThat(out, containsString(singCheck));
    }

    @Test
    public void swim() {
        b.swim();
        String out = byteOut.toString();
        assertThat(out, containsString(swimCheck));
    }
}