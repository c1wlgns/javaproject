import java.util.Scanner;

public class PositoinNumber_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int P;
		String position;

		Scanner p = new Scanner(System.in);
		System.out.print("�ش��ڵ带 �Է��Ͻÿ�: ");
		P = p.nextInt();

		switch (P) {

		case 309275:
			position = "CEO";
			break;
		case 10924:
			position = "Team Leader";
			break;
		case 26739:
			position = "Section chief";
			break;
		case 51987:
			position = "Intern";
			break;
		default:
			position = "Not team.\nyour guest.";
			break;

		}
		System.out.println("����: " + position);

	}

}
