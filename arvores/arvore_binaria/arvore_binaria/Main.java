package arvore_binaria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				No n1 = new No(7);
				n1.inserir(15);
				n1.inserir(3);
				n1.inserir(21);
				n1.inserir(2);
				n1.inserir(9);
				n1.inserir(10);
				

				System.out.print("\nIn Orderm: ");
				n1.in_order();
				
				n1.remover(10);
				
				System.out.print("\nPre Order: ");
				n1.pre_order();
				System.out.print("\nIn Orderm: ");
				n1.in_order();
				
	}

}
