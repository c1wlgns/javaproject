package javabook_2;

	class Ea {
		void show() {
			System.out.println("���� Ŭ������ �޼ҵ� show(String str) ����");
		}
	}
	class Eb extends Ea {
		void show() {
			System.out.println("���� Ŭ������ �޼ҵ� show() ����");
		}
	}

	public class OverridingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eb over = new Eb();
		over.show();

	}

}
