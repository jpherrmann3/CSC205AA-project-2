package com.csc205.project2;

/*
 * Chat GPT Generated the Class
 * https://chat.openai.com/c/81eb7348-ab9a-470e-816f-187c14939719
 */

/*
Let's now do Cube.

there will be one field: width. It is a double.

It must implement a default constructor, and a constructor taking a double as an argument.

Here are the additional methods:

- getWidth() returns double
- setWidth(double) returns void
- surfaceArea() returns double
- toString() returns overwrites default toString using stringBuilder.
- volume() returns double

 */

// A class representing the Three Dimensional Shape, Cube
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
