package day02;

public class 자동차User {

	public static void run(자동차 c) {
		c.run();
	}
	
	public static void main(String[] args) {
		자동차 c1 = new 포크레인();
//		자동차 c2 = new 버스();
		자동차 c3 = new 스포츠카();
		
//		c2.달리다();
//		((버스)c3).안내방송하다();
//		run(c3);
			
		c3.달리다();
		
	}

}
