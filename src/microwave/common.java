package microwave;

import java.util.Scanner;

import aaaa.Power;
import bbbb.start;
import cccc.Timer;

public class common {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("동작을 시키려면 1번을 눌러주세요.");
		int n = input.nextInt();
		Timer t = new Timer();
		start s = new start();
		int a = 0;
		while (true) {
			
			switch(n){
			case 1: 
				Power p = new Power();
				int x = p.power();
				if(x==0 ||x==1) {
					break;
				}
			
			case 2: 
				a = t.timer();

			case 3: 
				s.start(a);
				break;
			
			default: 
				break;
			}
		}
	}
}
