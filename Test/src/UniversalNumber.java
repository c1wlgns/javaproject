import java.util.Scanner;

public class UniversalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String UNumber;

		Scanner U = new Scanner(System.in);

		for (int i = 0;; i++) {
			System.out.print("���� �Է��ϼ���: ");
			UNumber = U.next();

			String UniversalNumber = "0";

			switch (UNumber) {
			case "���ѹα�":
				UniversalNumber = "+82";
				break;
			case "�ѱ�":
				UniversalNumber = "+82";
				break;
			case "����":
				UniversalNumber = "+44";
				break;
			case "�̱�":
				UniversalNumber = "+1";
				break;
			case "��Ű":
				UniversalNumber = "+90";
				break;
			case "ȫ��":
				UniversalNumber = "+852";
				break;
			case "�̼���_����":
				UniversalNumber = "-257";
				break;
			case "4�����ָӴ�":
				UniversalNumber = "+�볪�� �︮����!";
				break;
			default:
				System.out.println("Error.\nRe try. ");
				break;
			}

			if (UniversalNumber != "0"){
				System.out.println(UNumber + " ������ȣ�� " + UniversalNumber + " �Դϴ�.");
			}else{
				System.out.println(UNumber + "�� ������ȣ�� ���� ������Ʈ ���� �ʾҽ��ϴ�.");
			}
		}

	}

}
