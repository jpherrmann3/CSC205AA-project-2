package com.csc205.project2;

public class Cylinder extends Shape {
    private double height;
    private double radius;

    // Default constructor
    public Cylinder() {
        this.height = 0.0;
        this.radius = 0.0;
    }

    // Constructor with height and radius arguments
    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cylinder {")
          .append("height=").append(height)
          .append(", radius=").append(radius)
          .append(", surface area=").append(surfaceArea())
          .append(", volume=").append(volume())
          .append("}");
        return sb.toString();
    }
}
