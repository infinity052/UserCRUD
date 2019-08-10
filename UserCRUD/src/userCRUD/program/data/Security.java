package userCRUD.program.data;
/**
 * Seperate class for storing password
 * for security purposes
 * @author Ayush
 *@since 1.0
 */


abstract class Security {
protected StringBuffer Password;
protected StringBuffer returnPass(StringBuffer password) {
	StringBuffer str=new StringBuffer();
	for(int i=0;i<password.length();i++) {
		str.append('*');
	}
	return str;
}
public StringBuffer getPass() {
	return Password;
}

}
