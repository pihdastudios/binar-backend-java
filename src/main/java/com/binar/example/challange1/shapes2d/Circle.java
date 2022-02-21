package com.binar.example.challange1.shapes2d;

public class Circle implements Shapes2D {
    private final float r;
    public Circle(float r) {
        this.r = r;
    }
    @Override
    public float getArea() {
        return r * r * 3.14f;
    }
}
