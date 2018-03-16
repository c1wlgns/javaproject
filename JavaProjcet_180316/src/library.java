
public class library {
	String user;
	String book;
	
	void print() {
		System.out.println("도서관에는 " + user + "가 두 가지의 분류로 나눠져 있고, " + book + "는 총 9가지의 종류가 있습니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		library u;
		u = new library();
		u.user = "사용자";
		u.book = "도서";
		u.print();
			
		}

	}

class libraryTerm {	//대출기간
	int staff; //staff의 대출기간
	int exploiter; //exploiter의 대출기간

	
}

class libraryCount {	//대출가능 도서 권수
	int staff;	//staff의 대출가능 도서 권수
	int exploiter;	//exploiter의 대출가능 권수
}

class bookKinds {	//책 종류
	String normal;	//일반 책
	String braille;	//점자 책
	String online;	//e-book
}

class genre {	//책 장르
	String history;	//역사
	String novel;	//소설
	String literature;	//문학
	String manga;	//만화
	String science;	//과학
}

class information {	//도서관 기본정보
	int open;	//여는 시간
	int close;	//닫는 시간
}

class facilities {	//도서관 편의시설
	String convenience;	//편의점
	String bookCafe;	//북카페
	String bookStore;	//서점
}


