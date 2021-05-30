package exam;

public class Person {

	public static void main(String[] args) {
		SinRamen sinRamen = new SinRamen();
		getRamen(sinRamen);

		Ansungtangmen ansungtangmen = new Ansungtangmen();
		getRamen(ansungtangmen);

		BuldakBokemmen buldakBokemmen = new BuldakBokemmen();
		getRamen(buldakBokemmen);
	}

	public static void getRamen(Ramen ramen) {
		ramen.putWater();

		if(ramen instanceof BuldakBokemmen)
			((BuldakBokemmen) ramen).pourWater();

		ramen.putSoup();
		ramen.waitTime();
	}

}