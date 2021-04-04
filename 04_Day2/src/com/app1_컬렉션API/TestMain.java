package com.app1_컬렉션API;

public class TestMain {

	public static void main(String[] args) {
		
		/*
		 * 		자바에서 데이터 저장 방법 3가지
		 * 
		 * 		1. 변수
		 * 			- 값 하나만 저장
		 * 			- 기본형 변수 (변수에 가면 실제 값이 존재)
		 * 			- 참조형 변수 (변수에 가면 주소 값이 존재)
		 * 			- 선언 위치에 따라 로컬변수, 인스턴스변수, 클래스변수로 나뉜다.
		 * 
		 * 		2. 배열
		 * 			- 여러개 저장
		 *			- 같은 타입만 저장 가능
		 *			- 크기 변경 불가능(*****)
		 *			- 배열명은 참조형
		 *			- 배열에 저장되는 데이터는 기본형 및 참조형 모두 가능
		 * 
		 * 		3. 컬렉션 API
		 * 			- 여러개 저장
		 * 			- 서로 다른 데이터 타입 저장 가능
		 * 			- 크기변경 가능
		 * 			- 참조 데이터만 저장 가능(기본형은  wrapper 클래스로 저장 가능)
		 * 				==> 결국 모든 데이터 저장 가능하다.
		 * 
		 * 
		 * 		기본형			wrapper클래스
		 * 		----------------------------
		 * 		byte			Byte
		 * 		short			Short
		 * 		int				Integer
		 * 		long			Long
		 * 		
		 * 		float			Float
		 * 		double			Double
		 * 		
		 * 		char			Character
		 * 
		 * 		boolean			Boolean
		 * 
		 * 		4. 컬렉션 API 종류
		 * 		==> java.util
		 * 
		 * 				Collection(인터페이스)							Map(인터페이스)
		 * 					|											|
		 * 		Set(인터페이스)		List(인터페이스)						HashMap(클래스)
		 * 			|				|								Properties(클래스)
		 * 			|				|
		 * 		HashSet(클래스)	ArrayList(클래스)
		 * 
		 * 		==> 값만 저장											==> 값과 값에 해당되는 이름(키) 쌍으로 저장;
		 * 		==> 원하는 데이터를 찾으려면 완전 탐색이 필요하다.					==> key값만 알면 바로 value를 얻을 수 있다.
		 * 		
		 * 
		 * 		Set 계열 : 데이터 저장순서없고 중복이 불가능하다.
		 * 		List 계열 : 데이터 저장 순서가 있고 중복이 가능하다.
		 * 		Map 계열 : key/value 쌍으로 저장, 데이터 저장순서 없고, key값은 중복이 불가능하지만 value 값은 중복이 가능하다.
		 * 
		 */
	}

}
