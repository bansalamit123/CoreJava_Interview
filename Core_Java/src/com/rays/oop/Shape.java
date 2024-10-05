package com.rays.oop;

public class Shape {

	private String color=null;
	private int borderWidth=0;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	
	public static void main(String[] args) {
		Shape s=new Shape();
		s.setBorderWidth(20);
		s.setColor("red");
		
		System.out.println(s.getBorderWidth());
		System.out.println(s.getColor());
	}
}
