package com.uz;

public class RecursiveMethod {
	
	
	public int Recursive(int num) {
		
		if(num == 0) {
			return 0;
		}else {
			
			return num+Recursive(num-1);
		}
		
	}

}
