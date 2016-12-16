package ejer;

import java.util.Scanner;

public class Kindergarten_Counting_Game {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String cadena=sc.nextLine();
		char letras[]=cadena.toCharArray();
		int total=1;
		
		for(int i=0;i<letras.length;i++){
			if(letras[i]==' '){
				total++;
			}
		}
		System.out.println(total);
		
		

	}

}
