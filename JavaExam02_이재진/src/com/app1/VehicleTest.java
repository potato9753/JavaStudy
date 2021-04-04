package com.app1;

public class VehicleTest {

	public static void main(String[] args) {
		
		Truck car = new Truck(1000,100,5);
		System.out.println("최대적재중량" + "\t" + "오일탱크크기" + "\t"+"잔여오일량" + "\t"+"현재적재중량" + "\t"+"연비");
		System.out.println(car);
		car.addOil(50);
		System.out.println(car);
		car.addWeight(100);
		System.out.println(car);
		car.moving(30);
		System.out.println();
		car.addWeight(100);
		System.out.println(car.getCost(30));
		
		
	}

}
