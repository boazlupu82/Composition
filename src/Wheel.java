
public class Wheel {
	private double airPressure;
	private String tireModel;
	
	public Wheel(double airPressure, String tireModel) {
		
		this.airPressure = airPressure;
		this.tireModel = tireModel;
	}

	public double getAirPressure() {
		return airPressure;
	}

	public void setAirPressure(double airPressure) {
		this.airPressure = airPressure;
	}

	public String getTireModel() {
		return tireModel;
	}

	public void setTireModel(String tireModel) {
		this.tireModel = tireModel;
	}

	@Override
	public String toString() {
		return "Wheel [airPressure=" + airPressure + ", tireModel=" + tireModel + ", getAirPressure()="
				+ getAirPressure() + ", getTireModel()=" + getTireModel() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
