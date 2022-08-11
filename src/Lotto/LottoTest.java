package Lotto;

public class LottoTest {

    public static void main(String[] args) {

        LottoSeller lottoSeller = new LottoSeller();
        int count = lottoSeller.buy();  // 로또를 구입
        lottoSeller.setLottoCount(count);   // 로또를 몇개 살 수 있는지 set

        Machine machine = new Machine();
        machine.select();       // 공 뽑기
        

        for(int i = 0; i < count; i++) {
            machine.rank(lottoSeller.inputNum());         // 수동 입력과 공 뽑기에서 나온 코드 비교
        }
        machine.print();   //로또 당첨번호 출력
        machine.total(); 	//총 당첨금액 출력
       
    }
}
