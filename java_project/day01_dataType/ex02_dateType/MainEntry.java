package ex02_dateType;

public class MainEntry {

	public static void main(String[] args) {
		int su = 9;
		char ch = 'A'; // 단일문자는 홑따옴표 (char : 2byte)
		String str = "korea";// 여러문자는 String클래스에 넣는다
		double d = 12.34;
		// float f = 12.3; // error
		float f = 12.3f;
		
		System.out.println(100);
		// 명시적이지 않을 때, 정수형에서는 int형이 default. int형으로 인식을 한다. (int는 4byte)
		System.out.println(100L);
		// long형이라고 시스템이 이해한다.(long은 8byte)
		
		System.out.println(12.5);
		// 명시적이지 않을 때, 실수형에선 double형이 default.
		System.out.println(12.5F);
		// float
		
		System.out.println(su);
		System.out.println(ch);
		System.out.println(str);
		System.out.println(d);
		
		System.out.println(su + ", " + ch + ", " + str);
		System.out.println("su = " + su);
		
		System.out.println(); // enter
		// int su2;
		// System.out.println(su2); // error
		// --> 지역변수는 반드시 초기화하고 사용한다.
		int su2 = 100;
		System.out.println(su2);
		
		//*-----------------------------------------
		int x = 2; // 기본자료형
		Integer y = 2 ; // 참조형(Wrapper타입)
		
		// autoboxing / unboxing
		// jdk5.x버전 부터는 자동형변환
		x = y; // unboxing : Integer -> int
		y = x; // autoboxing : int -> Integer
		
		String str3 = "A"; // A\0 : null문자(\0) 포함
		char ch3 = 'A'; // null문자 미포함
		
	}

}


// 한줄 주석 (ctrl + /)

/*
	여러줄 주석 (ctrl + shift + /)
*/