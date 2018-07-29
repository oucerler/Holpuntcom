package ItsYaBoy;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Producten
{
	static OnlineKassa onlinekassa = new OnlineKassa
	String naam;
	int prijs;
	int voorraad;
	
	Producten(String naam, int prijs, int voorraad)
	{
		this.naam = naam;
		this.prijs = prijs;
		this.voorraad = voorraad;
	}
		public static void laatZienProducten() {
		System.out.println("In welke producten bent u geïnteresseerd? voor boeken kies 1, voor electronica kies 2, voor speelgoed kies 3. kies 0 om terug te gaan naar het hoofdmenu.");
		boolean gaDoor = true;
		while (gaDoor) {
			Scanner scInp = new Scanner(System.in);
			int scKiezen = scInp.nextInt();
			switch (scKiezen) {
			case 1: Boeken.laatZienBoeken();
			break;
			case 2: Electronica.laatZienElectronica();
			break;
			case 3: Speelgoed.laatZienSpeelgoed();
			break;
			case 0: Holpuntcom.starten();
			default: System.out.println("Foute input");
			}
		}
	}
	
}

class Boeken extends Producten
{
	static ArrayList<Boeken> boeken = new ArrayList();
	Boeken(String naam, int prijs, int voorraad) {
		super(naam, prijs, voorraad);
	boolean tweedehands;
	int jaartal;
	boeken.add(new Boeken ("Turks Fruit", 1999, 10));
	boeken.add(new Boeken ("Jurassic Park", 1500, 20));
	boeken.add(new Boeken ("Roots", 1750, 15));
	boeken.add(new Boeken ("Nederland Roofstaat", 1250, 25));
	}
	public static void laatZienBoeken() {
		System.out.println("Dit is ons assortiment");
		for (Boeken b : boeken) {
			System.out.println(b);
		}
		startVerkoop();
		int keuze = onlinekassa.verkopen();
	}
	public String toString() {
		return naam + " kost " + prijs;
	}
}


class Electronica extends Producten
{
	static ArrayList<Electronica> electronica = new ArrayList();
	Electronica(String naam, int prijs, int voorraad) {
		super(naam, prijs, voorraad);
	boolean laptop;
	int SSD;
	electronica.add(new Electronica ("Dell Latitude", 50000, 8));
	electronica.add(new Electronica ("Huawei ALE", 12000, 6));
	}
	public static void laatZienElectronica() {
		System.out.println("Dit is ons assortiment");
		for (Electronica e: electronica) {
			System.out.println(e);
		}
		startVerkoop();
	}
	public String toString() {
		return naam + " kost " + prijs;
	}
}

class Speelgoed extends Producten
{
	static ArrayList<Speelgoed> speelgoed = new ArrayList();
	Speelgoed(String naam, int prijs, int voorraad) {
		super(naam, prijs, voorraad);
	String merk;
	int aantalStukjes;
	speelgoed.add(new Speelgoed ("Lego Creator Huis", 5995, 15));
	speelgoed.add(new Speelgoed ("Teenage Mutant Ninja Turtle", 1995, 12));
	speelgoed.add(new Speelgoed ("Stratego", 2000, 8));
	}
	public static void laatZienSpeelgoed() {
		System.out.println("Dit is ons assortiment");
		for (Speelgoed s: speelgoed) {
			System.out.println(s);
		}
		startVerkoop();
	}
	public String toString() {
		return naam + " kost " + prijs;
	}
}

void startVerkoop() {
	
}

class VoorraadLeeg extends Exception{}