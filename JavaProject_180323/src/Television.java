
public class Television {
	
	int channel;
	int volume;
	boolean onOff;

	void print() {
		System.out.println("ä���� " + channel + "�̰� ������ "+ volume+ "�Դϴ�."  );
	}
	int getChannel() {
		return channel;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television myTv = new Television();
		
		myTv.channel = 7;
		int ch = myTv.getChannel();
		System.out.println("���� ä���� " + ch + "�Դϴ�.");
	}

}
