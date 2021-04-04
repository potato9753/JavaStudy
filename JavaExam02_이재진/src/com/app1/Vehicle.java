package com.app1;

public class Vehicle {
	
	private int maxWeight;
	private double oilTankSize;
	private double effciency;
	
	public Vehicle(){
		
	}

	public Vehicle(int maxWeight, double oilTankSize, double effciency) {
		this.maxWeight = maxWeight;
		this.oilTankSize = oilTankSize;
		this.effciency = effciency;
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	public double getOilTankSize() {
		return oilTankSize;
	}

	public void setOilTankSize(double oilTankSize) {
		this.oilTankSize = oilTankSize;
	}

	public double getEffciency() {
		return effciency;
	}

	public void setEffciency(double effciency) {
		this.effciency = effciency;
	}

	@Override
	public String toString() {
		return "Vehicle [maxWeight=" + maxWeight + ", oilTankSize=" + oilTankSize + ", effciency=" + effciency + "]";
	}
	
	
}
