package Capitulo3;

import java.util.Scanner;

import entities.Triangulo;


public class Exemplo {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Triangulo x, y;
	x = new Triangulo();
	y = new Triangulo();
	
	System.out.println("Digite os lados do tri�ngulo X: ");
	x.a = sc.nextDouble();
	x.b = sc.nextDouble();
	x.c = sc.nextDouble();
	

	System.out.println("Digite os lados do tri�ngulo Y: ");
	y.a = sc.nextDouble();
	y.b = sc.nextDouble();
	y.c = sc.nextDouble();
	
	double areaX = x.area();
	double areaY = y.area();
	System.out.println("�rea do Tri�ngulo X: " + areaX);
	System.out.println("�rea do Tri�ngulo Y: " + areaY);
	
	if (areaX > areaY) {
		System.out.println("X � o Tri�ngulo maior");
	}
	
	else  {
		System.out.println("Y � o Tri�ngulo maior");
	}
	sc.close();
	}

}
