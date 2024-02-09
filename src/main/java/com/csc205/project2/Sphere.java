package com.csc205.project2;

/* Chat GPT was asked about this class as well

Let's move onto Sphere. Remember that Sphere will inherit Shape as well.

Fields:
- radius: is a double

Methods:
- default constructor (no arguements)
- constructor with double as argument.
- get and set Radius
- surfaceArea() returns double
- toString() method overrides the default implementation to provide a meaningful string representation of the cube using a StringBuilder.
- volume() returns double

 */

public class Sphere extends Shape{

    private double radius;

    public Sphere() {
        super();
        this.radius = 0.0;
    }

    public Sphere(double radius) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double surfaceArea() {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }

    public double volume() {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sphere {");
        sb.append("radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
