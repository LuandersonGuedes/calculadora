package Calculadora;

import java.util.Scanner;

public class Calculadora1 {

	public static void main(String[] args) {
	
		
		Scanner entrada = new Scanner(System.in);

		double a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = entrada.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		b = entrada.nextInt();
		
		double soma = soma(a,b);
		
		double subtracao = subtracao(a,b);
		
		double multiplicacao = multiplicacao(a,b);
		
		double divisao = divisao(a,b);
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplicacao);
		System.out.println(divisao);
		
		entrada.close();
	}

	public static double soma( double a, double b) {
		return a + b;
			
	}
	
	public static double subtracao( double a, double b) {
		return a - b;
	
}
	
	public static double multiplicacao( double a, double b) {
		return a * b;
		
	}
	
	public static double divisao( double a, double b) {
		return a / b;
		
	}
	
}