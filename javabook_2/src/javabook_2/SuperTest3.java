package javabook_2;

	class Ad1 {
		int d1;
		int s;
		Ad1(int s1) {
			s = s1;
			d1 = s * s;
		}
	}
	class Ad2 extends Ad1 {
		int d2;
		int t;
		Ad2(int s1, int t1) {
			super (s1);
			System.out.println("Ŭ���� Ad2�� ������ ����");
			t = t1;
			d2 = t * t;
		}
	}
	
public class SuperTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ad2 super2 = new Ad2(10,20);
		System.out.println("10�� ������: "+ super2.d1);
		System.out.println("20�� ������: "+ super2.d2);
	}

}
