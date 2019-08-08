package testDemo;
import java.util.Scanner;
public class TestDemo {
	public static void main(String [] args) {
		Scanner scan=new Scanner(System.in);
		//System.out.print("Enter an integer number");
		//int test=scan.nextInt();
		int test=Integer.parseInt(args[0]);
		if(test>0) {
			System.out.println("You Have Entered Positive Value");
		}
		else if(test<0) {
			System.out.println("You Have Entered Negative Value");
		}
		else {
			System.out.println("You Have Entered Zero");
		}
		
		
		System.out.print("Enter Marks for Physics:");
		int phGr=scan.nextInt();
		System.out.print("Enter Marks for Chemistry:");
		int chGr=scan.nextInt();
		System.out.print("Enter Marks for Math:");
		int mGr=scan.nextInt();
		int avg=(phGr+chGr+mGr)/3;
		char letterGr;
		if(avg>70) {
			letterGr='A';
		}
		else if(avg<=70 && avg>=61) {
			letterGr='B';
		}
		else {
			letterGr='C';
		}
		
		System.out.print("Your Average Mark is "+letterGr);
	}
}
