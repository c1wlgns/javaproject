import java.util.Date;

public class DayProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		int currentHour = date.getHours();

		System.out.println("����ð� : " + date);

		if (currentHour == 8) {
			System.out.println("��ħ�" +currentHour);
		} else if (currentHour <= 11&&currentHour>9 ) {
			System.out.println("�������� ��"+currentHour);
		} else if (currentHour == 12) {
			System.out.println("���ִ� ����"+currentHour);
		} else if (currentHour <= 16&&currentHour>13) {
			System.out.println("���İ��� ��"+currentHour);
		} else if (currentHour == 17) {
			System.out.println("��ſ� �ϱ���"+currentHour);
		} else if (currentHour <= 19&&currentHour>18) {
			System.out.println("���ִ� ����"+currentHour);
		} else if (currentHour <= 21&&currentHour>20) {
			System.out.println("�ڱ��� ����"+currentHour);
		} else if (currentHour <= 23&&currentHour>22) {
			System.out.println("�����ð�"+currentHour);
		} else {
			System.out.println("���� �� �ڴ� ��");
		}

	}




}


