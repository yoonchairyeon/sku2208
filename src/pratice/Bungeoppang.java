package pratice;

import java.util.Random;
import java.util.Scanner;



public class Bungeoppang {
    String num;
    
    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
    
    
   
    public static void main(String[] args) {
        
        boolean num2 = true;
        Bungeoppang Bungeoppang = new Bungeoppang();
        
        int n=0;
        while(num2 == true){
            
        Bungeoppang.userInput();        
        n = Integer.parseInt(Bungeoppang.getNum()); // String을 int 값으로 변환
        
            if(n >= 10){
                
                num2 = false;    
            }
        }
        
        try {
            BungMaking BungMaking = new BungMaking(n);  // 입력 받은 값만큼 붕어빵 요리
            new Thread(BungMaking, "A").start();
            new Thread(BungMaking, "B").start();
            new Thread(BungMaking, "C").start();
            new Thread(BungMaking, "D").start();
            new Thread(BungMaking, "E").start();
            new Thread(BungMaking, "F").start();
            new Thread(BungMaking, "G").start();         
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }


    public void userInput() {
                
        Scanner sc = new Scanner(System.in);        
        System.out.println("오늘의 붕어빵 만들 개수 입력(10개이상) : ");        
        num = sc.next(); // next 한단어씩 입력받는다 공백기준
    }
}

class BungMaking implements Runnable {
    private int BungCount;
    private int boomcount = 0;
    private int BungCount2 = 0;
    private int BungCount3 = 0;
    private String[] frames = {"_", "_", "_", "_", "_", "_", "_"};  // '_'는 틀이 비어있음을 의미
    private boolean running = true;
    
    public boolean Bungboom(){
        Random r = new Random();
        boolean result = false;
        int temp = 0;

        temp = (int)r.nextInt(100000);

        if(temp >= 0 && temp < 1000){
            result = true;
        }
        return result;
    }
    public int getboomcount(){
        return boomcount;
    }
    
    public BungMaking(int count){   // 클래스 객체가 만들어질 때 생성자에서 만들 붕어빵 갯수를 받아옴
        BungCount = count;
        BungCount2 = count;
        BungCount3 = count;
    }
    
    @Override
    public void run() {

        while (BungCount > 0) {     // 남은 붕어빵 틀이 0이 될 때까지 반복
            
            synchronized (this) {    // 스레드 동기화 제어 
                BungCount--;
                System.out.println(Thread.currentThread().getName() + " 제조시작!     " + "남은 붕어빵 갯수 : " + BungCount + "개 남음");
            }
            
            for (int i=0; i<frames.length; i++) {
                if (!frames[i].equals("_")) continue;
                
                synchronized (this) {   // 스레드 동기화
                    frames[i] = Thread.currentThread().getName();
                    System.out.print("                                               " 
                            + Thread.currentThread().getName() + " : [" + (i+1) + "]번 붕어빵 틀 채워짐");
                    showFrames();
                }
                
                try {
                    Thread.sleep(200000);     // 붕어빵 만드는 시간
                    if(Bungboom()){
                        boomcount++;
                        System.out.println("아이쿠! 붕어빵 하나가 탔어요!");
                    };
                    
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
                synchronized (this) {
                    frames[i] = "_";    // 붕어빵 다만들면 비워짐 
                    System.out.print("                                               " 
                            + Thread.currentThread().getName() + " : [" + (i + 1) + "]번 붕어빵 틀 비워짐");
                    
                   
                    showFrames();
                    BungCount2--;
                }
                
                break;
            }
           
            try {
                Thread.sleep(Math.round(10000 * Math.random()));     // 스레드마다 다음 붕어빵을 만들기까지 0초에서 1초까지 랜덤으로 시간 걸리도록 함(붕어빵 마다 만드는 시간 상이
                
            } catch (InterruptedException e){
                
                e.printStackTrace();
            }
            finally{
            if (BungCount2 == 0 && running){
                System.out.println("\n==================================================");
                System.out.println("      타서 버려진 붕어빵의 개수 : " + boomcount);
                System.out.println("      총 판매한 붕어빵의 개수 : " + (BungCount3 - boomcount));
                System.out.println("      총 매출 (붕어빵 하나 당 500원) : " + ((BungCount3 - boomcount)*500) + "원");
                System.out.println("==================================================");
                running = false;
                }
            }
        }
    }
    
    
    
    private void showFrames() {     // 틀의 상태 출력
        
        String stringToPrint = "    ";
        for (int i=0; i<frames.length; i++) {
            stringToPrint += (" " + frames[i]);
        }
      
        System.out.println(stringToPrint);
    }
}
