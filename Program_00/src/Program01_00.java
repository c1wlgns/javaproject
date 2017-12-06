import java.util.Scanner;

public class Program01_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d;
		String g;
		
		Scanner A = new Scanner(System.in);
		System.out.printf("오늘의 운세가 궁금하시면 1~5 까지 중 하나를 선택 해 입력하세요: ");
		d = A.nextInt();
		
		switch (d) {
		
		case 1:
			g = "모든 일에 조심하라";
			break;
		case 2:
			g = "어떠한 일 이든 자신감을 가져도 좋을 것 같다.";
			break;
		case 3:
			g = "오늘 사랑이 이루어진다.";
			break;
		case 4:
			g = "생각지도 못 한 돈이 생긴다.";
			break;
		case 5:
			g = "음식 복이 없다. 그러니 오늘은 음식 욕심 처음 부터 내지 마라";
		default:
			g = "에러검출";
			break;
		}
		
		System.out.println("오늘의 운세는? " +g);
		
		
	}

}

