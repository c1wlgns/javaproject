
public class Animal {
	private double weight;
	String picture;

	void eat()

	{
		System.out.println("eat()�� ȣ�� �Ǿ���");
	}

	void sleep()

	{
		System.out.println("sleep()�� ȣ�� �Ǿ���");

	}

	void exhaust(boolean exhaust) {
		System.out.println("exhaust()�� ȣ�� �Ǿ���");
	}
}

class Lion extends Animal {
	private int legs = 4;

	void roar() {
		System.out.println("roar()�� ȣ��Ǿ���");
	}
}

class Eagle extends Animal {
	private int sings = 2;

	void fly() {
		System.out.println("fly()�� ȣ�� �Ǿ���");
	}
}
