package dev.singtel.interview;

import dev.singtel.interview.behaviour.SoundMakable;
import dev.singtel.interview.behaviour.Walkable;

public class Cat implements Walkable, SoundMakable {
    public String walk() {
        return "I am walking";
    }

    public String makeSound() {
        return "Meow";
    }
}
