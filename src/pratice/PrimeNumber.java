package pratice;

import java.util.Scanner;

public class PrimeNumber {
	
	Scanner stdin = new Scanner(System.in);
	
	public PrimeNumber() {
		System.out.print("소수인지 판단할 숫자: ");
		int divisor = 2;
		int num = stdin.nextInt();
		boolean isPrime = true;
		while(divisor < num){
			  if(num % divisor ==0){
			    isPrime = false;
			    break;
			  }
			  divisor++;
			  }
			  
			if (isPrime) {

			System.out.println(num + "은 소수입니다.");
			} else {

			System.out.println(num + "은 소수가 아닙니다.");

			}
	}
	
	  

}
