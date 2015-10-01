package tp9;

import java.text.DecimalFormat;

public class Bourse {
	String symbole;
	String nom;
	double prixFermeture;
	double prixCourant;
	
	
	
	
	public Bourse(String symbole, String nom) {
		this.symbole = symbole;
		this.nom = nom;
	}

	
	public double getPourcentChange(){
		DecimalFormat df = new DecimalFormat ( ) ; 
		df.setMaximumFractionDigits(2); 
		df.setDecimalSeparatorAlwaysShown(false); 
		return Double.parseDouble(df.format((this.prixCourant-this.prixFermeture)/this.prixFermeture*100).replace(',', '.'));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bourse boobs = new Bourse("ORCL", "Oracle");
		boobs.prixCourant = 34.35;
		boobs.prixFermeture = 34.5;
		System.out.println(boobs.getPourcentChange());
	}

}
