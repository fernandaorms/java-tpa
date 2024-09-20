package src;

public class Main {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Fernanda", "Rua ABC", "(28)99999-9999");
		
		System.out.println(p1.toString());
		
		System.out.println("\n");
		
		Fornecedor f1 = new Fornecedor("Fernanda", "Rua ABC", "(28)99999-9999", 12000, 5000);
		
		System.out.println(f1.toString());
		System.out.println("Saldo: R$" + f1.obterSaldo());

		System.out.println("\n");
		
		Empregado e1 = new Empregado("Fernanda", "Rua ABC", "(28)99999-9999", 2, 100, 5);
		
		System.out.println(e1.toString());
		e1.calcularSalario();
		
		System.out.println("\n");
		
		Administrador a1 = new Administrador("Fernanda", "Rua ABC", "(28)99999-9999", 2, 100, 5, 20);
		
		System.out.println(a1.toString());
		a1.calcularSalario();
		
		System.out.println("\n");
		
		Operario o1 = new Operario("Fernanda", "Rua ABC", "(28)99999-9999", 2, 100, 5, 100, 12);
		
		System.out.println(o1.toString());
		o1.calcularSalario();
		
		System.out.println("\n");
		
		Vendedor v1 = new Vendedor("Fernanda", "Rua ABC", "(28)99999-9999", 2, 100, 5, 100, 3);
		
		System.out.println(v1.toString());
		v1.calcularSalario();
	}

}
