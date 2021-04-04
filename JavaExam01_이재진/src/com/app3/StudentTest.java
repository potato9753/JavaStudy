package com.app3;

public class StudentTest {

	public static void main(String[] args) {
		
		
		double sum_age = 0, sum_hei = 0, sum_wei = 0; //나이와 신장 무게 평균 산출을 위한 변수 생성
		
		Student studentArray [] = {new Student("홍길동", 15, 170, 80),new Student("한사람", 13, 180, 70),new Student("임걱정", 16, 175, 65)};
		
		int min_age = studentArray[0].getAge() , max_age = studentArray[0].getAge(); // 나이 최대, 최소 변수 생성
		String min = studentArray[0].getName(), max = studentArray[0].getName(); // 최대,최소 나이의 학생 이름 변수
		
		System.out.println("이름\t나이\t신장\t몸무게");
		
		for (Student student : studentArray) {
			System.out.println(student.studentInfo());
			
			//평균 나이, 신장, 몸무게 산출을 위해 배열 탐색하며 누적해서 더한다.
			sum_age += student.getAge();
			sum_hei += student.getHeight();
			sum_wei += student.getWeight();
			
			//for문을 돌며 나이가 최소 나이보다 적으면 최소나이와 이름 변경
			if(student.getAge()<min_age) {
				min_age = student.getAge();
				min = student.getName();
			}
			//for문을 돌며 나이가 최대 나이보다 크면 최대나이와 이름 변경
			if(student.getAge()>max_age) {
				max_age = student.getAge();
				max = student.getName();
			}
			
		}
		System.out.printf("\n나이 평균 : %.3f\n",sum_age/3);
		System.out.printf("신장 평균 : %.3f\n",sum_hei/3);
		System.out.printf("몸무게 평균 : %.3f\n",sum_wei/3);
		
		System.out.println("\n나이가 가장 많은 학생: "+ max);
		System.out.println("나이가 가장 적은 학생: " + min);
	}

}
