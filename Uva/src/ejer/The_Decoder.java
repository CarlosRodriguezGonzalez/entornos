package ejer;

import java.util.Scanner;

public class The_Decoder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String cadena=sc.nextLine();
		char letras[]=cadena.toCharArray();
		
		
		for(int i=0;i<letras.length;i++){
			letras[i]=(char) (letras[i]-7);
			System.out.print(letras[i]);
		}
		
		
		

	}

}
