package tp9;

import java.util.Scanner;

public class EquationSecondDegre {

	double a;
	double b;
	double c;
	
	
	public EquationSecondDegre(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}


	public double getB() {
		return b;
	}


	public double getC() {
		return c;
	}


	public double getDiscriminant(){
		return this.b*this.b-4*this.a*this.c;
	}

	public double getRoot1(){
		if(getDiscriminant()>=0)
			return (-this.b -Math.sqrt(getDiscriminant()))/(2*this.a);
		else
			return 0;
		
	}
	
	public double getRoot2(){
		if(getDiscriminant()>=0)
			return (-this.b +Math.sqrt(getDiscriminant()))/(2*this.a);
		else
			return 0;
	}
	
	public double getRoot(){
		return -this.b/2*this.a;
	}
	
	public void calculEquation(){
		if(getDiscriminant()==0)
			System.out.println(getRoot());
		else if(getDiscriminant()>0){
			System.out.println(getRoot1());
			System.out.println(getRoot2());
		}
		else
			System.out.println("L'équation n'a pas de racines");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez la valeur de a :");
		double a = sc.nextDouble();
		System.out.println("Entrez la valeur de b :");
		double b = sc.nextDouble();
		System.out.println("Entrez la valeur de c :");
		double c = sc.nextDouble();
		
		EquationSecondDegre eq = new EquationSecondDegre(a,b,c);
		eq.calculEquation();
		
		
	}

}
