import java.util.Scanner;

public class PositionNumber_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String position;
				
				Scanner P = new Scanner(System.in);
				System.out.print("������ �Է��ϼ���: ");
				position = P.next();
				
				int positionNumber = 0;

				switch (position) {
				case "CEO":
					positionNumber = 309275;
					break;
				case "Team Leader":
					positionNumber = 10924;
					break;
				case "Section chief":
					positionNumber = 26739;
					break;
				case "Intern":
					positionNumber = 51987;
					break;
				default:
					System.out.println("Not team.\nyour guest. ");
					break;
					
				}
				System.out.println(position +"�ڵ�� "+positionNumber+" �Դϴ�.");
				
				

			}



	}

