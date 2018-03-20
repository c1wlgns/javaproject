
public class Box_2 {
	int width, length, height;
	
	Box_2(int w, int l, int h) {
		width = w;
		length = l;
		height = h;
	}
	boolean isSameBox(Box_2 obj2) {
		if ((obj2.width == width) & (obj2.length == length)
				&(obj2.height == height))
			return true;
		else
			return false;
	}

}
