package dev.singtel.interview;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class BirdTest extends BaseTest{

    private String flyCheck = "I am flying\r\n";
    private String singCheck = "I am singing\r\n";

    private Bird b;


    @Before
    public void setup(){
        b = new Bird();
        System.setOut(out);
    }



    @Test
    public void sing() {
        b.makeSound();
        String out = byteOut.toString();
        assertThat(out, containsString(singCheck));
    }

}