package com.app5_static;

class Counter{
	
	private int num; // 인스턴스 변수
	static int count;
	
	public Counter() {
		count++;
	}
	
	public int getNum() {
		return num;
		//return count; ==> 이거는 count가 먼저 생성되어 있기때문에 에러없이 실행가능 
	}
	
	//static 메서드 사용시 주의할 점 : 인스턴스변수, this 사용 불가
	public static int getCount() {
		
		//System.out.println(num);
		return count;
		//return num; ==> static이 먼저 생성되기에 num(인스턴스변수)을 참조할 수 없어서 에러
	}
}//end class


public class StaticTest2 {

	public static void main(String[] args) {
		// Counter 클래스의 객체생성 횟수 알아보기
		
		System.out.println(Counter.count);
		System.out.println(Counter.getCount());
		
		Counter c = new Counter();
		//System.out.println(c.getNum());
		System.out.println(Counter.count);
		System.out.println(Counter.getCount());
		
		Counter c2 = new Counter();
		//System.out.println(c.getNum());
		System.out.println(Counter.count);
		System.out.println(Counter.getCount());
		
	}

}
