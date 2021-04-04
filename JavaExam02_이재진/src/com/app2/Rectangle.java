package com.app2;

public class Rectangle extends shape implements Resize {

	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int width, int height, String colors) {
		super(width, height, colors);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setResize(int size) {
		super.setWidth(((int)super.getWidth()+size);

	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
