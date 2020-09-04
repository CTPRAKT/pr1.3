package com.company;

public class ball {
    private int radius;
    private String material;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public ball(String m,int r){
        radius=r;
        material=m;
    }
}
