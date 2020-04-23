
public class Main {

	public static void main(String[] args) {
		Author gal =new Author("Gal Matalon","Natanya");
		Book javaBook = new Book (97,"The java world for QA", gal);
		Book seleniumBook = new Book (197,"The selenium world", gal);
		System.out.println(javaBook.whoIsTheAuthor());
		System.out.println(seleniumBook.whoIsTheAuthor());
	}

}
