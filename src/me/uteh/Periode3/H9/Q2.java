package me.uteh.Periode3.H9;

public class Q2 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 3;
		arr[1] = 7;
		arr[4] = 3;
		arr[3] = 1;
		arr[1] = 8;
		
		//Opdracht 1: Voeg een conditioneel statement toe die alleen getallen print hoger of gelijk aan 3.
		//Opdracht 2: Compileer en voer je programma uit.
		for(int i = 0; i <arr.length; i++) {
			if (arr[i] < 3) {
				//do nothing
			}else {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
