package src;

import lombok.Data;

@Data
public class Empregado extends Pessoa {
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
		super(nome, endereco, telefone);
		
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	public void calcularSalario() {
		double salarioFinal = salarioBase - (salarioBase * (imposto/100));
		
		System.out.println("Salário: R$" + salarioFinal);
	}
}
