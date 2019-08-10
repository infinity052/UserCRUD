package userCRUD.program.utilities;
/**
 * This class has been used to change the input format
 * into something that can be seen and percieved
 * by a user of a different locale
 * 
 * Methods to change currency format and date format have been
 * included in this class
 * 
 * 
 */


import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Formatting {
public static String currencyFormat(BigDecimal a) {
	Locale locale=new Locale("en","IN");
	NumberFormat nf=NumberFormat.getCurrencyInstance(locale);
    return nf.format(a.doubleValue()); 
}
public static String dateFormat(int date,int month,int year) {
	Locale locale=new Locale("en","US");
    
	Date d= new Date();
	d.setDate(date);
	d.setMonth(month-1);
	d.setYear(year-1900);
    DateFormat df=DateFormat.getDateInstance(DateFormat.DEFAULT,locale);
	return df.format(d);
	

}
}
