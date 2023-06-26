package coreJava10;

public class ThrowsDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ThrowsDemo.m1();
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}

	}

}
