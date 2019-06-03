package com.biz.var;

public class Var_10 {

	public static void main(String[] args) {

		//만약 i 값이 9인 경우
		for( int i = 2 ; i <= 100 ; i++) {
				int index = 2;
				for(index = 2; index < i ; index++) {
					//index가 3이 되는 경우
					//9 % 3 == 0 의 조건문이 true가 되고
					//9 % 4 이후는 계산 할 필요가 없다
					if(i%index==0) {
						break;
				}
			} if(index >= i) {
				System.out.println(index+"는 소수");
			}
				//break 이후 실행되는 곳
				//i 값이 소수이면 
				//		index >= i
				//i 값이 소수가 아니면
				//		index < i
		}
	}
}
