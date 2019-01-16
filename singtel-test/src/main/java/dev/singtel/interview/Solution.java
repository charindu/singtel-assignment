package dev.singtel.interview;

import dev.singtel.interview.behaviour.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphin(),
                new Dog(),
                new Butterfly(),
                new Cat()
        };

        List<String> flyableAnimals = Arrays
                .stream(animals)
                .filter((x) -> x instanceof Flyable)
                .map((x) -> x.getClass().getSimpleName())
                .collect(Collectors.toList());

        List<String> walkableAnimals = Arrays
                .stream(animals)
                .filter((x) -> x instanceof Walkable)
                .map((x) -> x.getClass().getSimpleName())
                .collect(Collectors.toList());

        List<String> soundMakableAnimals = Arrays
                .stream(animals)
                .filter((x) -> x instanceof SoundMakable)
                .map((x) -> x.getClass().getSimpleName())
                .collect(Collectors.toList());

        List<String> swimmableAnimals = Arrays
                .stream(animals)
                .filter((x) -> x instanceof Swimmable)
                .map((x) -> x.getClass().getSimpleName())
                .collect(Collectors.toList());

        System.out.println(String.format( "Flyable animals size : %d and they are %s", flyableAnimals.size(), flyableAnimals));
        System.out.println(String.format( "Walkable animals size : %d and they are %s", walkableAnimals.size(), walkableAnimals));
        System.out.println(String.format( "Sound making animals size : %d and they are %s", soundMakableAnimals.size(), soundMakableAnimals));
        System.out.println(String.format( "Swimmable animals size : %d and they are %s", swimmableAnimals.size(), swimmableAnimals));

    }
}
