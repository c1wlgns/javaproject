package javabook_2;

abstract class Shape {
	abstract void draw();
	abstract void computeArea(double a, double b);
}
	class Circle extends Shape {
		void draw() {
			System.out.println("���� �׸��� ���");
		}
		void computeArea(double r1, double r2) {
				System.out.println("���� ����: "+ (3.14 * r1 * r2));
			}
		}
	class Rectangle extends Shape {
		void draw() {
			System.out.println("�簢���� �׸��� ���");
		}
		void computeArea(double h, double v) {   
			System.out.println("�簢���� ����: "+ (h * v));
		}
	}
	class Triangle extends Shape {
		void draw() {
			System.out.println("�ﰢ���� �׸��� ���");
		}
		void computeArea(double a, double h) {
				System.out.println("�ﰢ���� ����: "+ (a * h / 2));
	}
		

public static class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.draw();
		c.computeArea(5.0, 5.0);
		Rectangle r = new Rectangle();
		r.draw();
		r.computeArea(5.0, 10.0);
		Triangle t = new Triangle();
		t.draw();
		t.computeArea(5.0, 10.0);
		System.out.println("==��ü ����ȯ�� �������̵��� �̿�==");
		Shape s = new Circle();
		s.draw();
		s.computeArea(5.0, 5.0);
		s = new Rectangle();
		s.draw();
		s.computeArea(5.0, 10.0);
		s = new Triangle();
		s.draw();
		s.computeArea(5.0, 10.0);

	}

	}
}
