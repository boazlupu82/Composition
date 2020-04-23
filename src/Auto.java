import java.util.Arrays;

public class Auto {
	private String firm;
	private String model;
	private long modelYaer;
	Radio radio;
	Station station;
	private Wheel[] wheels= new Wheel[5];

	public Auto(String firm, String model, long modelYaer, Radio radio, Wheel[] wheels) {

		this.firm = firm;
		this.model = model;
		this.modelYaer = modelYaer;
		this.radio = radio;
		this.wheels = wheels;
	}

	public String getFirm() {
		return firm;
	}

	public void setFirm(String firm) {
		this.firm = firm;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public long getModelYaer() {
		return modelYaer;
	}

	public void setModelYaer(long modelYaer) {
		this.modelYaer = modelYaer;
	}

	public Radio getRadio() {
		return radio;
	}

	public void setRadio(Radio radio) {
		this.radio = radio;
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}

	public boolean getRadioState() {
		return radio.isState();
	}	
	public String getRadioStation() {
		return station.getName();
	}
	public void getWheelAirPressure() {
		for(int i=0;i<wheels.length;i++) {
			System.out.println("The pressure for tier "+i+" is "+wheels[i]);
		}
	}
	public void puncher(int tier){
		double spare = wheels[5].getAirPressure();
		wheels[wheels.length-1].setAirPressure(0);
		wheels[tier].setAirPressure(spare);


	}

	@Override
	public String toString() {
		return "Auto [firm=" + firm + ", model=" + model + ", modelYaer=" + modelYaer + ", radio=" + radio
				+ ", station=" + station + ", wheels=" + Arrays.toString(wheels) + "]";
	}
	
}

