package ch9_abstractex_1020;

public abstract  class Computer { // 추상클래스입니다.

	public abstract void display(); // 추상메서드입니다.
	public abstract void typing(); // 추상메서드입니다.
	public void turnOn()
	{
		System.out.println("전원을 켭니다.");
	}
	public void turnOff()
	{
		System.out.println("전원을 끕니다.");
	}
}
