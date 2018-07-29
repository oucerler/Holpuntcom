package ItsYaBoy;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlineKassa {
	int geldhoeveelheid;
	ArrayList <Producten> verkochteProducten = new ArrayList();
	Scanner scanner = new Scanner (System.in);
	
	int verkopen()//return type nodig want we krijgen iets en we gaan wat terug geven
	{
		System.out.println("Wilt u dit product in uw winkelmandje doen? /nToets 1 voor ja, toets 2 voor nee.");
	String invoer = scanner.nextLine();
	System.out.println(invoer);
	int getal = Integer.parseInt(invoer);
	return getal;
	}
}
