package br.com.generation.exercicios01;

import java.util.Scanner;

public class equacoesLineares {

	public static void main(String[] args) {
		
		
		double a, b, c, d, e, f, x, y;
        Scanner leia = new Scanner(System.in);
        System.out.println("digite seus valores de A: ");
        a=leia.nextDouble();
        System.out.println("digite seus valores de B: ");
        b=leia.nextDouble();
        System.out.println("digite seus valores de C: ");
        c=leia.nextDouble();
        System.out.println("digite seus valores de D: ");
        d=leia.nextDouble();
        System.out.println("digite seus valores de E: ");
        e=leia.nextDouble();
        System.out.println("digite seus valores de F: ");
        f=leia.nextDouble();
        leia.close();
        x=((c*e)-(b*f)/(a*e)-(b*d));
        y=((a*f)-(c*d)/(a*e)-(b*d));
        System.out.println("seu valor de x é: "+x+" seu valor de y é: "+y);
        
        

	}

}
