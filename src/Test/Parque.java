package Test;

public class Parque {
	private int CapacidadeMaxima;
	private double altMin;
	private double altMax;
	private int qtdPessoas;
	
	public Parque (int CapacidadeMaxima, double altMax, double altMin) {
		this.altMax = altMax;
		this.altMin = altMin;
		this.CapacidadeMaxima = CapacidadeMaxima;
		this.qtdPessoas = 0;
	}
	
	public boolean PodeEntrar(double altura) {
		return qtdPessoas <CapacidadeMaxima && altura>= altMin && altura <= altMax;
	}
	public void AddPessoas() {
		qtdPessoas++;
	}
	public void RemovPessoas() {
		if(qtdPessoas > 0) {
			qtdPessoas--;
		}
	}
	public int getQtdPessoas() {
		return qtdPessoas;
	}
	public int getCapMax() {
		return CapacidadeMaxima;
	}
	
	
}
