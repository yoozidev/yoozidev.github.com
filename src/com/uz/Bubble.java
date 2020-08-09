package com.uz;

public class Bubble {

	
	public void bubble() {
		

		int[] iarr = {3,15,2,35,7};
		int indexOfLastUnsortedElement = iarr.length-1;
		boolean switched;
		
		do {
			
			switched = false;
			for (int i =0; i<indexOfLastUnsortedElement; i++) {
				
				if (iarr[i] > iarr[i+1]) {
					int temp = iarr[i];
					iarr[i] = iarr[i+1];
					iarr[i+1] = temp;
					switched = true;
				}
			}
			
		}while(switched);
		
		for(int i : iarr) {
			
			System.out.println(i);
		}
		
	}
	
}



