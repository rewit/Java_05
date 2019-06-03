package com.biz.myclass;

public class Oop_09 {

	public static void main(String[] args) {

		MyClass_02 mc = new MyClass_02(); //mc라는 객체를 생성 (복제)
		
		mc.num1 = 30;  //mc라는 객체에 num를 셋팅
		mc.num2 = 50;
		mc.add(); //맴버변수 		//mc라는 객체에 method(add,times,minus)를 호출
		mc.add(50,20); //매개변수
		mc.times();
		mc.minus();
		
		int ret = mc.add(50,20);  //결과를 MyClass(mathod)에 다시 보냄
		System.out.println(ret); //50과 20을 불러오고 그 결과값을 다시 ret에 보냄
		System.out.println(mc.add(100, 200));
		
		
	
		
	}

}
