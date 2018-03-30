
public class Parent {
	public void print() {
		System.out.println("부모 클래스의 print() 메소드");
	}

}


class child extends Parent {
	public void print() {
		super.print();
		System.out.println("자식 클래스의 print() 메소드");
	}
}
