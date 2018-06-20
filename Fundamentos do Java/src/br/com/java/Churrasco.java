package br.com.java;
/*
 * Lucas Soares Vieira
 * Fabrício Ferreira de Oliveira
 */

import java.util.Scanner;

public class Churrasco {

	public static void main(String[] args) {
		// Variáveis
		int homens, mulheres, criancas;
		double homemd = 16.08;
		double criancad = 5.06;
		double homemg = 0.3;
		double criancag = 0.1;
		double pessoa,total,refril,refrid,latinhas,cervejad,kg,dinheiro,carne,cerveja,refri;
		Scanner teclado = new Scanner(System.in);
		//Entrada
		System.out.println("===== CHURRASCOLADORA =====");
		System.out.print("Quantidade de Homens: ");
		homens = teclado.nextInt();
		System.out.print("Quantidade de Mulheres: ");
		mulheres = teclado.nextInt();
		System.out.print("Quantidade de Crianças: ");
		criancas = teclado.nextInt();
		System.out.print("Preço médio do Kg de Carne: ");
		carne = teclado.nextDouble();
		System.out.print("Preço médio da lata de cerveja: ");
		cerveja = teclado.nextDouble();
		System.out.print("Preço médio da lata de refri: ");
		refri = teclado.nextDouble();
		//Processamento
		//Carne
		dinheiro = (homens * homemd) + (mulheres * homemd) + (criancas * criancad);
		kg = (homens * homemg) + (mulheres * homemg) + (criancas * criancag);
		//cerveja
		latinhas = (homens * 12) + (mulheres * 4);
		cervejad = (homens * 12 * cerveja) + (mulheres * 4 * cerveja);
		//Refri
		refrid = (mulheres * 2 * refri) + (criancas * 2 *refri);
		refril = (mulheres * 2) + (criancas * 2);
		total = dinheiro + cervejad + refrid;
		pessoa = total / (homens + mulheres + criancas);
		//Saída
		System.out.println("");
		System.out.println("________________________________");
		System.out.println("Lista de Compras");
		System.out.println("Quantidade Total de carne R$: " + dinheiro + " Kg: " + kg);
		System.out.println("Quantidade Total de Cerveja R$: " + cervejad + " Latas: " + latinhas);
		System.out.println("Quantidade Total de refri R$: " + refrid + " Latas: " + refril);
		System.out.println("");
		System.out.println("________________________________");
		System.out.println("Valor Total do churras R$: " + total);
		System.out.println("Valor Total por pessoa R$:  " + pessoa);
		

	}

}
