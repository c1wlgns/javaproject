
public class Animal {
	public void sound() {

	}

};

class Dog extends Animal {
	public void sound() {
		System.out.println("¸Û¸Û");
	}
};

class DogTest {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
	}
};
