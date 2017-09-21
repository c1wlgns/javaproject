import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Universal_find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int U;
		String Universal;

		Scanner Universalcode = new Scanner(System.in);
		System.out.print("Universal Code: ");
		U = Universalcode.nextInt();

		switch (U) {

		case 625:
			Universal = "SEOUL";
			break;
		case 583:
			Universal = "PARIS";
			break;
		case 680:
			Universal = "DOKYO";
			break;
		case 560:
			Universal = "L.A";
			break;
		default:
			Universal = "Not WE aer team.\nyour guest Universal.";
			break;

		}
		System.out.println("Your Universal is: " + Universal);

	}



	}


