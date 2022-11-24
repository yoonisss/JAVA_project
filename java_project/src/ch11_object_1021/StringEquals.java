package ch11_object_1021;

public class StringEquals {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println("str1 의 참조형 변수의 메모리 주소값 : " + str1);
		System.out.println("str2 의 참조형 변수의 메모리 주소값 : " + str2);
		System.out.println(str1 == str2);  // 두 스트링 인스턴스의 주소 값은 다름
		System.out.println(str1.equals(str2)); // String 클래스의 equals 메소드가 재정의 됨
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1 == i2);   // 두 정수 인스턴스의 주소 값은 다름 
		System.out.println(i1.equals(i2)); // Integer 클래스의 equals 메소드가 재정의 됨
	}
}
