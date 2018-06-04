package br.com.java;

import java.util.Scanner;

public class ConversaoRealDolar {

	public static void main(String[] args) {
		double dolar, real,conversao;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Converter Dolar para real");
		System.out.println();
		//entrada
		System.out.print("Digite o valor em Dolar: ");
		dolar = teclado.nextDouble();
		real = (3.76);
		//Processamento
		conversao = dolar * real;
		//Saída
		System.out.println(conversao + " Em Reais");
		
		
		
		

	}

}
