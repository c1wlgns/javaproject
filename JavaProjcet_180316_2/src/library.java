
public class library {
	String user;
	String book;
	
	void print() {
		System.out.println("���������� " + user + "�� �� ������ �з��� ������ �ְ�, " + book + "�� �� 9������ ������ �ֽ��ϴ�.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		library u;
		u = new library();
		u.user = "�����";
		u.book = "����";
		u.print();
			
		}

	}

class libraryTerm {	//����Ⱓ
	int staff; //staff�� ����Ⱓ
	int exploiter; //exploiter�� ����Ⱓ

	
}

class libraryCount {	//���Ⱑ�� ���� �Ǽ�
	int staff;	//staff�� ���Ⱑ�� ���� �Ǽ�
	int exploiter;	//exploiter�� ���Ⱑ�� �Ǽ�
}

class bookKinds {	//å ����
	String normal;	//�Ϲ� å
	String braille;	//���� å
	String online;	//e-book
}

class genre {	//å �帣
	String history;	//����
	String novel;	//�Ҽ�
	String literature;	//����
	String manga;	//��ȭ
	String science;	//����
}

class information {	//������ �⺻����
	int open;	//���� �ð�
	int close;	//�ݴ� �ð�
}

class facilities {	//������ ���ǽü�
	String convenience;	//������
	String bookCafe;	//��ī��
	String bookStore;	//����
}


