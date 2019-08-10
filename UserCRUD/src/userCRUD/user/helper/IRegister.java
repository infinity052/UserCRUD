package userCRUD.user.helper;

import java.util.Scanner;

import userCRUD.program.data.IUserInfo;
 /**
  * This interface helps in the communication between Login class
  * and Register class.
  * The methods that help achieve the functionality- Updating Profile
  * of the user inside the Login class are being accessed from the
  * Register class due to this interface by the procedure of
  * upcasting the object.
  * Only required methods can be accessed by this.
  * 
  * It is also being accessed by Login class for updating the
  * information of the user by using its setter features.
  * 
  * @author Ayush
  * @since 1.0
  */
public interface IRegister {
	void enterName(Scanner scanner,IUserInfo ui);
	void enterEmail(Scanner scanner,IUserInfo ui);
	void enterPhoneNumber(Scanner scanner,IUserInfo ui);
	void enterDOBdate(Scanner scanner,IUserInfo ui);
	void enterDOBmonth(Scanner scanner, IUserInfo ui);
	void enterDOByear(Scanner scanner,IUserInfo ui);
	void enterDOB(Scanner scanner,IUserInfo ui);
}
