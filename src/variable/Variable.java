package variable;

import java.util.Scanner;

public class Variable {

	public static void main(String[] args) {
		// byte, int, short, long
		// float, double
		// char
		// boolean
		// 기본형: 계산을 위한 실제 값

		
//		// 참조형: 기본형을 제외한 나머지 타입, 클래스타입, null 또는 객체의 주소 값을 가진다.
//		Date today = new Date();
//		
//		// 상수의 변수명은 대문자로 한다.
//		final int MAX_SPEED = 5;
//		
//		// 8진수 앞에는 0을 써준다.
//		// 16진수 앞에는 0x를 붙여준다.
//		// 2진수 앞에는 0b를 붙여준다.
//		int octNum = 010;
//		int hexNum = 0x10;
//		int binNum = 0b10;
//		System.out.println(octNum);
//		System.out.println(hexNum);
//		System.out.println(binNum);
//		
//		// 실수 float의 리터럴에는 f나 F를 붙여준다.
//		// 실수 double의 경우에는 d나 D를 붙여야 하지만 안써줘도 된다.
//		float pi = 3.14e3f;
//		// e 10의 승수
//		double rate = 3140;
//		System.out.println(pi);
//		System.out.println(rate);
//		// p 2의 승수
//		double a = 0x0.2p-1;
//		System.out.println(a);
		
		// 문자 값 65가 저장
//		int i = 'A';
//		System.out.println(i);
//		
//		// long이 int보다 범위가 넓다. float보다 double의 범위가 넓다.
//		long b = 123;
//		double c = 3f;
//		System.out.println(c);
		
//		String a = "";
//		// char은 반드시 하나의 문자가 있어야 한다.
//		char b = ' ';
//		
//		// 좌에서 우로 계산 된다.
//		System.out.println(7+7+" ");
//		System.out.println(" "+7+7);
		
		// 진수 표기법
//		byte b = 1;
//		short s = 2;
//		char c = 'A';
//		
//		int finger = 10;
//		long big = 100_000_000_000L;
//		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
//		
//		int octNum = 010;
//		int hexNum = 0x10;
//		int binNum = 0b10;
//		
//		System.out.printf("b=%d%n", b);
//		System.out.printf("s=%d%n", s);
//		System.out.printf("c=%c, %d%n", c, (int)c);
//		System.out.printf("finger=[%5d]%n", finger);
//		System.out.printf("finger=[%-5d]%n", finger);
//		System.out.printf("finger=[%05d]%n", finger);
//		System.out.printf("big=%d%n", big);
//		System.out.printf("hex=%#x%n", hex);
//		System.out.printf("octNum=%o, %d%n", octNum, octNum);
//		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
//		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
		
		// 실수 와 문자열 표기법
//		String url = "www.codechobo.com";
//		float f1 = .10f;
//		float f2 = 1e1f;
//		float f3 = 3.14e3f;
//		double d = 1.23456789;
//		
//		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
//		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
//		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
//		
//		System.out.printf("d=%f%n", d);
//		System.out.printf("d=%14.10f%n", d);
//		System.out.printf("url=%20s%n", url);
//		System.out.printf("url=%-20s%n", url);
//		System.out.printf("url=%.8s%n", url);
		
		//scanner
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두자리 정수를 하나 입력해주세요.>");
		int input= scanner.nextInt();
		
		if(input==123) {
			System.out.println(":->");
		} else {
			System.out.println(":-<");
		}
	}
}
