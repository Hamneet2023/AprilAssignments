
//Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number or not.
package AssignmentsOfApril;
import java.util.Scanner;
public class PrimeNo {
int counter;
Scanner sc = new Scanner(System.in);

void findPrimeNo() {
	System.out.println("please Enter positive Inteager:");
	int number = sc.nextInt();
	if(number>0) {
		for( counter=2; counter<=number-1; counter++) {
			if(number%counter ==0)
				break;
		}
		if(counter==number) {
			System.out.println("number is prime");
		}
		else {
			System.out.println("number is not a prime");
		}		
		
	}
	else {
		System.out.println("this is not a postive number,Please enter positive number:");
	}
	
}
}
