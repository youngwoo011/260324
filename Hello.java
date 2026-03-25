package kr.com.beak;

public class Hello {
	
	public void print(String name) {
		System.out.println("Hello! " + name);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello hello = new Hello();
		Hello hi = new Hello();
		hello.print("Java");
		hi.print("hi");

	}

}