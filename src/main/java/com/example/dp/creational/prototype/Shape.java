package com.example.dp.creational.prototype;
/*
We use prototype when we creating a new object is a heavy operation,
then we use prototype pattern to clone the object, and change some of the properties.
 */
public interface Shape {
    Shape clone();
    void draw();
}
