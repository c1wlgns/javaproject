
public class Shape {
	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX() {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY() {
		this.y = y;
	}

	void print() {
		System.out.println("x좌표: " + x + "y좌표: " + y);
	}
}

class Rectangle extends Shape {
	private int width;
	private int height;

	public int getWidth() {
		return width;
	}

	public void setWidth() {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight() {
		this.height = height;
	}

	double area() {
		return (double) width * height;
	}

	void draw() {
		System.out.println("(" + this.getX() + "," + this.getY() + ") 위치에 " + "가로: " + width + "세로: " + height);
	}
}


class RectangleTest {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		r1.setX();
		r1.setY();
		r1.setWidth();
		r1.setHeight();
		
		r2.setX();
		r2.setY();
		r2.setWidth();
		r2.setHeight();
		
		r1.print();
		r1.draw();
		r2.print();
		r2.draw();
	}
}
