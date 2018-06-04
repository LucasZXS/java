package br.com.java;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		double area, raio, pi;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Calcular a área do círculo");
		System.out.println();
		//Entrada
		System.out.print("Digite o valor do raio: ");
		raio = teclado.nextDouble();
		pi = (3.14);
		//Processamento
		area = pi * (raio * raio);
		//Saída
		System.out.println("Área Do Circulo: " + area);
		
		
		
		
		
		
		

	}

}
