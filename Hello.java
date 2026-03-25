package kr.com.beak;

public class Hello {
	
	public void print(String name) {
		System.out.println("Hello! " + name);
		}
	
	//진입 메서드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello hello = new Hello(); //new 키워드를 사용해 객체 생성
		Hello hi = new Hello();
		hello.print("Java");
		hi.print("hi");

	}

}