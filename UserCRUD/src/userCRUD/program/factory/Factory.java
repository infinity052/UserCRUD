package userCRUD.program.factory;

import userCRUD.user.helper.*;

public class Factory {
public static ILogin getLoginInstance() {
	return new Login();
}

public static ICallRegister getRegisterInstance() {
	return new Register();
}
}
