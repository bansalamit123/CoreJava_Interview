package com.rays.oop;

public class Shapee {

	private String color;
	private int borderWidth;
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
		Shapee s=new Shapee();
		s.setBorderWidth(20);
		s.setColor("red");
		
		System.out.println(s.getBorderWidth());
		System.out.println(s.getColor());
	}
}
