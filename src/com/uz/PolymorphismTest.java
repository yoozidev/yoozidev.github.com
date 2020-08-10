package com.uz;

import java.util.Scanner;

public class PolymorphismTest {

	
	interface Character{
		void name();
	}
	
	class One implements Character{

		@Override
		public void name() {
			System.out.println("나는 첫번째 자식.");
		}
	}
	
	class Two implements Character{
		@Override
		public void name() {
			System.out.println("나는 두번째 자식.");
		}
	}
	
	public class PolyRunTest{
		public static void main(String[] args) {
			Character ch = null;
			
			System.out.println(" 1 / 2 ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			
			if(num ==1 ) {
				ch = new One();
			}else if(num ==2 ) {
				ch = new Two();
			}
			
			ch.name();
		}
	}
	
	
}





