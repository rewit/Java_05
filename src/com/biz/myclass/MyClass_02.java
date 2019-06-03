package com.biz.myclass;

public class MyClass_02 {

	//MyClass_02의 맴버변수
	public int num1 = 0;
	public int num2 = 0;

	
	//method 메서드	
	public void add() {
		System.out.println(num1 + num2); //멤버변수
		return;
	}
	public int add(int num1, int num2) { //매개변수
		//System.out.println(num1 + num2);
		return num1 + num2;
	}
	
	public void times() {
		System.out.println(num1 * num2);
		return;
	}
	
	public void minus() {
		System.out.println(num1 - num2);
		return;
	}
	
	public String add(String s1, String s2) {
		return s1 + s2;
	}
	
	public float addd(float f1, float f2) {
		return f1 + f2;
	}
	//void가 들어있는 형은 return을 생략 가능 (아무것도 없는 리턴) return만 단독으로 사용
	//void형이 아닌 형식은 반드시 뒤에 return문이 와야하고 뒤에 설정한 타입과 같은 타입이 return되야 한다.
	//return되는 형태 , 다시 담을 형태 모두 같은 타입이어야 한다.
	//-void형-
	//void가 있어있는 형(void형)은 보통 return을 생략한다
	//만약 return을 사용 할 시 아무런 값이 없이 사용한다.
	//return type이 있는 메서드(method)
	//return이 있는 메서드는 반드시 return문이 있어야한다.
	//return 되는 데이터형이 return type과 일치해야한다.
	//또한 호출한 곳에서 return되는 값을 사용하려면
	//같은 type의 변수에 받아야한다.
	
}
