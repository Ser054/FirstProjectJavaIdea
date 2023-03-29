package org.crucial.geometry;

import org.crucial.Geometric;

public class Quadrate implements Geometric {
    private int side;

    public Quadrate(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }
    public String getName() {
        return new String("quadrate");
    }
    public int getSquare() {
        return side * side;
    }
}
