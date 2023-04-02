package AssignmentsOfApril;
import java.util.Scanner;

public class AddChocolates {
	int boxCapacity =63;
	int startingPoint = 27;
	int chocolateAddCapacity =5;
	
	Scanner sc = new Scanner(System.in);
	
	void addChocolatesInBox() {

		for (int counter = 1; counter <9; counter++) {
			System.out.println("Number of chocolates already avaiable in box ," + startingPoint);
			//System.out.println("Add chocolates in box: ");
			//sc.nextInt();
			
			startingPoint += chocolateAddCapacity; // startingPoint= startingPoint+chocolateAddCapacity;
			if (chocolateAddCapacity > boxCapacity) {
				startingPoint = boxCapacity;
				System.out.println("box is full stop adding chocolates");
				break;
			}
		}
		System.out.println("the finalnumber of chocolates" +startingPoint );
	}
}

