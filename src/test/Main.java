package test;

import java.util.Scanner;

import models.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Avion avion = new Avion();
		EtatAvion etat = avion.getEtat();
		int a = 0;
		System.out.println("TP STATE PATTERN");
		do {
		System.out.println("**************************************");
		avion.fait();
		System.out.println("Pour que l'avion sort du garage entrez 1");
		System.out.println("Pour que l'avion entre au garage entrez 2");
		System.out.println("Pour que l'avion decolle du garage entrez 3");
		System.out.println("Pour que l'avion atterrit du garage entrez 4");
		System.out.println("Pour arreter entrez 0");
		System.out.print("Votre choix est : ");
		a = sc.nextInt();
		System.out.println("**************************************");
		
		switch(a) {
			case 1:
				avion.sortirDuGarage();
				break;
			case 2:
				avion.entrerAuGarage();
				break;
			case 3:
				avion.decoller();
				break;
			case 4:
				avion.atterrir();
				break;
			default:
				a=0;
				break;
		}
		}while(a!=0);
	}

}
