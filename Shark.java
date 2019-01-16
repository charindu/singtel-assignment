package dev.singtel.interview;

import dev.singtel.interview.until.Color;
import dev.singtel.interview.until.Size;

public class Shark extends Fish {

    private Color color;
    private Size size;

    public Shark() {
        this.color = Color.GREY;
        this.size = Size.LARGE;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String eat(Fish fish) {
        return "I am eating another fish:" + fish.toString();
    }

}
