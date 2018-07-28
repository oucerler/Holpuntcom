package ItsYaBoy;

import java.util.ArrayList;

//eerst maak ik de hoofdclass aan
public class HolpuntcomApp {
	public static void main(String[] args) {
	Holpuntcom hol = new Holpuntcom();
	hol.starten(); //object oriented bezig
	}
}
class Holpuntcom{
	ArrayList<Producten> producten = new ArrayList();
	OnlineKassa kassa = new OnlineKassa();
	void starten() {
		System.out.println("hallo in starten Holpuntcom");
	}
}