package userCRUD.user.helper;
import java.util.Scanner;

/**
 * Register Class is creating an object of the UserInfo class
 * and taking input from the user to store those values inside
 * the object and also storing each created object as a record
 * of that user inside the UIObjects class.
 * 
 * Each entry has been given its own method and the object 
 * creation of the class UserInfo has been done by upcasting
 * it to the IUserInfo interface to restrict the use of
 * unnecessary methods and instances.
 * 
 * 
 */


import userCRUD.program.data.*;
import userCRUD.program.utilities.Formatting;
import userCRUD.program.utilities.Validation;
public class Register implements IRegister,ICallRegister{

	@Override
public void registerPage(Scanner scanner) {
	 System.out.println("\t    ****************************************REGISTRATION********************************************\n"
	 		+ "****************************************Please Enter all your Valid Information***********************************************\n\n\n"
		 		+ "UserId\n");
	 
	 String uid;
	 
		uid=scanner.next();
	   if(UIObjects.checkUID(uid)==false) {
		   System.out.println("Username Taken..."
		   		+ "Please Enter a valid Username \n");
		   registerPage(scanner);
	   }
	  
	   IUserInfo ui=new UserInfo(uid);
	   
	   UIObjects.getVal(ui);
	   scanner.nextLine();
	   
}
	@Override
public void enterName(Scanner scanner,IUserInfo ui) {
	
	System.out.println("Name\n");
	ui.setName(scanner.nextLine());
}
	
public void enterPassword(Scanner scanner,IUserInfo ui) {
	
	
	
	
	
	System.out.println("Enter Password\n");
	String pass=scanner.nextLine();
    System.out.println("Confirm Password\n");
    String pass1=scanner.nextLine();
   
    if(pass.equals(pass1)==false) {
    	System.out.println("Passwords do not match\n");
    
    	enterPassword(scanner,ui);
    	
    	
    }
    StringBuffer password=new StringBuffer(pass);
    ui.setPassword(password);
}
	@Override
public void enterEmail(Scanner scanner,IUserInfo ui) {
	String email;
	System.out.println("Email ID\n");
	email=scanner.next();
	if(Validation.emailValidate(email)==false){
	System.out.println("\nInvalid Email id.\nPlease "
				+ "enter the correct Email\n");
		enterEmail(scanner,ui);
	}
	ui.setEmail(email);
	
}
	@Override
public void enterPhoneNumber(Scanner scanner,IUserInfo ui) {
	
	System.out.println("Phone Number\n");
	String ph=scanner.next();
	if(Validation.phoneNumberValidate(ph)==false) {
		System.out.println("\nInvalid Phone Number"
				+ "\nPlease Enter again\n ");
		enterPhoneNumber(scanner,ui);
	}
	ui.setPhone(ph);
	
	}@Override
public void enterDOBdate(Scanner scanner,IUserInfo ui){
	
	System.out.println("\nEnter Date\n");
	int Date = scanner.nextInt();	
	if(1>Date || 31<Date) {
		
     System.out.println("Invalid Date.\n"
     		+ "Date should be between 1 and 31\n"
     		+ "Please enter again\n");
     enterDOBdate(scanner,ui);
	}
	ui.setDobDate(Date);
}
	@Override
public void enterDOBmonth(Scanner scanner, IUserInfo ui) {
	System.out.println("\nEnter Month\n");
	int month= scanner.nextInt();
	if(month>12 || month<1) {
		System.out.println("Month should be between"
				+ "1 and 12");
		enterDOBmonth(scanner,ui);
	}
	ui.setDobMonth(month);
}
	@Override
public void enterDOByear(Scanner scanner,IUserInfo ui){
	System.out.println("\nEnter Year\n");
	int year = scanner.nextInt();
	if(year>2019) {
		System.out.println("So... youre not even born yet??"
				+ " -_- \nPlease enter again");
		enterDOByear(scanner,ui);
	}
	ui.setDobYear(year);
}

public void enterSalary(Scanner scanner, IUserInfo ui){
	System.out.println("\nEnter Your Salary\n");
	
	ui.setSalary(scanner.nextBigDecimal());
}
@Override
public void enterDOB(Scanner scanner,IUserInfo ui)
{
System.out.println("Enter Date of Birth \n");
enterDOBdate(scanner,ui);	
enterDOBmonth(scanner,ui);		
enterDOByear(scanner,ui);



	
}@Override
public void otherInfo(Scanner scanner) {
	
	IUserInfo ui = UIObjects.getCurrentInstance();
	enterPassword(scanner,ui);
    enterName(scanner,ui);
	enterEmail(scanner,ui);
	enterPhoneNumber(scanner,ui);
	enterDOB(scanner,ui);
	enterSalary(scanner,ui);
	
	ui=null;

}



@Override
public void congoPage() {
	IUserInfo ui=UIObjects.getCurrentInstance();
	System.out.println("\t*******Congratulations "+ui.getName()
	+"*******\n\n\n\t\t***Your Profile has been created***"
	+"\n\n\n Your Details are:\n"
	+ "UserId: "+ui.getUserid()+
			 "\nPassword: "+ui.getPassword()+"\n"
					+ "Date of birth: "+Formatting.dateFormat(ui.getDobDate(), ui.getDobMonth(), ui.getDobYear())+"\n"
							+ "Salary: "+Formatting.currencyFormat(ui.getSalary()));

ui=null;
}


}
