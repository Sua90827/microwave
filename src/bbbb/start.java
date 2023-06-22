package bbbb;

public class start {
	public void start(int second) {
	System.out.println("전자레인지 작동을 시작합니다.");
	for(int i=second; i >= 0; --i) {
		try {
			System.out.println(i + "초 남았습니다.");
	         Thread.sleep(1000);

	      } catch(InterruptedException e) { }
		
	  }
	System.out.println("전자렌지 작동이 완료되었습니다.");
	}
}
