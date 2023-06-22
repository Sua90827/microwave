package aaaa;

import java.util.Scanner;

public class Power {
	public int power() {
		System.out.println("전원을 켜? (y/n): ");
		Scanner input = new Scanner(System.in);
		String power = input.next();
		int answer = 0;
		if(power=="y") {
			answer = 2;
		}else if(power=="n") {
			answer = 0;
		}
		else {
			System.out.println("이상한 입력입니다. 다시 시도해주세요. 'n' 또는 'y' 로만 대답할 수 있습니다.");
			answer = 1;
		}
		return answer;
	}
}
