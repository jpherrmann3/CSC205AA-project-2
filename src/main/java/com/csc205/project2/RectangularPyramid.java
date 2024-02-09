package com.csc205.project2;

public class RectangularPyramid extends Shape {
    private double length;
    private double width;
    private double height;

    // Default constructor
    public RectangularPyramid() {
        this.length = 0.0;
        this.width = 0.0;
        this.height = 0.0;
    }

    // Constructor with length, width, and height arguments
    public RectangularPyramid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Setter for length
    public void setLength(double length) {
        this.length = length;
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double surfaceArea() {
        return length * width + 0.5 * width * Math.sqrt(Math.pow(length / 2, 2) + Math.pow(height, 2))
                + 0.5 * length * Math.sqrt(Math.pow(width / 2, 2) + Math.pow(height, 2));
    }

    @Override
    public double volume() {
        return (length * width * height) / 3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RectangularPyramid {")
          .append("length=").append(length)
          .append(", width=").append(width)
          .append(", height=").append(height)
          .append(", surface area=").append(surfaceArea())
          .append(", volume=").append(volume())
          .append("}");
        return sb.toString();
    }
}
