package br.com.java;

import java.util.Scanner;

public class CalculadoraServiçoTI {

	public static void main(String[] args) {
		double valor,total,investimento,imposto,remuneracao, carga, custo;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculadora de Serviços de TI");
		System.out.println("");
        System.out.print("Remuneração Mensal: ");
        remuneracao = teclado.nextDouble();
        imposto = ((remuneracao / 100) * 30);
        investimento = ((remuneracao / 100)* 20);
        System.out.print("Adicione Custo Operacional: ");
        custo = teclado.nextDouble();
        total = (remuneracao + imposto + custo + investimento);
        System.out.print("Adicione a carga Hóraria Mensal: ");
        carga = teclado.nextDouble();
        valor = total / carga;
        System.out.println(valor + " Valor da hora");
	}

}
