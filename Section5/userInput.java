import java.util.Scanner;

public class userInput {

	//main method
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); 

		System.out.println("Enter your year of birth: "); 

		//check if input is int
		boolean hasNextInt = scanner.hasNextInt(); 

		if(hasNextInt) {

			int yearOfBirth = scanner.nextInt(); 
			scanner.nextLine();


			System.out.println("Enter your name: "); 
			String name = scanner.nextLine(); 
			int age = 2018 - yearOfBirth; 

			if(age >= 0 && age <=100){
				System.out.println("Your name is " + name + ", and you are " + age + "years old");

			} else {

				System.out.println("Invalid year of birth");
			} //end of if	


		} else {
			System.out.println("Unable to parse year of birth."); 
		} //end of  if..else

		scanner.close(); 

	}//end of main
}//end of class
