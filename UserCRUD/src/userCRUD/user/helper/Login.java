package userCRUD.user.helper;
import java.util.Scanner;
import userCRUD.program.data.IUserInfo;
import userCRUD.program.data.UIObjects;
import userCRUD.program.utilities.Formatting;
import userCRUD.program.utilities.Utilities;
/**
 * Login class is being used for validation of the Login Initials
 * of an existing user and displaying them the welcome message 
 * when the Log In.
 * 
 * This also contains methods to alter the Information entered 
 * during registration of the user and to also change the password.
 *  
 * It can also Wipe the record of the user and exit to the main menu.
 * 
 * When username and password is entered it checks if the combination
 * exists inside the records class UIObjects and if found it
 * gets the index of the object as its instance which can be used
 * further to perform operations in its methods
 * 
 * @author Ayush
 *@since 1.0
 */
public class Login implements ILogin{
private int index;


@Override
public void loginCall(Scanner scanner) {
	Utilities.clearScreen();
	System.out.println("*********************************************************LOGIN**********************************************************\n");
	System.out.println("Please Enter Login Initials\n\n");
	
	
	
	
	System.out.println("UserName:\n");
	String Uid=scanner.next();
	scanner.nextLine();
	System.out.println("Password:\n");
	String Pass=scanner.nextLine();
	if(UIObjects.checkUID(Uid, Pass)==false) {
	System.out.println("\n\nUserName and Password combination "
			+ "doesnt exist\nPlease Enter correct combination\n");
	    loginCall(scanner);
	    
	
	    
	  
	}
	
	
	
}
@Override
public void loginPage1(Scanner scanner) {
	index=UIObjects.getIndex();
	Utilities.clearScreen();
	System.out.println("**************************************************"
			+ "WELCOME "+UIObjects.getCurrentInstance(index).getName()+"!!!!!"+
			"************************************************************************\n\n\n\n");
			loginPage2(scanner);
}

private void loginPage2(Scanner scanner) {
	System.out.println("******************************************************"
			+ "Here are your options:****************************************************\n"
			+ "1. Change Password\n"
			+ "2. Update Profile\n"
			+ "3. Delete Profile\n"
			+ "4. Logout\n"
			+ "**********************************************************************************************************************************************");
	getChoices(scanner);
	
}



private void getChoices(Scanner scanner) {

String a=scanner.next();
switch(a) {
case "1": changePassword(scanner); loginPage2(scanner); break;
case "2": updateProfile(scanner); loginPage2(scanner);break;
case "3": deleteProfile(scanner);return;
case "4": break;
default: System.out.println("Invalid choice... Please Enter again\n");
getChoices(scanner);
break;

}

}

private void displayInfo() {
	IUserInfo ui = UIObjects.getCurrentInstance();
	System.out.println("\nHere is Your Information\n\n"
			+ "Name:              "+ui.getName()+"\n"
					+ "EmailID:           "+ui.getEmail()+"\n"
							+ "Phone Number:      "+ui.getPhone()
							+ "\nDate Of Birth:     "+Formatting.dateFormat(ui.getDobDate(), ui.getDobMonth(), ui.getDobYear())+"\n\n\n");
	
}
private void changePassword(Scanner scanner) {
	System.out.println("\n");
	scanner.nextLine();
	System.out.println("Enter New Password\n");
	String password=scanner.nextLine();
	
	System.out.println("Confirm New Password\n");
	
    String confpassword=scanner.nextLine();
    if(password.equals(confpassword)==false) {
    	System.out.println("Passwords Do not match\n"
    			+ "Please Enter Again");
    	changePassword(scanner);
    }
    StringBuffer Password=new StringBuffer(confpassword);
	UIObjects.getCurrentInstance(index).setPassword(Password);
	System.out.println("\nPassWord has been Changed");
}

private void updateProfile(Scanner scanner) {
	displayInfo();
	IRegister u=new Register();
	IUserInfo ui=UIObjects.getCurrentInstance(index);
	System.out.println("Which Fields you want to update?\n"
			+ "1. Name\n"
			+ "2. Email ID\n"
			+ "3. Phone Number\n"
			+ "4. Date Of Birth\n"
			+ "5. Go back\n");
	
	String a=scanner.next();
	
	switch(a) {
	case "1": scanner.nextLine();
		u.enterName(scanner, ui);
		break;
	case "2": u.enterEmail(scanner, ui);
		break;
	case "3": u.enterPhoneNumber(scanner, ui);
	scanner.nextLine();
	break;
	case "4": u.enterDOB(scanner, ui);
	break;
	case "5": return;
	default: System.out.println("Invalid character");
	updateProfile(scanner); break;
}
	updateProfile(scanner);	
}

private void deleteProfile(Scanner scanner) {
	 UIObjects.deleteInstance(index);
     System.out.println("Your Profile has been Deleted");
     return; 
	
	
	
}
}
