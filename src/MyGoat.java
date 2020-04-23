
public class MyGoat {

	public static void main(String[] args) {
		
		Beard b1 = new Beard("Pink");
		Tail t1 = new Tail(23.4);
		Leg [] legs1 = new Leg[4];
		legs1[0]=new Leg(21,"White");
		legs1[1]=new Leg(21,"White");
		legs1[2]=new Leg(21,"White");
		legs1[3]=new Leg(21,"White");
		
		Goat aziza =new Goat(12, 12.5,"Brown", t1, legs1,b1);
		Beard b2 = new Beard("Yellow");
		Tail t2 = new Tail(5);
		
		Leg [] legs2 = new Leg[4];
		legs2[0]=new Leg(21,"Red");
		legs2[1]=new Leg(21,"Red");
		legs2[2]=new Leg(21,"Red");
		legs2[3]=new Leg(21,"Red");
		
		Goat rohama =new Goat(16, 10,"Gray", t2,legs2,b2);
		
		System.out.println(rohama.toString());
		System.out.println(aziza.toString());
		System.out.println(b1);
	}

}
