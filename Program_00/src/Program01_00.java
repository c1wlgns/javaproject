import java.util.Scanner;

public class Program01_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d;
		String g;
		
		Scanner A = new Scanner(System.in);
		System.out.printf("������ ��� �ñ��Ͻø� 1~5 ���� �� �ϳ��� ���� �� �Է��ϼ���: ");
		d = A.nextInt();
		
		switch (d) {
		
		case 1:
			g = "��� �Ͽ� �����϶�";
			break;
		case 2:
			g = "��� �� �̵� �ڽŰ��� ������ ���� �� ����.";
			break;
		case 3:
			g = "���� ����� �̷������.";
			break;
		case 4:
			g = "�������� �� �� ���� �����.";
			break;
		case 5:
			g = "���� ���� ����. �׷��� ������ ���� ��� ó�� ���� ���� ����";
		default:
			g = "��������";
			break;
		}
		
		System.out.println("������ ���? " +g);
		
		
	}

}

