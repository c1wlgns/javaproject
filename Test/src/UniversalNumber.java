import java.util.Scanner;

public class UniversalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String UNumber;

		Scanner U = new Scanner(System.in);

		for (int i = 0;; i++) {
			System.out.print("나라를 입력하세요: ");
			UNumber = U.next();

			String UniversalNumber = "0";

			switch (UNumber) {
			case "대한민국":
				UniversalNumber = "+82";
				break;
			case "한국":
				UniversalNumber = "+82";
				break;
			case "영국":
				UniversalNumber = "+44";
				break;
			case "미국":
				UniversalNumber = "+1";
				break;
			case "터키":
				UniversalNumber = "+90";
				break;
			case "홍콩":
				UniversalNumber = "+852";
				break;
			case "이성재_제국":
				UniversalNumber = "-257";
				break;
			case "4차원주머니":
				UniversalNumber = "+대나무 헬리콥터!";
				break;
			default:
				System.out.println("Error.\nRe try. ");
				break;
			}

			if (UniversalNumber != "0"){
				System.out.println(UNumber + " 국가번호는 " + UniversalNumber + " 입니다.");
			}else{
				System.out.println(UNumber + "의 국가번호는 아직 업데이트 되지 않았습니다.");
			}
		}

	}

}
