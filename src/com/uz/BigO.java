package com.uz;

public class BigO {

	
	// O(n) 의 시간복잡도 
	public void bigO1(int num) {
		
		int result = 0;
		
		for (int i = 0; i<= num; i++) {
			result += i;
		}
		System.out.println(result);
	}

	
	// O(1) 의 시간복잡도 

	public void bigO2(int num) {
		int result = num * (num+1) / 2 ;
		
		System.out.println(result);
		
	}
	
	
}
