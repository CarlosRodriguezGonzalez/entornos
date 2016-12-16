package ejer;

import java.util.Scanner;

public class Hangman_Judge {

	public static void pintar(int x){
		x=6-x;
		switch(x){
		case 1:
			System.out.println("-------------------");
			System.out.println("  |      |");
		case 2:
			System.out.println("  |      o");
			System.out.println("  |    / | \\");
		case 3:
			System.out.println("  |      |");
			System.out.println("  |    /   \\");
		case 4:
			System.out.println("  |");
			System.out.println("-- -");
		case 5:
			System.out.println("|   |");
			System.out.println("     --------------");
		case 6:
			System.out.println("|                 |");
			System.out.println("-------------------");
		}
		
	}
	public static void main(String[] args) {
		/*System.out.println("-------------------");
		System.out.println("  |      |");
		System.out.println("  |      o");
		System.out.println("  |    / | \\");
		System.out.println("  |      |");
		System.out.println("  |    /   \\");
		System.out.println("  |");
		System.out.println("-- -");
		System.out.println("|   |");
		System.out.println("     --------------");
		System.out.println("|                 |");
		System.out.println("-------------------");
		
		for(int i=0;i<6;i++){
			pintar(i);
			System.out.println();
			System.out.println();
		}*/
		
		Scanner sc=new Scanner(System.in);
		String palabra=sc.nextLine();

	}

}
