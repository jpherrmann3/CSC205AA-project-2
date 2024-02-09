package com.csc205.project2;

public class Cube extends Shape {
    private double width;

    // Default constructor
    public Cube() {
        this.width = 0.0;
    }

    // Constructor with width argument
    public Cube(double width) {
        this.width = width;
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double surfaceArea() {
        return 6 * width * width;
    }

    @Override
    public double volume() {
        return width * width * width;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cube {")
          .append("width=").append(width)
          .append(", surface area=").append(surfaceArea())
          .append(", volume=").append(volume())
          .append("}");
        return sb.toString();
    }
}
