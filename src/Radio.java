
public class Radio {
	private boolean state;
	private Station [] station;
	
	
	public Radio(boolean state, Station[] station){
		
		this.state = state;
		this.station = station;
		
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public Station[] getStation() {
		return station;
	}

	public void setStation(Station[] station) {
		this.station = station;
	}

		
}
