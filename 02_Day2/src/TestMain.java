import com.ktds.Cat;
import com.ktds.Person;

public class TestMain {

	public static void main(String[] args) {
		
		/*
		 *		package?
		 *
		 *		1. 목적: 여러 클래스 파일 관리(윈도우 폴더 기능)
		 *
		 *		2. 문법
		 *
		 *			package 패키지명.서브패키지명;
		 *
		 *		3. 특징
		 *			- package가 서로 다으면 접근불가 ==> 해결은 import문 사용
		 * 			- 클래스당 한번만 사용 가능
		 * 			- API에서 사용하는 패키지명은 사용하지 말자. ==> 100% 사용자의 패키지와 다르다. 
		 * 				==> 반드시 import 
		 * 				단, java.lang은 자동 import된다. 역으로 java.lang 제외한 나머지는 모두 import해서 사용해야한다.
		 * 
		 * 		import ? ==> Ctrl+Shift+O
		 * 
		 * 		1. 목적: package가 다르면 접근이 불가능한데 이것을 해결
		 * 		2. 문법
		 * 
		 * 			import 패키지명.서브패키지명.클래스명; // 권장방법
		 * 			import 패키지명.서브패키지명.*; // 모든 클래스 지정방법, 가독성이 떨어지기 때문에 권장안함(어떤것을 사용하는지 모름)
		 * 
		 * 		3. 특징
		 * 			- 클래스안에서 여러번 사용 가능
		 * 			- 한꺼번에 import 받는 방법은 ctrl+shift+영문자o
		 * 			
		 * 
		 */
		
		Cat c = new Cat();
		Person p = new Person();
	}

}
