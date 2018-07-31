package javabook;

public class Box3 {
	int width;
	int height;
	int depth;
	long idNum;
	static long boxID = 0;
	public void increment() {
		idNum = ++boxID;
	}

}
class Box3Test {
	Box3 mybox1 = new Box3();
	Box3 mybox2 = new Box3();
	Box3 mybox3 = new Box3();
	Box3 mybox4 = new Box3();
	/*mybox1.increment();
	mybox2.increment();
	mybox3.increment();
	mybox4.increment();*/
}
