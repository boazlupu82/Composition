
public class Book {

	//Variables
	private int price;
	private String name;
	private Author author;
	//Constructor
	public Book(int price, String name, Author author) {

		this.price = price;
		this.name = name;
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public static String whoIsTheAuthor() {
		return Author.getName();
	}
}
