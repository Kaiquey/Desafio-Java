package Test;


import java.util.Scanner;
import java.util.Arrays;

public class Displayer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] num = new int [4];
		System.out.println("Digite um número: ");
		for(int i=0; i < num.length; i++) {System.out.print("Número " + (i + 1) + ": ");num[i] = scanner.nextInt();}
		Arrays.sort(num);
		System.out.println("Os números alinhados: ");
		for(int number : num) {System.out.println(number);}
		System.out.println("----");
		System.out.println("----");
		System.out.println("Ordem Decrescente dos número: ");
		for(int i = 4 - 1; i >= 0; i--) {System.out.println(num[i]);}
		scanner.close();
		
	}
	
}
