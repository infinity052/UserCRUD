package userCRUD.user.helper;

import java.util.Scanner;
/**
 * This interface has been used for the communication between
 * ViewsCall class which is executing the project according to
 * the choices entered by the user, and the Register class
 * which is being used to create a new user in this userCRUD
 * project.
 * 
 * Due to this interface, ViewsCall can access only those methods
 * which it requires by upcasting the object.
 * 
 * @author Ayush
 *
 */
public interface ICallRegister {
	void registerPage(Scanner scanner);
	void otherInfo(Scanner scanner);
	void congoPage();
}
