
package commons.Java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Date;
public class UtilJavaDateNeshoAu {
public static void main(String[] args) {
	Date currentDate = new Date();
	System.out.println(currentDate);
	LocalDate date = LocalDate.now();
	System.out.println(date);
	LocalTime time = LocalTime.now();
	System.out.println(time);
	LocalDateTime dt = LocalDateTime.now();
	Year y = Year.now();
	System.out.println(y);
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM");
System.out.println(date.format(dtf));
	
}
	
}
