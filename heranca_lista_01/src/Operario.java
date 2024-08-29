package src;

import lombok.Data;

@Data
public class Operario extends Empregado {
	private double valorProducao;
	private double comissao;
	
	public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	public void calcularSalario() {
		double salarioFinal = (this.getSalarioBase() - (this.getSalarioBase() * (this.getImposto()/100))) + (valorProducao * (comissao / 100));
		
		System.out.println("Salário: R$" + salarioFinal);
	}
}
