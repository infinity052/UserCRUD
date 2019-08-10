package userCRUD.program.data;

import java.math.BigDecimal;

/**
 *This interface is being used by Login and Register classes to
 *only access methods that they require by upcasting the created
 *object.
 *UIObjects also use this interface to recieve data for its 
 *necessary methods
 * 
 * 
 * @author Ayush
 *
 */
public interface IUserInfo {
    void setPassword(StringBuffer password);
	String getName();
	void setName(String name);
	String getEmail();
	void setEmail(String email);
	String getPhone();
	void setPhone(String phone);
	
	String getUserid();
	StringBuffer getPassword();
	BigDecimal getSalary();
	void setSalary(BigDecimal salary);
	int getDobDate();
	void setDobDate(int dobDate);
	int getDobMonth();
	void setDobMonth(int dobMonth);
	int getDobYear();
	void setDobYear(int dobYear);

}
