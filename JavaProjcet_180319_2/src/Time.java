
public class Time {
	private int hour;	//0-23
	private int minute;	//0-59
	private int second;	//0-59
	
	//ù��° ������
	public Time() {
		this(0,0,0);
	}
	
	//�ι�° ������
	public Time(int h, int m, int s) {
		hour = ((h >= 0 && h < 24)? h : 0);		//�ð�����
		minute = ((m >= 0 && m < 60)? m : 0);	//�� ����
		second = ((s >= 0 && s <60)? s : 0);	//�� ����
	}
	
	//"��:��:��"�� �������� ���
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Time ��ü�� �����ϰ� �ʱ�ȭ�Ѵ�.
		Time time = new Time();
		System.out.println("�⺻ ������ ȣ�� �� �ð�: "+time.toString());
		
		//�� ��° ������ ȣ��
		Time time2 = new Time(13, 27, 6);
		System.out.println("�ι��� ������ ȣ�� �� �ð�: "+time2.toString());
		
		//�ùٸ��� ���� �ð����� �����غ���.
		Time time3 = new Time(99, 66, 77);
		System.out.println("�ùٸ��� ���� �ð� ���� �� �ð�: "+time3.toString());

	}

}
