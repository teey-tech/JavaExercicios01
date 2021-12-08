package br.com.generation.exercicios01;

import java.util.Scanner;

public class mediaPonderada {

	
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double nota1, nota2, nota3, peso, soma, resultado;
        
        System.out.println("Digite o Valor da Primeira Nota: ");
        nota1=leia.nextInt();
        
        System.out.println("Digite o Valor da Segunda Nota: ");
        nota2=leia.nextInt();
        
        System.out.println("Digite o Valor da Terceira Nota: ");
        nota3=leia.nextInt();
        
        
        
        soma = (nota1*2.3) + (nota2*5.0) + (nota3*5.0);
        
        peso = 2.3+5.0+5.0;
        
        
        resultado =  soma / peso ;
        
        System.out.println("Sua média é de: "+ resultado);
        leia.close();
		
	}
}
