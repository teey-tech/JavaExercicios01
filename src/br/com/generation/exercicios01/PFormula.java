package br.com.generation.exercicios01;

import java.util.Scanner;

public class PFormula {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
        double x1,x2, y1, y2, d;
        System.out.println("Digite o valor de x1: ");
        x1=leia.nextDouble();
        System.out.println("Digite o valor de x2: ");
        x2=leia.nextDouble();
        System.out.println("Digite o valor de y1: ");
        y1=leia.nextDouble();
        System.out.println("Digite o valor de y2: ");
        y2=leia.nextDouble();
        leia.close();
        d=Math.sqrt(((Math.pow(x2-x1, 2))+(Math.pow(y2-y1, 2))));
        System.out.println("A distancia entre eles �: "+d);

	}

}
