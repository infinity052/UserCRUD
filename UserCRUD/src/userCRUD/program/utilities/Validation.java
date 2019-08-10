package userCRUD.program.utilities;
/**
 * This class has been used to validate each input entered by
 * the user and make sure it matches the required type of
 * input.
 * 
 * 
 * @author Ayush
 *
 */



public class Validation {

public static boolean emailValidate(String email){
	int count=0;
	for(int i=0;i<email.length();i++) {
		char c=email.charAt(i);
		if(c=='@') {
			count++;
		}
	}
	if(count==1) {
		return true;
	}
	else 
		return false;
}

public static boolean phoneNumberValidate(String ph) {
	
	for(int i=0;i<ph.length();i++) {
		char c=ph.charAt(i);
		if(Character.isDigit(c)==false) {
			return false;
		}
	}
	return true;
}

}
