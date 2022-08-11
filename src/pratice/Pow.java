
package pratice;

import java.util.Scanner;

public class Pow {
	public Pow() {
		Scanner stdin = new Scanner(System.in);
		int result = 1;
		System.out.print("승수: ");
		int pow = stdin.nextInt();
		int n = pow;
		// Q: 아래 while 반복문을 작성하시오.
		int i=0;
		while(i<n){
		  result *= 2;
		  i++;
		}

		System.out.println("2의 " + pow + "제곱근은 " + result + "입니다.");
	}

}
