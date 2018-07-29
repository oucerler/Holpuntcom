package ItsYaBoy;

import java.util.ArrayList;
import java.util.Scanner;

//eerst maak ik de hoofdclass aan
public class HolpuntcomApp {
	public static void main(String[] args) {
	Holpuntcom hol = new Holpuntcom();
	hol.starten(); //object oriented bezig
	}
	Scanner scanner = new Scanner(System.in);
	OnlineKassa OnlineKassa;
	Voorraad Voorraad;
	
}
	class Holpuntcom{
	ArrayList<Producten> producten = new ArrayList();
	OnlineKassa kassa = new OnlineKassa();
	BoekenKorting boekenkorting = new BoekenKorting();
	
	
	
	
	static void starten() {
		System.out.println("welkom bij Holpuntcom. Kies p om naar de producten te gaan, w om uw winkelmandje te zien,v voor uw verlanglijstje, of i als u de voorraad wilt zien.");
		Scanner scInp = new Scanner (System.in);
		String scKeuze = scInp.nextLine();
		if (scKeuze.equals("p"))
		{
			try
			{
				Producten.laatZienProducten();
			} catch (VoorraadLeeg e) {
				
			}
		}
	}
}