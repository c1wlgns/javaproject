
public class Animal {
	private double weight;
	String picture;

	void eat()

	{
		System.out.println("eat()가 호출 되었음");
	}

	void sleep()

	{
		System.out.println("sleep()가 호출 되었음");

	}

	void exhaust(boolean exhaust) {
		System.out.println("exhaust()가 호출 되었음");
	}
}

class Lion extends Animal {
	private int legs = 4;

	void roar() {
		System.out.println("roar()가 호출되었음");
	}
}

class Eagle extends Animal {
	private int sings = 2;

	void fly() {
		System.out.println("fly()가 호출 되었음");
	}
}
