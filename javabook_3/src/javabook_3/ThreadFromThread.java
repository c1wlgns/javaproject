package javabook_3;
class ThreadTest extends Thread {
	public void run() {
		for (int i=1; i<=10; i++) {
			System.out.println("��մ� �ڹ�: "+ i);
		}
	}
}

public class ThreadFromThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTest t = new ThreadTest();
		t.start();

	}

}
