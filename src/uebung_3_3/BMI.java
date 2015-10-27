package uebung_3_3;

import java.text.DecimalFormat;

public class BMI {

	public static void main(String[] args) {
		double groesse = 1.83;
		double gewicht = 75;
		int alter = 19;
		boolean maennlich = true;
		double bmi = gewicht/(groesse*groesse);
		
		DecimalFormat f = new DecimalFormat("#0.000");
		
		System.out.println("Größe = " + groesse + "m");
		System.out.println("Geweicht = " + gewicht + " kg");
		System.out.println("Alter = " + alter + " Jahre");
		
		if (maennlich == true) {
			System.out.println("Geschlecht = männlich");}
		else {
			System.out.println("Geschlecht = weiblich");}
		
		System.out.println("BMI = "+f.format(bmi));
		
		if (maennlich) {
			bmi = bmi-1;}
		
		if (alter <= 24) {
			if (bmi < 19) {
				System.out.println("Untergewichtig.");
			} else if (bmi <= 24) {
				System.out.println("Normalgewichtig.");
			} else {
				System.out.println("Uebergewichtig.");
			}
		} else if (alter < 35) {
			if (bmi < 20) {
				System.out.println("Untergewichtig.");
			} else if (bmi <= 25) {
				System.out.println("Normalgewichtig.");
			} else {
				System.out.println("Uebergewichtig.");
			}
		} else if (alter < 45) {
			if (bmi < 21) {
				System.out.println("Untergewichtig.");
			} else if (bmi <= 26) {
				System.out.println("Normalgewichtig.");
			} else {
				System.out.println("Uebergewichtig.");
			}
		} else if (alter < 55) {
			if (bmi < 22) {
				System.out.println("Untergewichtig.");
			} else if (bmi <= 27) {
				System.out.println("Normalgewichtig.");
			} else {
				System.out.println("Uebergewichtig.");
			}
		} else if (alter < 65) {
			if (bmi < 23) {
				System.out.println("Untergewichtig.");
			} else if (bmi <= 28) {
				System.out.println("Normalgewichtig.");
			} else {
				System.out.println("Uebergewichtig.");
			}
		} else // Alter >= 65
		{
			if (bmi < 24) {
				System.out.println("Untergewichtig.");
			} else if (bmi <= 29) {
				System.out.println("Normalgewichtig.");
			} else {
				System.out.println("Uebergewichtig.");
			}
		}
	}

}

/*# Kapitel 3 Übung 3 ("Body-Mass-Index") 

- Schreiben Sie ein Programm zur Berechnung des Body-Mass-Index (Körpermassenzahl) inklusive Beurteilung desselben.
- Der BMI wird berechnet durch das Gewicht in Kilogramm dividiert durch das Quadrat der  Körpergröße in Meter.
- Die untenstehende Tabelle gibt in Abhängigkeit des Geschlechts und des Alters den Bodymassindex für Normalgewicht wieder:*/
