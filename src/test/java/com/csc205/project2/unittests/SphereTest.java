package com.csc205.project2.unittests;

import org.junit.jupiter.api.Test;

import com.csc205.project2.Sphere;

import static org.junit.jupiter.api.Assertions.*;


public class SphereTest {

    @Test
    public void testDefaultConstructor() {
        Sphere sphere = new Sphere();
        assertEquals(0.0, sphere.getRadius(), 0.0001);
    }

    @org.junit.jupiter.api.Test
    public void testParameterizedConstructor() {
        double radius = 5.0;
        Sphere sphere = new Sphere(radius);
        assertEquals(radius, sphere.getRadius(), 0.0001);
    }

    @org.junit.jupiter.api.Test
    public void testSurfaceArea() {
        double radius = 5.0;
        Sphere sphere = new Sphere(radius);
        double expectedArea = 4 * Math.PI * radius * radius;
        assertEquals(expectedArea, sphere.surfaceArea(), 0.0001);
    }

    @org.junit.jupiter.api.Test
    public void testVolume() {
        double radius = 5.0;
        Sphere sphere = new Sphere(radius);
        double expectedVolume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        assertEquals(expectedVolume, sphere.volume(), 0.0001);
    }

    @org.junit.jupiter.api.Test
    public void testToString() {
        double radius = 5.0;
        Sphere sphere = new Sphere(radius);
        String expectedString = "Sphere {radius=5.0";
        assertTrue(sphere.toString().contains(expectedString));
    }
}
