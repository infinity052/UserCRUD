package userCRUD.program.data;
import java.util.ArrayList;

/**
 * This is a records class that holds the references of all
 * the objects of the class UserInfo inside an ArrayList of the
 * type UserInfo that has been upcasted into the IUserInfo 
 * interface so that it may only access necessary features
 * 
 * This class holds all the important methods like to create, alter
 * and delete the records of a person
 * 
 * All of its methods are static so other classes can communicate
 * with it by using the classname UIObjects
 * @author Ayush
 *@since 1.0
 */



public final class UIObjects {

public static int index;

public static int getIndex() {
	return index;
}

private UIObjects() {}

private static ArrayList <IUserInfo>ui=new ArrayList();

public static IUserInfo getCurrentInstance(int i) {
	return ui.get(i);
}
public static void getVal(IUserInfo u) {
	ui.add(u);

}
public static IUserInfo getCurrentInstance() {
	return ui.get(ui.size()-1);
}

public static boolean checkUID(String uid) {
 
	if(ui.isEmpty()==false) {
	for(int i=0;i<ui.size();i++) {

	if(ui.get(i).getUserid().equals(uid)) 
			{  
		index=i;
		return false;}
	}
	
	
}

	return true;
}


public static boolean checkUID(String uid, String pass) {
if(ui.isEmpty()==false) {
if(checkUID(uid)==false && ((Security)ui.get(index)).getPass().toString().equals(pass.toString())) {
	return true;
	}

}
return false;
}

public static void deleteInstance(int index) {
	
	ui.remove(index);
}
}
