package microwave;

import java.util.Scanner;

import aaaa.Power;
import cccc.Timer;

public class common {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		Timer t = new Timer();
		int a;
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
				break;
			
			default: 
				break;
			}
		}
	}
}
