package ItsYaBoy;

import java.util.ArrayList;

public abstract class Producten {
	ArrayList<Boeken> boeken = new ArrayList();
	ArrayList<Electronica> electronica = new ArrayList();
	int prijs;
	String titel;
	
	public void verkopen() {
		System.out.println("Ik ben te verkopen");
	}
}

class Boeken extends Producten {
	
}

class Electronica extends Producten {
	
}