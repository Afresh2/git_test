package ex02_dateType;

public class DataType {

	public static void main(String[] args) {
		// ** data type별 크기 범위
		short sh = -32768; // -32,768 ~ 32,767 (2byte)
		int su = 32769; // -21억 ~ 21억 (4byte)
		
		su = sh; // 묵시적(자동) 형변환 : 2byte를 4byte에 넣을 수 있다.
		//sh = su; // error
		sh = (short)su; // 명시적 형변환 : 4byte를 2byte에 넣을때, 데이터 손실 발생
		
		// ** ASCII code
		char ch = 'A';
		
		System.out.println(ch + ", ASCII code = " + (int)ch); // 65
		System.out.println('B');
		System.out.println((int)'b'); // 98
		
		// ** 진수
		int num = 9; // 10진수
		int xNum = 0x9; // 0x숫자 : 16진수
		int oNum = 011; // 0숫자 : 8진수
		int bNum = 0B1010; // 0b숫자 : 2진수
		
		System.out.println("2진수 : " + bNum); // 10 (= 8+2)
		System.out.println(num); // 9
		System.out.println(xNum); // 9
		System.out.println(oNum); // 9

	}

}
