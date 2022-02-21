package com.binar.example.challange1.shapes3d;

public class Cylinder implements Shapes3D {
    private final float r;
    private final float h;

    public Cylinder(float r, float h) {
        this.r = r;
        this.h = h;
    }

    @Override
    public float getVolume() {
        return r * r * h * 3.14f;
    }
}
