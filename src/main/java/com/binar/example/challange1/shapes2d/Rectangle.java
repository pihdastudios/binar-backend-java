package com.binar.example.challange1.shapes2d;

public class Rectangle implements Shapes2D {
    private final float l;
    private final float w;
    public Rectangle(float l, float w) {
        this.l = l;
        this.w = w;
    }
    @Override
    public float getArea() {
        return l * w;
    }
}
