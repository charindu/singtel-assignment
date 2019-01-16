package dev.singtel.interview;

import dev.singtel.interview.until.Color;
import dev.singtel.interview.until.Size;

public class Clownfish extends Fish {

    private Color color;
    private Size size;

    public Clownfish() {
        this.color = Color.ORANGE;
        this.size = Size.SMALL;
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

    public String makeJokes() {
        return "Knock Knock...";
    }

}
