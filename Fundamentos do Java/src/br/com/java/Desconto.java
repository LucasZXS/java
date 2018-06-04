package br.com.java;

import java.util.Scanner;

public class Desconto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double troco,x,y,desconto,total,valor;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Desconto do Valor");
		System.out.println("x% de valor = desconto");
		System.out.println();
		//Entrada
		System.out.print("Digite o valor do Produto: ");
		x = teclado.nextDouble();
		System.out.print("Digite o Valor do Desconto: ");
		y = teclado.nextDouble();
		//processamento
		desconto = (y * x) / 100;
		total = (x - desconto);
		//saída
		System.out.print("Total com desconto: " + total);
		System.out.println();
		System.out.print("Dinheiro Entrege: ");
		valor = teclado.nextDouble();
		troco = (valor - total);
		System.out.println("Troco: " + troco);
		System.out.println();
		
		
		
		
		
			
		
		

	}

}
