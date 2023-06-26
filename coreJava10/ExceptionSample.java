package coreJava10;

public class ExceptionSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3};
		int num=4, res=0;
		
		try {
		res=num/2;
			
			try {
				System.out.println(arr[3]);
			}
			catch(ArithmeticException e) {
				System.out.println("Can not divide by 0");
			}
			
		}catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("Access num between 0 to 1");
		}
		}

	

}
