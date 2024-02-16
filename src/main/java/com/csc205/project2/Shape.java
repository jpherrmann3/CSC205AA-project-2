package com.csc205.project2;

/*
 * Chat GPT Generated the Class
 * https://chat.openai.com/c/81eb7348-ab9a-470e-816f-187c14939719
 */

/*

Now lets move onto `Shape`. It will implement ThreeDimensionalShape and also add a default constructor. There are no fields.

 */

public abstract class Shape implements ThreeDimensionalShape {

    // Default constructor
    public Shape() {
        // No fields to initialize
    }

    @Override
    public abstract double surfaceArea();

    @Override
    public abstract double volume();

}

