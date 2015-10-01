package tp9;

public class Ventilateur {

	final int LENT = 1;
	final int MOYEN = 2;
	final int RAPIDE = 3;
	
	int vitess;
	boolean allume;
	double rayon;
	String couleur;
	
	
	
	public Ventilateur() {
		this.vitess = LENT;
		this.allume = false;
		this.rayon = 5;
		this.couleur = "bleu";
	}

	public int getVitess() {
		return vitess;
	}

	public void setVitess(int vitess) {
		this.vitess = vitess;
	}

	public boolean isAllume() {
		return allume;
	}

	public void setAllume(boolean allume) {
		this.allume = allume;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		String res="";
				if(allume)
					res= "Ventilateur [vitess=" + vitess + ", rayon=" + rayon + ", couleur=" + couleur + "]";
				else
					res= "Ventilateur [rayon=" + rayon + ", couleur=" + couleur + "   Le ventilateur est éteint]";
		return res;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ventilateur v = new Ventilateur();
		System.out.println(v.toString());
		v.setAllume(true);
		System.out.println(v.toString());
	}

	
}
