
public class Date {
	private int year;
	private String month;
	private int day;
	
	public Date() { //기본 생성자
		this(1900,"1월",1);
	}
	public Date(int year) { //생성자
		this(year,"1월", 1);
	}
	public Date(int year, String month, int day) {// 생성자
		this.month = month;
		this.day = day;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Date [year=" + year +", month=" + month + ", day=" + day+ "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date1 = new Date(2015,"8월", 10);
		Date date2 = new Date(2020);
		Date date3 = new Date();
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);

	}

}
