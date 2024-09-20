package binaria;

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
		
		// Print Inserir
		/*
		System.out.println("Raiz: " + n1.info + 
				"\nNó Esquerda: " + n1.noEsquerda.info + 
				"\n\tNó Esquerda: " + n1.noEsquerda.noEsquerda.info + 
				"\nNó Direita: " + n1.noDireita.info + 
				"\n\tNó Esquerda: " + n1.noDireita.noEsquerda.info + 
				"\n\t\tNó Direita: " + n1.noDireita.noEsquerda.noDireita.info + 
				"\n\tNó Direita: " + n1.noDireita.noDireita.info);
		*/
		
		n1.remover(10);
		
		// Print Remover
		/*
		System.out.println("Raiz: " + n1.info + 
				"\nNó Esquerda: " + n1.noEsquerda.info + 
				"\n\tNó Esquerda: " + (n1.noEsquerda.noEsquerda != null ? n1.noEsquerda.noEsquerda.info : n1.noEsquerda.noEsquerda) + 
				"\nNó Direita: " + n1.noDireita.info + 
				"\n\tNó Esquerda: " + (n1.noDireita.noEsquerda != null ? n1.noDireita.noEsquerda.info : n1.noDireita.noEsquerda) + 
				"\n\t\tNó Direita: " + (n1.noDireita.noEsquerda.noDireita != null ? n1.noDireita.noEsquerda.noDireita.info : n1.noDireita.noEsquerda.noDireita) + 
				"\n\tNó Direita: " + (n1.noDireita.noDireita != null ? n1.noDireita.noDireita.info : n1.noDireita.noDireita));
		*/
		System.out.print("\nPré-orderm: ");
		n1.pre_order();
		System.out.print("\nOrderm: ");
		n1.order();
	}

}
