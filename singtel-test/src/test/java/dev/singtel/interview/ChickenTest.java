package dev.singtel.interview;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class ChickenTest extends BaseTest{

    private String singCheck = "Cluck, cluck\r\n";

    private Chicken b = new Chicken();


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

}