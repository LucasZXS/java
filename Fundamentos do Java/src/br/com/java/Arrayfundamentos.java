package br.com.java;

public class Arrayfundamentos {

	public static void main(String[] args) {
		String time1 = "Corinthians";
		String time2 = "Palmeiras";
		String time3 = "Santos";
		String time4 = "S�o Paulo";
		System.out.println("Fundamentos do array");
		System.out.println("Exemplo 1: Sem array");
		System.out.println("time: " + time3);
		//  a linha abaixo cria um vetor simples
		String[] times = {"Corinthians","Palmeiras","Santos","S�o Paulo"};
		System.out.println("Exemplo 2: com array");
		// a linha abaixo recupera o conte�do do indice [0] do array
		System.out.println("time: " + times[2]);
		// a linha abaixo modifica o conte�so do indice [2] do array
		times[2] = "Flamengo";
		System.out.println("Exemplo 3: Modificando um array");
		System.out.println("Time: " + times[2]);
		// obtendo o tamanho total do array
		System.out.println("Total de times: " + times.length);
				

	}

}
