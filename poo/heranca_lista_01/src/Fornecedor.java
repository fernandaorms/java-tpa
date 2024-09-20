package src;

import lombok.Data;

@Data
public class Fornecedor extends Pessoa {
	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
		super(nome, endereco, telefone);
		
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public double obterSaldo() {
		return valorCredito - valorDivida;
	}
}
