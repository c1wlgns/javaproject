import java.util.Date;

public class DayProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		int currentHour = date.getHours();

		System.out.println("현재시간 : " + date);

		if (currentHour == 8) {
			System.out.println("아침등교" +currentHour);
		} else if (currentHour <= 11&&currentHour>9 ) {
			System.out.println("오전공부 중"+currentHour);
		} else if (currentHour == 12) {
			System.out.println("맛있는 점심"+currentHour);
		} else if (currentHour <= 16&&currentHour>13) {
			System.out.println("오후공부 중"+currentHour);
		} else if (currentHour == 17) {
			System.out.println("즐거운 하굣길"+currentHour);
		} else if (currentHour <= 19&&currentHour>18) {
			System.out.println("맛있는 저녁"+currentHour);
		} else if (currentHour <= 21&&currentHour>20) {
			System.out.println("자기전 샤워"+currentHour);
		} else if (currentHour <= 23&&currentHour>22) {
			System.out.println("자유시간"+currentHour);
		} else {
			System.out.println("편히 잠 자는 중");
		}

	}




}


