package com.binar.example.challange1.shapes3d;

public class Cube implements Shapes3D {
    private final float l;
    public Cube(float l) {
        this.l = l;
    }
    @Override
    public float getVolume() {
        return l * l * l;
    }
}
