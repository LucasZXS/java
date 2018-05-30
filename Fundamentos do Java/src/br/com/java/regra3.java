package br.com.java;

import java.util.Scanner;

public class regra3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       double x,y,valor;
       Scanner teclado = new Scanner(System.in);
       System.out.println("regra de 3");
       System.out.println("x % de Y = Valor");
       System.out.println("");
       //entrada
       System.out.print("Digite o Valor de X: ");
       x = teclado.nextDouble();
       System.out.print("Digite o valor de Y: ");
       y = teclado.nextDouble();
       //processamento
       valor = (x * y) / 100;
       //saída
       //concatenando(unindo) variáveis com textos
       System.out.println(x + "% de " + y + " = " + valor   );
       
      
       
       
	}

}
