package Lotto;

import java.util.Scanner;

public class LottoSeller {

	 Scanner scan = new Scanner(System.in);
	 private int pay;
	 private int lottoCount;     // 로또를 몇개 살 수 있는지
	 private static int input[] = new int[6];

	 public int getLottoCount() {
	     return lottoCount;
	 }

	 public void setLottoCount(int lottoCount) {
	     this.lottoCount = lottoCount;
	 }

	 // 금액을 투입하면 계산 후 자동 구입
	 public int buy() {
	     System.out.println("로또를 사기 위해 얼마를 내시겠습니까?");
	     pay = scan.nextInt();

	     // 금액 부족시
	     if(pay < 1000) {
	         System.out.println("금액이 부족합니다");
	         return 0;
	     }

	     // 살 수 있을때 한 개에 1000원이니 몇개 살 수 있는지
	     int count = pay / 1000;
	     return count;
	 }

	 // 수동으로 로또를 작성하는 코드
	 public int[] inputNum() {
		 int i = 0;
	     System.out.println("수동입니다. 45이하 숫자를 6개 입력하세요");
	     for (i = 0; i < 6; i++) {
	    	input[i] = scan.nextInt();
	     }

	     return input;
	 }

	}