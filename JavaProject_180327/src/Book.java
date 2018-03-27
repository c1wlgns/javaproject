
public class Book {
	private String title, author, publisher, genre;
	private String year;
	
	private String getTitle() {
		return title;
	}
	void setTitle(String title) {
		this.title = title;
	}
	private String getAuthor() {
		return author;
	}
	void setAuthor(String author) {
		this.author = author;
	}
	private String getPublisher() {
		return publisher;
	}
	void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	private String getGenre() {
		return genre;
	}
	void setGenre(String genre) {
		this.genre = genre;
	}
	private String getYear() {
		return year;
	}
	void setYear(String string) {
		this.year = string;
	}
	
}

class BookTest {
	public static void main(String[] args){
		
		Book b = new Book();
		b.setTitle("Talmud");
		b.setAuthor("Q");
		b.setPublisher("Why");
		b.setGenre("change");
		b.setYear("400");
	}
}