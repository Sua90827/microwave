package microwave;

import java.util.Scanner;

import aaaa.Power;

public class common {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		while (true) {
			
			switch(n){
			case 1: 
				Power p = new Power();
				int x = p.power();
				if(x==0 ||x==1) {
					break;
				}
			
			case 2: 
				break;
			
			case 3: 
				break;
			
			default: 
				break;
			}
		}
	}
}
