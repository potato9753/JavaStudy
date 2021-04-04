package com.app1;

public class Truck extends Car {

	public Truck() {
		// TODO Auto-generated constructor stub
	}

	public Truck(double restOil, int curWeight) {
		super(restOil, curWeight);
		// TODO Auto-generated constructor stub
	}

	public Truck(int maxWeight, double oilTankSize, double effciency) {
		super(maxWeight, oilTankSize, effciency);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getRestOil() {
		return super.getRestOil();
	}

	@Override
	public String toString() {
		return getMaxWeight()+ "\t"  + getOilTankSize()+"\t"  + getRestOil()+"\t"  + getCurWeight()+"\t"  + getEffciency();
	}
	
	public double getEfficiency() {
		return super.getEffciency()-((super.getCurWeight())/5)*(0.2);
	}

	int arr[5] = new int[];
		
	@Override
	public void moving(int distance) {
		super.setRestOil(super.getRestOil()-this.calcOil(distance));
	}

	private double calcOil(int distance) {
		return distance/getEfficiency();
	}
	
	public int getCost(int distance) {
		return (int)(this.calcOil(distance))*3000;
		
	}
}
