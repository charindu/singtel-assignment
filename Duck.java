package dev.singtel.interview;

import dev.singtel.interview.behaviour.Flyable;

public class Duck extends Bird implements Flyable {

    @Override
    public String makeSound() {
        return "Quack, quack";
    }

    public String fly() {
        return "I am flying";
    }

    public String swim() {
        return "I am swimming";
    }
}
