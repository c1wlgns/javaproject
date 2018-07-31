package javabook;

public class DoWhileTest2 {

	public static void main(String[] args) throws java.io.IOException {
		// TODO Auto-generated method stub
		char choice;
		do{
			System.out.println("*** 아이돌 팀 소개 ***");
			System.out.println(" 0. ALL");
			System.out.println(" 1. 방탄소년단");
			System.out.println(" 2. 소녀시대");
			System.out.println(" 3. 애프터스쿨");
			System.out.println(" 4. 트와이스");
			System.out.println(" 5. 마마무");
			System.out.println(" 6. 워너원");
			System.out.println(" 7. 여자친구");
			System.out.println("원하는 번호를 입력하세요: ");
			choice = (char)System.in.read();
			System.out.println();
		}while( choice < '0' || choice > '7');
		
		switch(choice)
		{
		case '0': 
			System.out.println("*** ALL ***");
			System.out.println("*** 방탄소년단 ***");
			System.out.println(" 소속사: 빅히트");
			System.out.println(" RM, 슈가, 진, 제이홉, 지민, 뷔, 정국");
			
			System.out.println("*** 소녀시대 ***");
			System.out.println(" 소속사: SM");
			System.out.println(" 태연, 써니, 티파니, 효연, 유리, 수영, 윤아, 서현");
			
			System.out.println("*** 애프터스쿨 ***");
			System.out.println(" 소속사: 플레디스");
			System.out.println(" 레이나, 나나, 이영, 가은");
			
			System.out.println("*** 트와이스 ***");
			System.out.println(" 소속사: JYP");
			System.out.println(" 나연, 정연, 모모, 사나, 지효, 미나, 다현, 채영, 쯔위");
			
			System.out.println("*** 마마무 ***");
			System.out.println(" 소속사: RBW");
			System.out.println(" 솔라, 문별, 휘인, 화사 ");
			
			System.out.println("*** 워너원 ***");
			System.out.println(" 소속사: SWING");
			System.out.println(" 강다니엘, 박지훈, 이대휘, 김재환, 옹성우, 박우진, 라이관린, 윤지성, 황민현, 배진영, 하성운");
			
			System.out.println("*** 여자친구 ***");
			System.out.println(" 소속사: 쏘스뮤직");
			System.out.println(" 소원, 예린, 은하, 유주, 신비, 엄지 ");
			break;
		case '1':
			System.out.println("*** 방탄소년단 ***");
			System.out.println(" 소속사: 빅히트");
			System.out.println(" RM, 슈가, 진, 제이홉, 지민, 뷔, 정국");
			break;
		case '2':
			System.out.println("*** 소녀시대 ***");
			System.out.println(" 소속사: SM");
			System.out.println(" 태연, 써니, 티파니, 효연, 유리, 수영, 윤아, 서현");
			break;
		case '3': 
			System.out.println("*** 애프터스쿨 ***");
			System.out.println(" 소속사: 플레디스");
			System.out.println(" 레이나, 나나, 이영, 가은");
			break;
		case '4': 
			System.out.println("*** 트와이스 ***");
			System.out.println(" 소속사: JYP");
			System.out.println(" 나연, 정연, 모모, 사나, 지효, 미나, 다현, 채영, 쯔위");
			break;
		case '5': 
			System.out.println("*** 마마무 ***");
			System.out.println(" 소속사: RBW");
			System.out.println(" 솔라, 문별, 휘인, 화사 ");
			break;
		case '6': 
			System.out.println("*** 워너원 ***");
			System.out.println(" 소속사: SWING");
			System.out.println(" 강다니엘, 박지훈, 이대휘, 김재환, 옹성우, 박우진, 라이관린, 윤지성, 황민현, 배진영, 하성운");
			break;
		case '7': 
			System.out.println("*** 여자친구 ***");
			System.out.println(" 소속사: 쏘스뮤직");
			System.out.println(" 소원, 예린, 은하, 유주, 신비, 엄지 ");
			break;
			
			
		
		}
	}

}
