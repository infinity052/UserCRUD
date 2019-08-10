package userCRUD.user.helper;


import java.util.Scanner;

import userCRUD.program.factory.Factory;

/**
 * This Class is calling the Register and Login features of the
 * project and providing them the common Scanner object.
 * 
 * @author Ayush
 * @since 1.0
 */

final class ViewsCall {

static void registerCall(Scanner scanner){
	
	ICallRegister r=Factory.getRegisterInstance();
	r.registerPage(scanner);
	r.otherInfo(scanner);
	r.congoPage();

	return;
}

static void loginCall(Scanner scanner) {
	ILogin il=Factory.getLoginInstance();
	il.loginCall(scanner);
	il.loginPage1(scanner);
	return;
	
}

}
