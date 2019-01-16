package dev.singtel.interview;

import dev.singtel.interview.behaviour.Animal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnimalTest extends BaseTest{
    private String walkCheck = "I am walking\r\n";

    @Before
    public void setup(){
        System.setOut(out);
    }


    @Test
    public void walk() {
        String out = byteOut.toString();
        Assert.assertTrue(out.equals(walkCheck));
    }
}