package AssignmentsOfApril;
import java.util.Scanner;

public class CalculatorProgram {
	Scanner sc = new Scanner(System.in);
	String operation;
	void performCalculation() {
		System.out.println("please enter a operation:");
		operation =sc.next();
		switch (operation) {
		
		case "cube":
			int length;int breadth;int height;
			System.out.println("Enter the length of the cube");
			length=sc.nextInt();
			System.out.println("Enter the breadth of the cube");
			breadth=sc.nextInt();
			System.out.println("Enter the height of the cube");
			height=sc.nextInt();
			int volume = length*breadth*height;
			System.out.println(volume);
			 	break;
		
		case "square":
			System.out.println("Enter the length of the cube");
			length=sc.nextInt();
			System.out.println("Enter the breadth of the cube");
			breadth=sc.nextInt();
			int area = length*breadth;
			System.out.println(area);
        	break;

		default:
			System.out.println("Invalid operation");
			break;
		}
	}

}