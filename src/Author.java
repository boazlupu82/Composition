
public class Author {
	//Variables
	private static String name;
	private String address;
	//Constructor
	public Author(String name, String address) {
		
		this.name = name;
		this.address = address;
	}

	public static String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
