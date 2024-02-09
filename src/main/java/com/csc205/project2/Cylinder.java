package com.csc205.project2;
/*
 * Chat GPT Generated the Class
 * https://chat.openai.com/c/81eb7348-ab9a-470e-816f-187c14939719
 */

 /*
Let's move onto Cylinder. Again, cylinder will inherit from Shape.

Fields:
- height(double)
- radius(double)

Methods:
- Cylinder()
- Cylinder(double, double)
- getters and setters for height and radius
- surfaceArea() -> double
- volume() -> double
- toString() -> string. Using StringBuilder. Make sure to include surfaceArea and volume in the toString.
  */

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
