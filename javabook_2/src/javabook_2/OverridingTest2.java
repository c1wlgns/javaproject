package javabook_2;

	class Ea {
		void show() {
			System.out.println("상위 클래스의 메소드 show(String str) 수행");
		}
	}
	class Eb extends Ea {
		void show() {
			System.out.println("하위 클래스의 메소드 show() 수행");
		}
	}

	public class OverridingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eb over = new Eb();
		over.show();

	}

}
