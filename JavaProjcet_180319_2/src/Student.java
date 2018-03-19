
public class Student {
	private int number;
	private String name;
	private int age;
	
	Student() {
		number = 100;
		name = "New Student";
		age = 18;
	}
	Student(int number, String name, int age) {
		this.number = number;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", age="+age +"]";
	}
}
class Point {
	public int x=0;
	public int y=0;
	
	//»ý¼ºÀÚ
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
class Rectangle {
	private int x,y;
	private int width, height;
	
	Rectangle() {
		this(0,0,1,1);
	}
	
	Rectangle(int width, int height) {
		this(0,0,width,height);
	}
	
	Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//...

}
