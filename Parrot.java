package dev.singtel.interview;

import dev.singtel.interview.behaviour.Flyable;
import dev.singtel.interview.behaviour.SoundMakable;

public class Parrot extends Bird implements Flyable {

    private String song;

    public Parrot() {
        this.song = super.makeSound();
    }
    
    public String fly() {
        return "I am flying";
    }

    @Override
    public String makeSound() {
        return song;
    }

}
