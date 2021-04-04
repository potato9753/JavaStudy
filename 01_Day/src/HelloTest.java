
public class HelloTest {
	
	// signature
	public static void main(String[] args) {// 프로그램 시작점 역할

		//1. 줄 바꿔서 출력 ==> println
		System.out.println("HelloWorld");
		System.out.println("이재진");
		System.out.println();
		
		//2. 줄바꿈 없이 출력 ==> print
		System.out.print("HelloWorld");
		System.out.print("홍길동");
		System.out.println();
		
		//3. 포맷지정
		
		/*
		 *   %s: 문자열==> 반드시 "" 사용
		 *   %d: 정수
		 *   %f: 실수
		 *   %c: 문자==> 반드시 '' 사용
		 *   %b: 논리값
		 */
		
		System.out.printf("이름:%s 나이:%d 키:%f 성별:%c 결혼여부:%b",
				"홍길동", 20, 175.32, '남', true);
		

	}

}

