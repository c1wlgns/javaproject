package javabook;

public class DoWhileTest2 {

	public static void main(String[] args) throws java.io.IOException {
		// TODO Auto-generated method stub
		char choice;
		do{
			System.out.println("*** ���̵� �� �Ұ� ***");
			System.out.println(" 0. ALL");
			System.out.println(" 1. ��ź�ҳ��");
			System.out.println(" 2. �ҳ�ô�");
			System.out.println(" 3. �����ͽ���");
			System.out.println(" 4. Ʈ���̽�");
			System.out.println(" 5. ������");
			System.out.println(" 6. ���ʿ�");
			System.out.println(" 7. ����ģ��");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���: ");
			choice = (char)System.in.read();
			System.out.println();
		}while( choice < '0' || choice > '7');
		
		switch(choice)
		{
		case '0': 
			System.out.println("*** ALL ***");
			System.out.println("*** ��ź�ҳ�� ***");
			System.out.println(" �Ҽӻ�: ����Ʈ");
			System.out.println(" RM, ����, ��, ����ȩ, ����, ��, ����");
			
			System.out.println("*** �ҳ�ô� ***");
			System.out.println(" �Ҽӻ�: SM");
			System.out.println(" �¿�, ���, Ƽ�Ĵ�, ȿ��, ����, ����, ����, ����");
			
			System.out.println("*** �����ͽ��� ***");
			System.out.println(" �Ҽӻ�: �÷���");
			System.out.println(" ���̳�, ����, �̿�, ����");
			
			System.out.println("*** Ʈ���̽� ***");
			System.out.println(" �Ҽӻ�: JYP");
			System.out.println(" ����, ����, ���, �糪, ��ȿ, �̳�, ����, ä��, ����");
			
			System.out.println("*** ������ ***");
			System.out.println(" �Ҽӻ�: RBW");
			System.out.println(" �ֶ�, ����, ����, ȭ�� ");
			
			System.out.println("*** ���ʿ� ***");
			System.out.println(" �Ҽӻ�: SWING");
			System.out.println(" ���ٴϿ�, ������, �̴���, ����ȯ, �˼���, �ڿ���, ���̰���, ������, Ȳ����, ������, �ϼ���");
			
			System.out.println("*** ����ģ�� ***");
			System.out.println(" �Ҽӻ�: �����");
			System.out.println(" �ҿ�, ����, ����, ����, �ź�, ���� ");
			break;
		case '1':
			System.out.println("*** ��ź�ҳ�� ***");
			System.out.println(" �Ҽӻ�: ����Ʈ");
			System.out.println(" RM, ����, ��, ����ȩ, ����, ��, ����");
			break;
		case '2':
			System.out.println("*** �ҳ�ô� ***");
			System.out.println(" �Ҽӻ�: SM");
			System.out.println(" �¿�, ���, Ƽ�Ĵ�, ȿ��, ����, ����, ����, ����");
			break;
		case '3': 
			System.out.println("*** �����ͽ��� ***");
			System.out.println(" �Ҽӻ�: �÷���");
			System.out.println(" ���̳�, ����, �̿�, ����");
			break;
		case '4': 
			System.out.println("*** Ʈ���̽� ***");
			System.out.println(" �Ҽӻ�: JYP");
			System.out.println(" ����, ����, ���, �糪, ��ȿ, �̳�, ����, ä��, ����");
			break;
		case '5': 
			System.out.println("*** ������ ***");
			System.out.println(" �Ҽӻ�: RBW");
			System.out.println(" �ֶ�, ����, ����, ȭ�� ");
			break;
		case '6': 
			System.out.println("*** ���ʿ� ***");
			System.out.println(" �Ҽӻ�: SWING");
			System.out.println(" ���ٴϿ�, ������, �̴���, ����ȯ, �˼���, �ڿ���, ���̰���, ������, Ȳ����, ������, �ϼ���");
			break;
		case '7': 
			System.out.println("*** ����ģ�� ***");
			System.out.println(" �Ҽӻ�: �����");
			System.out.println(" �ҿ�, ����, ����, ����, �ź�, ���� ");
			break;
			
			
		
		}
	}

}
