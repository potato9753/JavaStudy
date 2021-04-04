package com.app2_가변인자;

public class TestMain {
	
	public static void method(double ... m) { // 내부적으로 배열로 관리
		for (double d : m) {
			//System.out.println(d);
			//System.out.printf("%s","aaa");
			//System.out.printf("%s\n","%d\n","aaa",20);//printf 는 대표적인 가변인자
			System.out.printf("%.2f \n",d);
		}
	}
	
	public static void main(String[] args) {
		
		method(3.14);
		method(3.14, 44.3344);
		method(3.14, 44.334, 3333.32245);

	}

}
