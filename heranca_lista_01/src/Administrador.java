package src;

import lombok.Data;

@Data
public class Administrador extends Empregado {
	private double ajudaDeCusto;
	
	public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public void calcularSalario() {
		double salarioFinal = (this.getSalarioBase() - (this.getSalarioBase() * (this.getImposto()/100))) + ajudaDeCusto;
		
		System.out.println("Salário: R$" + salarioFinal);
	}
}
