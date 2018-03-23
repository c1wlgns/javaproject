
public class Television {
	
	int channel;
	int volume;
	boolean onOff;

	void print() {
		System.out.println("채널은 " + channel + "이고 볼륨은 "+ volume+ "입니다."  );
	}
	int getChannel() {
		return channel;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television myTv = new Television();
		
		myTv.channel = 7;
		int ch = myTv.getChannel();
		System.out.println("현재 채널은 " + ch + "입니다.");
	}

}
