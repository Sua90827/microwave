package bbbb;

public class start {
	public void start(int second) {
	System.out.println("전자레인지 작동을 시작합니다.");
	for(int i=second; i <= 0; --i) {
		try {

	         Thread.sleep(1000);

	      } catch(InterruptedException e) { }
		
	  }
	}
}
