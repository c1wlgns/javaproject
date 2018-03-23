
public class Car {
	String color;
	int speed;
	int gear;

	@Override
	public String toString() {
		return "Car [color= " + color + ", speed= " + speed + ",gear= " + gear + "]";
	}

	void changeGear(int g) {
		gear = g;
	}

	void speedUp() {
		speed = speed + 10;
	}

	void sppedDown() {
		speed = speed - 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		myCar.changeGear(1);
		myCar.speedUp();
		System.out.println(myCar);

	}

}
