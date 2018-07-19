package Date;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class TestDate {

	public static void main(String[] args) {
		LocalDateTime localdate1 = LocalDateTime.of(2018, 07,20,13,50);
		LocalDateTime localdate2 = LocalDateTime.of(2018,07,21,8,40);
		LocalDateTime localdate3 = LocalDateTime.of(2018,06,30,01,20);
		
		LocalDateTime localdate; 
		if(localdate1.isBefore(localdate2))
			localdate = localdate1;
		else 
			localdate = localdate2;
		
		Period period = Period.between(localdate.toLocalDate(), localdate3.toLocalDate());
		Duration time = Duration.between(localdate, localdate3);
		
		System.out.print("일 수 차: ");
		System.out.println(period);
		
		System.out.print("시간 차: ");
		System.out.println(time);
			
		
		
		
		

	}

}
