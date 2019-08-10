package userCRUD.program.data;

import java.math.BigDecimal;

import userCRUD.program.utilities.StringUtil;
/**
This class contains all the information about 1 user.
Its extends Security class where the original password has
been saved for security purposes.

To accommodate many users, this class's object arrayList has been
stored in the class UIObjects along with other useful methods
**/
public final class UserInfo extends Security implements IUserInfo {

private final String userid;
private StringBuffer password;
private String name;
private String email;
private String phone;
private int dobDate;
private int dobMonth;
private int dobYear;
private BigDecimal salary;

@Override

public BigDecimal getSalary() {
	return salary;
}
@Override
public void setSalary(BigDecimal salary) {
	this.salary = salary;
	
}
@Override
public StringBuffer getPassword() {
	return password;
}
@Override
public void setPassword(StringBuffer password) {
	super.Password=password;
	this.password=super.returnPass(password);
}
@Override
public String getName() {
	return name;
}
@Override
public void setName(String name) {
	this.name = StringUtil.titleCase(name);
}
@Override
public String getEmail() {
	return email;
}
@Override
public void setEmail(String email) {
	this.email = email;
}
@Override
public String getPhone() {
	return phone;
}
@Override
public void setPhone(String phone) {
	this.phone = phone;
}




	

public UserInfo(String uid) {

	this.userid=uid;
	
}

@Override
public int getDobDate() {
	return dobDate;
}
@Override
public void setDobDate(int dobDate) {
	this.dobDate = dobDate;
}
@Override
public int getDobMonth() {
	return dobMonth;
}
@Override
public void setDobMonth(int dobMonth) {
	this.dobMonth = dobMonth;
}
@Override
public int getDobYear() {
	return dobYear;
}
@Override
public void setDobYear(int dobYear) {
	this.dobYear = dobYear;
}
@Override
public String getUserid() {
	return userid;
}



  
}


