
public class Box_2Test {
	public static void main(String args[]) {
		Box_2 obj1 = new Box_2(10,20,50);
		Box_2 obj2 = new Box_2(10,20,50);
		
		System.out.println("obj == obj2 : " + obj1.isSameBox(obj2));
	}

}
