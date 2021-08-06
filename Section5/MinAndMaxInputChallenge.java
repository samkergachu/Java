import java.util.Scanner;
import java.lang.Math; 


public class MinAndMaxInputChallenge {
	
	//main method
	public static void main(String[] args) {
		//Reading a user_input
		Scanner scanner = new Scanner(System.in); 

		int number_MAX = 0; 
		int number_MIN = number_MAX;

		//flag
		boolean first = true; 

		//infinite loop
		while(true) {
			System.out.println("Enter number: "); 
			//check if input is int
			boolean isAnInt = scanner.hasNextInt(); 
			if(isAnInt) {
				
				int num = scanner.nextInt();
				
				if(first){
					first = false; 
					number_MIN = num; 
					number_MAX = num; 
				} //end of flag.


				if(num > number_MAX) {

					number_MAX = num; 
			 
				} else if( num  < number_MIN) {
					number_MIN = num; 
				}

			} else {
				break;
			}
			
			scanner.nextLine();

			

		} //end of while

		//print result
		System.out.println("Max no : " + number_MAX + " and Min no: " + number_MIN); 
		scanner.close();
	}//end of main

}//end of class
