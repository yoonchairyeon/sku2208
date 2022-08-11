package Lotto;

import java.util.Random;

class Machine {
	private int totalPrice;     // 총 누적 상금
    private int[] winlotto = new int[6];
    //번호는 랜덤으로 값을 받기 때문에 getter만 사용한다.

    public int[] getwinlotto() {
        return winlotto;
    }

    public void select() {
        Random rd = new Random();

        //6개의 공
        for(int i = 0; i < winlotto.length; i++) {
        	
            winlotto[i] = rd.nextInt(45) + 1; //로또 숫자는 1~45
            for(int j = 0; j < i; j++) {
                if(winlotto[i] == winlotto[j]) { //중복되면 다시 랜덤으로 받기
                    i--;
                    break;
                }
            }
        }
    }

    // 당첨 로또 번호 출력
    public void print() {
        System.out.print("당첨 로또 번호: ");
        for(int i = 0; i < winlotto.length; i++) {
            System.out.print(winlotto[i] + " ");
        }
        System.out.println();
    }

    public void rank(int[] lotto) {
        int winNumbers = 0;

        for (int i = 0; i < lotto.length; i++) {
        	
            for (int j = 0; j < winlotto.length; j++) {
                if(lotto[i] == winlotto[j]) {
                    winNumbers++;
                    j = winlotto.length;
                }
            }
        }

        System.out.println(winNumbers + "개 맞았습니다.");

        if(winNumbers==6) {
            System.out.println("1등!!");
            totalPrice += 50000;
        }else if(winNumbers==5) {
            System.out.println("2등!!");
            totalPrice += 30000;
        }else if(winNumbers==4) {
            System.out.println("3등!!");
            totalPrice += 10000;
        }else if(winNumbers==3) {
            System.out.println("4등!!");
            totalPrice += 5000;
        }else System.out.println("꽝이다..");
    }
    
    public void total() {
        System.out.println("당첨금액은 "+totalPrice+ "원 입니다.");
    }
}