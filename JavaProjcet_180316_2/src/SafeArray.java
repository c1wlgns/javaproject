import java.util.Scanner;

public class SafeArray {
	private int a[];
	private int number;
	public int length;
	public SafeArray(int size) {
		a= new int[size];
		length = size;
	}
	
	public int get(int index) {
		if(index >= 0 && index < length) {
			return a[index];
		}
		return -1;
	}
	
	public void setName(int number) {
		this.number = number;
	}
	
	public void put(int index, int value) {
		if(index >= 0 && index < length) {
			a[index] = value;
		}else
			System.out.println("잘못된 인덱스"+ index);
	}
	Scanner s = new Scanner(System.in);
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SafeArray array = new SafeArray(0);
		
		for(int i=0; i<(array.length +1); i++) {
			array.put(i, i * 10);
		}
		

	}

}
