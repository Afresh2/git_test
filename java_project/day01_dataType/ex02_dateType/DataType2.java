package ex02_dateType;

public class DataType2 {
	public static void main(String[] args) {
		String str = "A";
		char ch1 = 'A';
		char ch2 = 67;
		char ch3 = 'b';
		
		int su = 20; double dd = 12.34;
		
		System.out.println(ch1);
		System.out.println((int)ch1);
		System.out.println(ch2 + ", " + (char)ch2);
		System.out.println("실수형 데이터 : " + dd);
		System.out.printf("%f %f\n", dd, 33.5678);
		System.out.printf("%10.1f %.2f\n", dd, 33.5678);
		
		for(int i = 65; i <= 90; i++) {
			System.out.print((char)i + " ");
		}
		System.out.println("\n\n=============================");
		for(int i = 'a'; i <= 'z'; i++) {
			System.out.print((char)i + " ");
		}
		
		System.out.println("\n\n boolean type");
		boolean flag = true;
		// int b = flag; // error.
		System.out.println(flag);
	}
}
