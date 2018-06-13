package br.com.java;

import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {

	public static void main(String[] args) {
		int player1 = 0;
		int player2 = 0;
		int jogador;
		char escolha = 's';
		Scanner teclado = new Scanner(System.in);
		System.out.println("JoKenPo");
		System.out.println("");
		do {
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		System.out.print("Digite a sua opção: ");
		jogador = teclado.nextInt();
		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Jogador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Jogador escolheu TESOURA");
			break;
		default:
			System.out.println("Opção Inválida");
			break;
		}
		//Lógica do Computador
		//Criar uma Variável que recebe um valor aleatório (1, 2 e 3)
		
		//logica para determinar o vencedor
		Random opcao = new Random();
        int computador = opcao.nextInt(3) + 1;
        switch (computador) {
        case 1:
			System.out.println("Computador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Computador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Computador escolheu TESOURA");
			break;
		} 
        if ((jogador ==1 && computador ==3) || (jogador ==2 && computador ==1) || (jogador ==3 && computador ==2)) {
			System.out.println("Você Venceu");
			player1++;
			System.out.println("Placar: " + player1 + "x" + player2);
		} else if ((jogador ==1 && computador ==2) || (jogador ==2 && computador ==3) || (jogador ==3 && computador ==1)) {
            System.out.println("Computador Venceu");
            player2++;
            System.out.println("Placar: " + player1 + "x" + player2);
		} else if ((jogador ==1 && computador ==1) || (jogador ==2 && computador ==2) || (jogador ==3 && computador ==3)) {
			System.out.println("Empate");
		} else {
			System.out.println("Opção Inválida, Digite 1,2 ou 3");
		}
		System.out.println("deseja jogar novamente (s/n): ");
		escolha = teclado.next().charAt(0);
		}while (escolha == 's');
		}
	}


