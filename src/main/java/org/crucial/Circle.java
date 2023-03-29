package org.crucial;

public class Circle implements Geometric {
    public int x;
    public int y;
    public int radius;
    Circle(int radius) {
        this.radius = radius;
    }
    Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public int getSquare() {
        var square = Math.PI * radius * radius;
        return (int) square;
    }

    public String getName() {
        return "circle";
    }
}
