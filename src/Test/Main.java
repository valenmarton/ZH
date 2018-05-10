package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import galaxis.Bolygo;

public class Main {

		public enum BOLYGO {
			MERKUR, VENUSZ, FOLD
		}
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Bolygo [] bolygoArray = new Bolygo [3];
		bolygoArray[0] = new Bolygo("Merkur", 0.24f, 4878);
		bolygoArray[1] = new Bolygo("Vénusz", 0.62f, 12104);
		bolygoArray[2] = new Bolygo("Föld", 1f, 12756);
		
		
		
		int minAtmero = 0;
		for (int i = 0; i < bolygoArray.length; i++) {
			if(bolygoArray[i].getAtmero() < bolygoArray[minAtmero].getAtmero()) {
				minAtmero = i;
			}
		}
		int counter = 0;
		for (int i = 0; i< bolygoArray.length; i++) {
			if(bolygoArray[i].getKeringesiIdo() < bolygoArray[2].getKeringesiIdo()) {
				counter++;
			}
		}
		Scanner input = new Scanner (System.in);
		
		/*for (int i = 0; i < 3; i++) {
			System.out.println("Add meg a tömeget: ");
			int tomeg = input.nextInt();
			System.out.println("Add meg az indexet (0-2): ");
			int index = input.nextInt();
			System.out.println(bolygoArray[i].convertTomegToFloat(tomeg, index));
		}*/
		
		for (Bolygo bolygo : bolygoArray) {
			System.out.println(bolygo.toString());
		}
		
		BufferedReader beolvas= new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0; i < 3; i++) {
		System.out.println("Add meg a tömeget: ");
		int tomeg = Integer.parseInt(beolvas.readLine());
		System.out.println("Add meg az indexet: ");
		int index = Integer.parseInt(beolvas.readLine());
		System.out.println(bolygoArray[i].convertTomegToFloat(tomeg, index));
		}
		beolvas.close();
		
		
		
		
		
	}

}
