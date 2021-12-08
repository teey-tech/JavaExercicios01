package br.com.generation.exercicios01;

import java.util.Scanner;

public class IdadeEmDias {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); 
		
		int idade, meses, anos, conta;
		
		System.out.println("Escreva a sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Escreva o mês que você nasceu: ");
		meses = leia.nextInt();
		
		System.out.println("Escreva o ano que você nasceu: ");
		anos = leia.nextInt();
		
		
		conta = (anos*12)+(meses*30)+idade;
		
		System.out.println("Escreva o ano que você nasceu: "+conta);
		leia.close();
	}

}
