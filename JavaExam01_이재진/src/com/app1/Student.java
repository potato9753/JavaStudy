package com.app1;

public class Student {
	public String name;
	public int korean;
	public int english;
	public int math;
	public int science;
	public Student() {
		
	}
	
	public Student(String name, int korean, int english, int math, int science) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}
	
	//평균점수를 구하기 위하여 모두 double로 형변환해서 더하고 나눈다.
	public double getAvg() {
		return ((double)korean + (double)english + (double)math + (double)science)/4;
	}
	
	//학점을 정하기 위한 다중 if-else문
	public String getGrade() {
		if(getAvg()<=100 && getAvg()>=90) {
			return "A학점";
		}
		else if(getAvg()<=89 && getAvg()>=70) {
			return "B학점";
		}
		else if(getAvg()<=69 && getAvg()>=50) {
			return "C학점";
		}
		else if(getAvg()<=49 && getAvg()>=30) {
			return "D학점";
		}
		else {
			return "F학점";
		}
	}
}
