package javabook_2;

	class D1 {
		int x = 1000;
		void display() {
			System.out.println("���� Ŭ���� D1�� display()�޼ҵ��Դϴ�.");
		}
	}
	class D2 extends D1{
		int x = 2000;
		void display() {
			System.out.println("���� Ŭ���� D2�� display()�޼ҵ��Դϴ�.");
		}
		void write() {
			display();
			super.display();
			System.out.println("D2 Ŭ���� ��ü�� x����: "+ x);
			System.out.println("D1 Ŭ���� ��ü�� x����: "+ x);
		}
	}

public class SuperTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D2 d = new D2();
		d.write(); 

	}

}
