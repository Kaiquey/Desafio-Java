package Controller;

import Test.Parque;
import view.ParqueView;

public class ParqueController {
	private final Parque parque;
	private final ParqueView view;
	
	public ParqueController(ParqueView view) {
		this.view = view;
		
		int CapacidadeMaxima = view.solicitarInt("Qual a capacidade de pessoas: ");
		double altMax = view.solicitarDouble("Digite a altura máxima permitida: ");
		double altMin = view.solicitarDouble("Digite a altura mínima permitida: ");
		
		this.parque = new Parque(CapacidadeMaxima, altMax, altMin);
	}
	
	public void start() {
		while(true) {
			
			int opcao = view.solicitarInt("\n1 = Adicionar pessoa \n2 - Remover Pessoa \n0 - Sair do programa \nFaça a Escolha: ");
			
			switch(opcao) {
			case 0:
				view.exibirMensagem("Encerrando o Sistema. . .");
				view.closeScanner();
				return;
				
			case 1:
				double altura = view.solicitarDouble("Digite a altura da pessoa (Ex: 1,1) por gentileza ou senão 0 para sair: ");
				
				if(altura==0) break;
				
				if(parque.PodeEntrar(altura)) {
					parque.AddPessoas();
					view.exibirMensagem("Pode entrar! ");
				}else {
					view.exibirMensagem("Entrada não permitida");	
				}
				break;
				
			case 2:
				parque.RemovPessoas();
				view.exibirMensagem("Uma pessoa saiu do parque.");
				view.exibirMensagem("Temos o total de pessoas igual a " + parque.getQtdPessoas());
				break;
				
			default:
				view.exibirMensagem("Você não selecionou uma opção válida.");
			}
			
			
			if(parque.getQtdPessoas() == parque.getCapMax()) {
				view.exibirMensagem("Atingimos o limite máximo de pessoas, obrigado e tente mais tarde!");
				break;
			}
			
			view.closeScanner();
		}
	}
	
}
