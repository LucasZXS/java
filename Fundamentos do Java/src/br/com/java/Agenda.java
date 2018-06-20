package br.com.java;

public class Agenda {

	public static void main(String[] args) {
		// Agenda
		String[][] agenda = { { "Bill Gates", "1111-1111", "bill@outlook.com" },
				{ "Linus Torvalds", "2222-2222", "linus@gmail.com" },
				{ "Steve Jobs", "3333-3333", "steve@icloud.com" } };
		// Recuperar email linus
		//System.out.println(" Email: " + agenda[1][2]);
		//agenda[0][1] = "9999-9999";
		//System.out.println("Número Bill Gates: " + agenda[0][1]);
		for (int i = 0; i < agenda.length; i++) {
			System.out.println("________________________________");
			for(int j = 0; j < agenda.length; j++) {
				System.out.println(agenda[i][j]);
			}
		}
	}

}
