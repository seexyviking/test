package tp9;

import java.util.Calendar;
import java.util.Random;

public class Chronomètre {

	private long tempsDepart ;
	private long tempsArret ;
	
	public Chronomètre(){
		Calendar c = Calendar.getInstance();
		
		this.tempsDepart= System.currentTimeMillis() ;
	}
	
	public long getTempsDepart() {
		return tempsDepart;
	}

	public long getTempsArret() {
		return tempsArret;
	}
	
	public void depart(){
		this.tempsDepart= System.currentTimeMillis() ;
	}
	
	public void arret(){
		this.tempsArret= System.currentTimeMillis() ;
	}
	
	public long getLapsTemps(){
		return this.tempsArret-this.tempsDepart ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tab[] = new int[100000] ;
		Chronomètre c = new Chronomètre();
		Random r = new Random();
		for(int k = 0 ; k<100000 ; k++){
			tab[k] = r.nextInt(20000);
		}
		int small ; 
		int tmp ; 
		int pos=0 ; 
		c.depart();
		for(int i = 0 ; i<100000 ; i++){
			small = tab[i];
			for(int j = i ; j<100000 ; j++){
				if(tab[j]<small){ small = tab[j]; pos=j ;}
			}
			tmp = tab[i];
			tab[i]=small ;
			tab[pos] = tmp ;
		}
		c.arret();
		System.out.println(c.getLapsTemps());
		/*for(int l = 0 ; l<100 ; l++){
			System.out.print(tab[l]+" ");
		}*/
	}
}
