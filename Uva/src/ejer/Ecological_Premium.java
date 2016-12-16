package ejer;

import java.util.Scanner;

public class Ecological_Premium {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int casos;
		int farmer=2;
		int square=1, animals=1, prima=1;
		int total=0;
		
		casos=sc.nextInt();
		for(int i=0;i<casos;i++){
			farmer=sc.nextInt();
			for (int j=0;j<farmer;j++){
				square=sc.nextInt();
				animals=sc.nextInt();
				prima=sc.nextInt();
				total=total+prima*square;
			}
			System.out.println(total);
		}

	}

}
