package com.binar.example.challange1.shapes3d;

public class SquarePrism implements Shapes3D {
    private final float l;
    private final float w;
    private final float h;

    public SquarePrism(float l, float w, float h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    @Override
    public float getVolume() {
        return l * w * h;
    }
}
