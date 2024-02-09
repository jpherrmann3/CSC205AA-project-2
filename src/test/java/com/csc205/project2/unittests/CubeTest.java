package com.csc205.project2.unittests;

import org.junit.jupiter.api.Test;
import com.csc205.project2.Cube;
import static org.junit.jupiter.api.Assertions.*;

public class CubeTest {

    @Test
    public void testDefaultConstructor() {
        Cube cube = new Cube();
        assertEquals(0.0, cube.getWidth(), 0.0001);
    }

    @Test
    public void testParameterizedConstructor() {
        double width = 5.0;
        Cube cube = new Cube(width);
        assertEquals(width, cube.getWidth(), 0.0001);
    }

    @Test
    public void testSurfaceArea() {
        double width = 5.0;
        Cube cube = new Cube(width);
        double expectedArea = 6 * width * width;
        assertEquals(expectedArea, cube.surfaceArea(), 0.0001);
    }

    @Test
    public void testVolume() {
        double width = 5.0;
        Cube cube = new Cube(width);
        double expectedVolume = width * width * width;
        assertEquals(expectedVolume, cube.volume(), 0.0001);
    }

    @Test
    public void testToString() {
        double width = 5.0;
        Cube cube = new Cube(width);
        String expectedString = "Cube {width=5.0";
        assertTrue(cube.toString().contains(expectedString));
    }
}

