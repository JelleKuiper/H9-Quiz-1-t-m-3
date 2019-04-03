package me.uteh.Periode3.H9;

import java.util.Arrays;

public class Q3 {

	public static void main(String[] args) {
		//Opdracht 2: Na opdracht 1 krijg je een foutmelding, los dit op. (antwoord: verander de lengte van de string).
		String[] arrDier = new String[8];
		arrDier[0] = "Wolf ";
		arrDier[1] = "Leeuw ";
		arrDier[2] = "Luipaard ";
		arrDier[3] = "Olifant ";
		arrDier[4] = "Tijger ";
		//Opdracht 1: Voeg drie dieren toe, beer, zebra en aap.
		arrDier[5] = "Beer ";
		arrDier[6] = "Zebra ";
		arrDier[7] = "Aap ";
		Arrays.sort(arrDier);
		
		//Opdracht 3: zorg ervoor dat alle dieren in alfabetische volgorde worden geprint.
		for(int i = 0; i < arrDier.length; i++) {
			//if (i > 1) {
				System.out.print(arrDier[i]);
			//}
		}
	}
}
