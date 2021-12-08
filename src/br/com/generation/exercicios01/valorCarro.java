package br.com.generation.exercicios01;

import java.util.Scanner;

public class valorCarro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double valorCarro,custoFabrica;
		
		System.out.println("Digite o valor da fabrica: ");
		custoFabrica=leia.nextDouble();
		
		valorCarro=custoFabrica+(custoFabrica*0.28)+(custoFabrica*0.45);
		
		System.out.println("O valor do carro é: "+valorCarro);
		
		leia.close();
		
	}

}
