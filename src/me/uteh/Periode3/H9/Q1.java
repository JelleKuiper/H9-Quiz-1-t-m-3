package me.uteh.Periode3.H9;

public class Q1 {

	public static void main(String[] args) {
		//Opdracht: Als je de waarde van de array (3) veranderd naar 11 wat wordt er dan geschreven?
		//Antwoord: 11 nullen.
		int[] arrayInt = new int[11];
		for(int i = 0; i < arrayInt.length; i++) {
			System.out.print(arrayInt[i] + " ");
		}
	}
}
