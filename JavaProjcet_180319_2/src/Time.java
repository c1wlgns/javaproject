
public class Time {
	private int hour;	//0-23
	private int minute;	//0-59
	private int second;	//0-59
	
	//첫번째 생성자
	public Time() {
		this(0,0,0);
	}
	
	//두번째 생성자
	public Time(int h, int m, int s) {
		hour = ((h >= 0 && h < 24)? h : 0);		//시간검증
		minute = ((m >= 0 && m < 60)? m : 0);	//분 검증
		second = ((s >= 0 && s <60)? s : 0);	//초 검증
	}
	
	//"시:분:초"의 형식으로 출력
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Time 객체를 생성하고 초기화한다.
		Time time = new Time();
		System.out.println("기본 생성자 호출 후 시간: "+time.toString());
		
		//두 번째 생성자 호출
		Time time2 = new Time(13, 27, 6);
		System.out.println("두번때 생성자 호출 후 시간: "+time2.toString());
		
		//올바르지 않은 시간으로 설정해본다.
		Time time3 = new Time(99, 66, 77);
		System.out.println("올바르지 않은 시간 설정 후 시간: "+time3.toString());

	}

}
