package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
//question 1 and 2
class Vector3D {
    private double x;
    private double y;
    private double z;


    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}
