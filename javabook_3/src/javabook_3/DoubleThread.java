package javabook_3;

class ThreadTest1 extends Thread {
	public ThreadTest1(String str) {
		setName(str);
	}
	public void run() {
		for (int i=1; i<=10; i++) {
			System.out.println(i + getName());
		}
		System.out.println("끝"+ getName());
	}
}

public class DoubleThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTest1 t1 = new ThreadTest1(" : 배우기 쉬운 자바");
		ThreadTest1 t2 = new ThreadTest1(" : 배우기 어려운 자바");
		t1.start();
		t2.start();

	}

}
