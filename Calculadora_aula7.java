package es_fun;

import java.util.Scanner;

public class Calculadora_aula7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculadora");
		System.out.println("Qual operação deseja?: ");
		System.out.print("[1] adição "
						+ "[2] subtração "
						+ "[3] divisão "
						+ "[4] multiplicação "
						+ "Digite: ");
		int x = teclado.nextInt();	
		
		int adi = 0, sub = 0, div = 0, multi = 0;
		
		switch (x) {
		
		case 1:
			System.out.print("Valor um: ");
			int f = teclado.nextInt();
			System.out.print("Valor dois: ");
			int g = teclado.nextInt();
			int finall1 = adi(f, g);
			System.out.print("Resultado: " + finall1);
			break;
		
		case 2:
			System.out.print("Valor um: ");
			int z = teclado.nextInt();
			System.out.print("Valor dois: ");
			int y = teclado.nextInt();
			int finall = sub(z, y);
			System.out.print("Resultado: " + finall);
			break;
			
		case 3: 
			System.out.print("Valor um: ");
			int h = teclado.nextInt();
			System.out.print("Valor dois: ");
			int i = teclado.nextInt();
			int finall2 = div(h, i);
			System.out.print("Resultado: " + finall2);
			break;
			
		case 4: 
			System.out.print("Valor um: ");
			int j = teclado.nextInt();
			System.out.print("Valor dois: ");
			int k = teclado.nextInt();
			int finall3 = multi(j, k);
			System.out.print("Resultado: " + finall3);
			break;
		}
	}
	
	
	static int sub (int z, int y) {
		int sub;
		if (z > y) {
		int c = z - y;
		sub = c;
		}
		else {
		int d = z - y;
		sub = d;
		}
		return sub;
		// função que faz a subtração
	}


	static int adi (int f, int g) {
		int adi;
		if (f > g) {
			int c1 = f + g;
			adi = c1;
		}
		else {
			int d1 = f + g;
			adi = d1;
		}
		return adi;
	// função que faz a adição
}
	static int div (int h, int i) {
		int div;
		if (h > i) {
			int c2 = h / i;
			div = c2;
		}
		else {
			int d2 = h / i;
			div = d2;
		}
		return div;
	// função que faz a divisão
}

	static int multi (int m, int n) {
		int multi;
		if (m > n) {
			int c3 = m * n;
			multi = c3;
		}
		else {
			int d3 = m * n;
			multi = d3;
		}
		return multi;
		// função que faz a multiplicação
}
}


