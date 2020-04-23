
public class Leg {
	private double length;
	private String color;
	public Leg(double length, String color) {
		
		this.length = length;
		this.color = color;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Leg [length=" + length + ", color=" + color + ", getLength()=" + getLength() + ", getColor()="
				+ getColor() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
