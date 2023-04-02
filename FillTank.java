package AssignmentsOfApril;

import java.util.Scanner;

public class FillTank {

	int bucketCapacity = 10;
	int tankCapacity = 100;
	int startingPoint = 0;

	Scanner sc = new Scanner(System.in);

	void fillWaterTank() {

		for (int counter = 1; counter < 11; counter++) {
			System.out.println("Current level of water is ," + startingPoint);
			
			//System.out.println("pour water into bucket: ");
			//sc.nextInt();
//			int enterValue= sc.nextInt();
//			  if(enterValue<bucketCapacity||enterValue>bucketCapacity) {
//				  System.out.println("please go for the exact capacity for the bucket,the actual capacity of the bucket is,"+ bucketCapacity+"  "+"liters");
//				  break;
//			  }
			   startingPoint += bucketCapacity; // startingPoint= startingPoint+bucketCapacity;
			 
			   if(startingPoint > tankCapacity) {
				startingPoint = tankCapacity;
				System.out.println("stop filling tank,water is overflowing");
				break;
			}
		}
		System.out.println("the final  level of water is" + startingPoint);
	}
}
