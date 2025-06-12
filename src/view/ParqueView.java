package view;

import java.util.Scanner;

public class ParqueView {
	
	private final Scanner scanner = new Scanner(System.in);
	
	public int solicitarInt(String mensagem) {
		System.out.print(mensagem);
		return scanner.nextInt();
	}
	
	public double solicitarDouble(String mensagem) {
		System.out.print(mensagem);
		return scanner.nextDouble();
	}
	
	public void exibirMensagem(String mensagem) {
		System.out.print(mensagem);
		
	}
	
	public void closeScanner() {
		scanner.close();
	}
	
}
