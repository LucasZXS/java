package br.com.java;

public class Arraymultidimensional {

	public static void main(String[] args) {
		// a linha abaixo cria um array multidimensional(matriz).
		double[][] boletim = {{9,7,9,3},{4,5,8,6}};
		// recuperando a nota de portugues do 3o bimestre
		System.out.println("Média de português do 3o bim: " + boletim[1][2]);

	}

}
