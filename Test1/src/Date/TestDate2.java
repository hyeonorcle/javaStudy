package Date;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TestDate2 {

	public static void main(String[] args) {
		ZonedDateTime asia = ZonedDateTime.of(LocalDateTime.of(2018,06,25,8,00), ZoneId.of("Asia/Seoul"));
		ZonedDateTime paris = ZonedDateTime.of(LocalDateTime.of(2018,06,25,8,00), ZoneId.of("Europe/Paris"));
		
		Duration time = Duration.between(asia,paris);
		
		System.out.println("���� �ð� ����: "+ time);
		
		asia = ZonedDateTime.of(LocalDateTime.of(2018,12,13,8,00), ZoneId.of("Asia/Seoul"));
		paris = ZonedDateTime.of(LocalDateTime.of(2018,12,13,8,00), ZoneId.of("Europe/Paris"));
		
		time = Duration.between(asia,paris);
		
		
		System.out.println("�ܿ� �ð� ����: " + time);
		//��¥ ���� ��ȯ 
		DateTimeFormatter fm = DateTimeFormatter.ofPattern("yyyy-MM-d, HH:mm:ss VV");
		System.out.println(paris.format(fm));
		
		
		

	}

}
