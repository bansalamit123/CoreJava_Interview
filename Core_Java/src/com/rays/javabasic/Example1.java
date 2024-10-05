package com.rays.javabasic;
public class Example1 {
	//1. Using Class.forName() and newInstance()
    public void display() {
        System.out.println("Object created using Class.forName() and newInstance()");
    }

    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("com.rays.javabasic.Example1");
            Example1 example1 = (Example1) clazz.getDeclaredConstructor().newInstance();
            example1.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
