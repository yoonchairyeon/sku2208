package day02;

public class 버스 extends 자동차{

	public 버스 () {
		System.out.println("버스 생성자 실행");
	}
	
	public void 뒷문여다() {
		
	}

	public void 안내방송하다() {
	}
	
	@Override
	public void run() {
		System.out.println("버스의 run");
	}

}
