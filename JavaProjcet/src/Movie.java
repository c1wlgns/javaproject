
public class Movie {
	String title;
	int year;
	double rating;
	String director;
	String writer;
	String stars;
	String update;
	
	void print() {
		System.out.println("����: "+title+" ������: "+ " ����:"+ director+ " �۰�:"+ writer
				+ " �⿬:" + stars+ "\n ����:"+ rating+ " ������:" + year + " "+ update);
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
		m.update = "3�� 8��";
		m.print();
		
		
		
	}

}
