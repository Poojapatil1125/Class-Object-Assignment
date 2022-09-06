package com.Question1;
//1) Create a class Box that uses a parameterized 
//constructor to initialize the dimensions of a box.
//The dimensions of the Box are width, height, depth.
//The class should have a method that can return the volume
//of the box.Create an object of the Box class and test the 
//functionalities.
public class Box {
	int length;
    int width;
    int height;
    int volume;
    public Box(int length, int width, int height) {
        super();
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public int getVolume() {

        volume = length * width * height;

        return volume;
    }
    public static void main(String[] args) {
        Box b = new Box(2, 3, 4);
        System.out.println("The Volume of Box is " + b.getVolume());
    }
}
