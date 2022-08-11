package day02;

public class 스포츠카 extends 자동차{

	public 스포츠카() {
		System.out.println("스포츠카 생성자 실행");
	}
	
	public void 달리다() {
		System.out.println("스포츠카가 후륜구동으로 달리다.");
	}
	
	public void 지붕을열다() {
		System.out.println("스포츠카의 지붕을 열다.");
	}
	
	@Override
	public void run() {
		System.out.println("스포츠카의 run");
	}

}
