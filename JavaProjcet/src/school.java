
public class school {
	String cRoom;
	String tRoom;
	
	void print() {
		System.out.println("학교의 공간은 주로"+ cRoom + "과" +" "+ tRoom +"으로  나뉘어 집니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 school s;
		 s = new school();
		 s.cRoom = "교실(학생들의 공간)";
		 s.tRoom = "교무실(교직원들의 공간)";
		 s.print();
		 

	}

}

class classRoom {
	int roomNumber;
	String bookRoom;
	String tryingRoom;
	
	void print() {
		System.out.println("교실의 종류는" + roomNumber + "일반적인 교실 이외에는" + bookRoom+ "과"+ " " +tryingRoom +"이 있다." );
		
	}
	
}

	

