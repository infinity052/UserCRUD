package userCRUD.program.utilities;
/**
 *  This class has been used to alter the string sequence
 *  entered by the user.
 *  The method TitleCase has been used to take the string
 *  entered by the user in the name field and convert it into
 *  a Title Case, i.e first letter of each word has been made 
 *  capital by the use of this class
 * 
 * 
 * @author Ayush
 *
 */
public class StringUtil {
	public static String titleCase(String sentence) {
		
		String Fullname="";
		if(sentence!=null && sentence.trim().length()>0) {
		String words[]=sentence.split(" ");
		char ch;
		for(String word:words) {
			ch=word.charAt(0);
		   String ch2=String.valueOf(ch).toUpperCase();
			Fullname+=ch2+word.substring(1).toLowerCase()+" ";
		}
		}


	return Fullname;
	}
}
