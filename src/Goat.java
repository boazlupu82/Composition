import java.util.Arrays;

public class Goat {
	private int age;
	private double wieght;
	private String color;
	private Tail tail;
	private Leg[] leg;
	private Beard beard;
	public Goat(int age, double wieght, String color, Tail tail, Leg[] leg, Beard beard) {
		
		this.age = age;
		this.wieght = wieght;
		this.color = color;
		this.tail = tail;
		this.leg = leg;
		this.beard = beard;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWieght() {
		return wieght;
	}
	public void setWieght(double wieght) {
		this.wieght = wieght;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Tail getTail() {
		return tail;
	}
	public void setTail(Tail tail) {
		this.tail = tail;
	}
	public Leg[] getLeg() {
		return leg;
	}
	public void setLeg(Leg[] leg) {
		this.leg = leg;
	}
	public Beard getBeard() {
		return beard;
	}
	public void setBeard(Beard beard) {
		this.beard = beard;
	}
	
	public String toString() {
		return "Goat [age=" + age + ", wieght=" + wieght + ", color=" + color + ", tail=" + tail + ", leg="
				+ Arrays.toString(leg) + ", beard=" + beard + "]";
	}
		
}
