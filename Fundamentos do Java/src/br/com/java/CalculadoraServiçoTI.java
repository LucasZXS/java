package br.com.java;

import java.util.Scanner;

public class CalculadoraServi�oTI {

	public static void main(String[] args) {
		double valor,total,investimento,imposto,remuneracao, carga, custo;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculadora de Servi�os de TI");
		System.out.println("");
        System.out.print("Remunera��o Mensal: ");
        remuneracao = teclado.nextDouble();
        imposto = ((remuneracao / 100) * 30);
        investimento = ((remuneracao / 100)* 20);
        System.out.print("Adicione Custo Operacional: ");
        custo = teclado.nextDouble();
        total = (remuneracao + imposto + custo + investimento);
        System.out.print("Adicione a carga H�raria Mensal: ");
        carga = teclado.nextDouble();
        valor = total / carga;
        System.out.println(valor + " Valor da hora");
	}

}
