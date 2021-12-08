package br.com.generation.exercicios01;

import java.util.Scanner;

public class diasEmIdades {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); 
		
		int  dias;
		
		System.out.println("Informe quantos dias você viveu: ");
		dias = leia.nextInt();
		
		System.out.println("");
		System.out.println("Você possui: "+(dias/365)+" anos,"+((dias%365)/30)+" meses e "+((dias%365)-((dias%365)/30)+" dias"));
		leia.close();
	}

}
