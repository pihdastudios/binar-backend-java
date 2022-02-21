package com.binar.example.challange1.shapes2d;

public class Square implements Shapes2D {
    private final float l;
    public Square(float l) {
        this.l = l;
    }
    @Override
    public float getArea() {
        return l * l;
    }
}
