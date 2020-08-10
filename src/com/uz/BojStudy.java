package com.uz;

import java.util.Scanner;

public class BojStudy {

	Scanner sc = new Scanner(System.in);
	
	public void boj14568() {
		
	//사탕갯
		int n = sc.nextInt();
		
		int count = 0;
		
		if(n >= 1 && n <= 100){
			for(int i=1; n-(2*i)> 3; i++){
				count += ((n-(2*i))-2)/2;
			};
		};
		
		System.out.println(count);
		
	}
	
	
	//-------------------------------------
	
	public void boj15813() {
		
	//영어이름 점수 
		
		System.out.println("영어이름입력 : ");
		String name = sc.nextLine();
		
		int sum = 0;
		int A = 'A';

 		for(int i = 0; i<name.length(); i++) {
 			sum += (name.charAt(i)+1)-A;
 		}
 		
 		System.out.println(name + "의 합산 : " + sum);
 	
	}
	

	
}



