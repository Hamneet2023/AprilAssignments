package AssignmentsOfApril;
import java.util.Scanner;

public class CustomerLogin {
	Scanner sc = new Scanner(System.in);
	String actualUserID  = "pivotAdmin";
	String actualPassword = "Admin123";
	
	void logintoApplication(){
			for(int counter=1;counter<=3;counter++) {
				System.out.print("Enter username: ");
	            String username = sc.next();
	            System.out.print("Enter password: ");
	            String Password = sc.next();
	            if (username.equals(actualUserID) && Password.equals(actualPassword)) {
	                System.out.println("You are logged in to the application:");
	                break;}
	            else {
	            	System.out.println("Incorrect User id or password. Try again");
	            	 if(counter==3) {
	            		 System.out.println("you enter invalid data three time ,card is blocked");
	            	 }
	            }
			
		}//for loop ends here
	}//logintoApplication() method ends here	
}
