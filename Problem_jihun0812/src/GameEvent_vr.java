import java.util.Scanner;

public class GameEvent_vr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String A;

		System.out.printf("A ~ C 중에 선택하세요 : ");
		A = s.next();

		switch (A) {
		case "A":
			System.out.printf("Wood arrow\n");
			break;
		case "B":
			System.out.printf("Black worm\n");
			break;
		case "C":
			System.out.printf("Star\n");
			break;
		default:
			System.out.printf("not Item.\n");
		}
	}

}
