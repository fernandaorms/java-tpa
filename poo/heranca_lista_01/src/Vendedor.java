package src;

import lombok.Data;

@Data
public class Vendedor extends Empregado {
	private double valorVendas;
	private double comissao;
	
	public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	
	public void calcularSalario() {
		double salarioFinal = (this.getSalarioBase() - (this.getSalarioBase() * (this.getImposto()/100))) + (valorVendas * (comissao / 100));
		
		System.out.println("Salário: R$" + salarioFinal);
	}
}
