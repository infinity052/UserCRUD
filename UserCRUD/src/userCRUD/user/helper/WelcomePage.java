package userCRUD.user.helper;

import java.util.Scanner;

import userCRUD.program.utilities.Utilities;
/**
 * This class is the first class that is being accessed by the main
 * function. It displays the WELCOME message and asks the user
 * whether to login or register.
 * 
 * A Scanner object is created here and it is used throughout the
 * program and is closed when the program is exited.
 * 
 * 
 * @author Ayush
 *
 */
public final class WelcomePage {

private WelcomePage() {}

	private static void getChoices(){
		Scanner scanner=new Scanner(System.in); //One scanner object used throughout the project.
		
		switch(scanner.next()) {
		case "1": ViewsCall.loginCall(scanner);
		System.out.println("\n\n");firstPage();
		break;
		case "2": ViewsCall.registerCall(scanner);System.out.println("\n\n"); firstPage();break;
		case "3":scanner.close(); System.exit(0);
		default: System.out.println("Invalid option");
		
		firstPage();
		break;}
		
			   
		}
		
	
public static void firstPage(){
	System.out.println("\n***************************************"
			+ "Please Select One Of The Following:***********************************************\n"
			+ "*\t\t\t\t\t1) Login Existing User\t\t\t\t\t\t\t\t*\n"
			+ "*\t\t\t\t\t2) Register New User\t\t\t\t\t\t\t\t*\n"
			+ "*\t\t\t\t\t3) Exitt\t\t\t\t\t\t\t\t\t*\n"
			+ "*************************************************************************************************************************");
	getChoices();
	
}
}



