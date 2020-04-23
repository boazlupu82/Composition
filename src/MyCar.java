
public class MyCar {

	public static void main(String[] args) {
		Wheel [] galgal = new Wheel[5];
		galgal[0]= new Wheel(35, "toyo");
		galgal[1]= new Wheel(35, "toyo");
		galgal[2]= new Wheel(35, "toyo");
		galgal[3]= new Wheel(35, "toyo");
		galgal[4]= new Wheel(35, "toyo");
		z,cxnb<KZcb,ZNcb,zNxbc,Zcb,k,ZNXBc,ciSDHGLIHGSLDFHDGSDH
		
		Station [] statio1 = new Station[5];
		statio1[0]= new Station("Galgalz", 98.1);
		statio1[1]= new Station("Radius", 100.0);
		statio1[2]= new Station("Tel-Aviv", 102.0);
		statio1[3]= new Station("Kol-Israel", 91.0);
		statio1[4]= new Station("Lev-Hamedina", 89.0);
		Radio radio1 = new Radio(true, statio1);
		Auto myAuto = new Auto("Subaru", "Legacy", 1991, radio1, galgal);
		
		System.out.println(radio1.getStation());
		myAuto.getWheelAirPressure();
		//System.out.println(myAuto.getWheelAirPressure());
		System.out.println("");
		myAuto.puncher(0);
		System.out.println(galgal[4]);
		

	}

}
