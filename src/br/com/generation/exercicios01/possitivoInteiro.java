package br.com.generation.exercicios01;

import java.util.Scanner;

public class possitivoInteiro {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
        double d, a, b, c, r,s;
        
        System.out.println("Digite o Valor de A: ");
        a=leia.nextInt();
        
        System.out.println("Digite o Valor de B: ");
        b=leia.nextInt();
        
        System.out.println("Digite o Valor de C: ");
        c=leia.nextInt();
        
        leia.close();
        
        if(a>=0 && b>=0 && c>=0) {
            r=Math.pow(a, 2)+Math.pow(b, 2);
            s=Math.pow(c, 2)+Math.pow(b, 2);
            d=(r+s)/2;
            System.out.println("o valor da sua conta é: "+d);
            }
        else {
            System.out.println("você digitou numeros invalidos, tente novamente");
        }
		
		
		
	}
}
