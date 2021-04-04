package com.app1;

public class Car extends Vehicle {
	
	private double restOil;
	private int curWeight;
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(int maxWeight, double oilTankSize, double effciency) {
		super(maxWeight, oilTankSize, effciency);
		// TODO Auto-generated constructor stub
	}
	public Car(double restOil, int curWeight) {
		this.restOil = restOil;
		this.curWeight = curWeight;
	}
	public double getRestOil() {
		return restOil;
	}
	public void setRestOil(double restOil) {
		this.restOil = restOil;
	}
	public int getCurWeight() {
		return curWeight;
	}
	public void setCurWeight(int curWeight) {
		this.curWeight = curWeight;
	}
	
	
	
	@Override
	public String toString() {
		return "Car [restOil=" + restOil + ", curWeight=" + curWeight + ", toString()=" + super.toString() + "]";
	}
	public void addOil(int oil) {
		if(this.restOil+oil <= getOilTankSize()) {
			this.restOil += oil;
		}else {
			this.restOil = getOilTankSize();
		}
	}
	public void moving(int distance) {
		this.restOil -= getEffciency() * distance;
	}
	
	public void addWeight(int weight) {
		if(this.curWeight + weight <= getMaxWeight()) {
			this.curWeight += weight;
		}else {
			this.curWeight = getMaxWeight();
		}
	}
}
