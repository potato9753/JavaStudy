package com.app4_스트림;

interface Flyer{
	public abstract void fly();
}

public class StreamTest3 {

	public static void main(String[] args) {
		
		//익명 클래스(이름없는 클래스)
		Flyer f = new Flyer() {
			
			@Override
			public void fly() {
				System.out.println("아무거나");
			}
		};
		f.fly();
		
		///////////////////////////////
		//람다함수
		Flyer f2 = ()->{
			System.out.println("아무거나");
		};
		f2.fly();
		
		
	}//end main

}//end class
