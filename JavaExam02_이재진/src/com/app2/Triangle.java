package com.app2;

public class Triangle extends shape implements Resize {

	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	public Triangle(int width, int height, String colors) {
		super(width, height, colors);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setResize(int size) {
		super.setHeight((int)super.getHeight()+size);

	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
