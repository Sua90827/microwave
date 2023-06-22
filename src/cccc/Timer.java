package cccc;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Timer {
	public int timer() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 초 돌릴거니?");
		
		int n = sc.nextInt();

		return n;
	}
}
