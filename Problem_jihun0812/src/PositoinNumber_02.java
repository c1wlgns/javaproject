import java.util.Scanner;

public class PositoinNumber_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z;
		String position;

		Scanner v = new Scanner(System.in);
		System.out.print("해당코드를 입력하시오: ");
		z = v.nextInt();

		switch (z) {

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
		System.out.println("직급: " + position);

	}

}
