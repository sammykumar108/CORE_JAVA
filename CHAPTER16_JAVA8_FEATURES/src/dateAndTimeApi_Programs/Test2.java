package dateAndTimeApi_Programs;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Test2 {
	public static void main(String[] args) {
//		LocalTime lt=LocalTime.now();
//		System.out.println(lt);
		//-------------------------------------------------
//		LocalTime lt=LocalTime.now();
//		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH:mm:ss");
//		String current_time=lt.format(dtf);
//		System.out.println(current_time);
//		
//		String current_time1=dtf.format(lt);
//		System.out.println(current_time1);
		//-----------------------------------------------
		LocalTime lt=LocalTime.now();
		System.out.println(lt.getHour());
		System.out.println(lt.minusHours(40));
		
		
	}
}
