package br.com.java;

import java.util.Scanner;

public class lucro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x,y,lucro,porcentagem;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Lucro da venda");
		System.out.println("x% de valor = lucro");
		System.out.println();
		//entrada
		System.out.print("Digite o valor da Compra: ");
		x = teclado.nextDouble();
		System.out.print("Digite o valor da venda: ");
		y = teclado.nextDouble();
		//processamento
		lucro = (y - x);
		porcentagem = (lucro * 100) / x;
		//saída
		System.out.println(porcentagem + "%de lucro");
		
		
  
	}

}
