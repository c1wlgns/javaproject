
public class school {
	String cRoom;
	String tRoom;
	
	void print() {
		System.out.println("�б��� ������ �ַ�"+ cRoom + "��" +" "+ tRoom +"����  ������ ���ϴ�.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 school s;
		 s = new school();
		 s.cRoom = "����(�л����� ����)";
		 s.tRoom = "������(���������� ����)";
		 s.print();
		 

	}

}

class classRoom {
	int roomNumber;
	String bookRoom;
	String tryingRoom;
	
	void print() {
		System.out.println("������ ������" + roomNumber + "�Ϲ����� ���� �̿ܿ���" + bookRoom+ "��"+ " " +tryingRoom +"�� �ִ�." );
		
	}
	
}

	

