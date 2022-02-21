package com.binar.example.challange1.shapes2d;

public class Triangle implements Shapes2D {
    private final float w;
    private final float h;
    public Triangle(float w, float h) {
        this.w = w;
        this.h = h;
    }
    @Override
    public float getArea() {
        return w * h * 0.5f;
    }
}
