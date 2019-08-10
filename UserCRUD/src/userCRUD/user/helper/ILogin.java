package userCRUD.user.helper;

import java.util.Scanner;
/**
 * This interface helps between the communication of ViewsCall
 * class and the Login class which is responsible for logging in
 * of an existing user.
 * ViewsCall class can only access those features that it requires.
 * This has been achieved by the method of upcasting.
 * 
 * 
 * @author Ayush
 *
 */
public interface ILogin {
	void loginCall(Scanner scanner);
	void loginPage1(Scanner scanner);
}
