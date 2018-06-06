package br.com.java;

import java.util.Scanner;

public class VerificaMaioridade {

	public static void main(String[] args) {
		String nome;
		int idade;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		nome = teclado.nextLine();
		System.out.println("Digite a sua idade: ");
		idade = teclado.nextInt();
		System.out.println("");
		System.out.println("_________________________");
		System.out.println("nome: " + nome);
        System.out.println("Idade: " + idade);	
        if (idade < 18) {
			System.out.println("Menor de Idade");
		} else {
            System.out.println("Maior de Idade");
		}
		

	}

}
