
public class Parent {
	public void print() {
		System.out.println("�θ� Ŭ������ print() �޼ҵ�");
	}

}


class child extends Parent {
	public void print() {
		super.print();
		System.out.println("�ڽ� Ŭ������ print() �޼ҵ�");
	}
}
