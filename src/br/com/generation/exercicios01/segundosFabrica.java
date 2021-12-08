package br.com.generation.exercicios01;

import java.util.Scanner;

public class segundosFabrica {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); 
		
		int  segundos, horas, minutos, segundos2;
		
		
		System.out.println("Informe o tempo em segundos: ");
		segundos = leia.nextInt();
		
		
		horas = segundos/3600;
		minutos = (segundos%60)/60;
		segundos2 = (segundos%3600)-(60*minutos);
		
		System.out.println("Foram "+horas+" horas "+ minutos +" minutos "+ segundos2 +" segundos");
		leia.close();
	}

}
