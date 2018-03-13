
public class Movie {
	String title;
	int year;
	double rating;
	String director;
	String writer;
	String stars;
	String update;
	
	void print() {
		System.out.println("제목: "+title+" 상세정보: "+ " 감독:"+ director+ " 작가:"+ writer
				+ " 출연:" + stars+ "\n 평점:"+ rating+ " 개봉일:" + year + " "+ update);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m;
		m = new Movie();
		m.title = "Tomb Raider";
		m.director = "Roar Uthaug";
		m.writer = "Geneva Robertson-Dworet";
		m.stars = "Alicia Vikander, Dominic West, Walton Goggins ";
		m.rating = 7.5;
		m.year = 2018;
		m.update = "3월 8일";
		m.print();
		
		
		
	}

}
