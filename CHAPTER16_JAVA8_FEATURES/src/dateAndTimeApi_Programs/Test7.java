package dateAndTimeApi_Programs;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Test7 {
	public static void main(String[] args) {
//		Duration d=Duration.ofHours(1);
//		System.out.println(d.getSeconds());
		
		Duration d=Duration.of(1, ChronoUnit.MINUTES);
		System.out.println(d.getSeconds());
	}
}
