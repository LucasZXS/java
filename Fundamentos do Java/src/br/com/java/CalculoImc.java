package br.com.java;

import java.util.Scanner;

public class CalculoImc {

	public static void main(String[] args) {
		// a linha abaixo cria variáveis numéricas de precisão
		// float e double são tipos primitivos numéricos reais (casas decimais)
		double peso,altura,imc;
		Scanner teclado = new Scanner(System.in);
		System.out.println("=========== Cálculo do Imc ===========");
		System.out.print("Digite o seu peso em kg: ");
		//entrada
		peso = teclado.nextDouble();
		System.out.print("Digite a sua altura em metros: ");
		altura = teclado.nextDouble();
		//processamento
		imc = peso / (altura * altura);
		System.out.println("IMC: " + imc);
		if (imc > 15 && imc < 16.9) {
			System.out.println("Peso muito abaixo");
		} else if (imc > 16.9 && imc < 18.4) {
            System.out.println("Abaixo do peso");
		} else if (imc > 18.4 && imc < 24.9) { 
			System.out.println("Peso Normal");
		} else if (imc > 24.9 && imc < 29.9) {
			System.out.println("Acima do peso");
		} else if (imc > 29.9 && imc < 34.9) {
			System.out.println("Obesidade Grau I");
		} else if (imc > 34.9 && imc < 40) {
			System.out.println("Obesidade Grau II");
		} else if (imc < 16) {
			System.out.println("Peso muito abaixo");
		} else {	
			System.out.println("Obesidade Grau III");
		}

	}

}
