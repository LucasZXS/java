package br.com.java;

import java.util.Scanner;

public class VerificaObrigatoriedadeVotar {

	public static void main(String[] args) {
		int idade;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Verifica obrigatoriedade de votar");
		System.out.print("Digite a sua idade: ");
		idade = teclado.nextInt();
		/*critérios
		 * Menor que 16 anos - Proibido votar
		 * Entre 18 e 70 - Obrigatorio votar
		 * 16, 17 ou acima de 70 - voto facultativo
		 */
		if (idade < 16) {
			System.out.println("Proibido votar");
		} else if (idade == 16 || idade == 17 || idade > 70){
			System.out.println("Voto Facultativo");
		} else {	
            System.out.println("Voto Obrigatório");
		}
		

	}

}
