package com.rays.javabasic;
public class Example2 implements Cloneable {
	//2. Using Clone
    public void display() {
        System.out.println("Object created using clone()");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            Example2 original = new Example2();
            Example2 clone = (Example2) original.clone();
            clone.display();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}