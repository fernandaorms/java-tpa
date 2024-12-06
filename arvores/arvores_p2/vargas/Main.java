package vargas;

public class Main {

	public static void main(String[] args) {
		No raiz = new No(8, 1);
		
		Arvore arvore = new Arvore(raiz);
		
		arvore.insere(4);
		arvore.insere(10);
		
		arvore.insere(3);
		arvore.insere(5);
		arvore.insere(12);
		
		arvore.insere(2);
		arvore.insere(11);
		
		System.out.println("Tamanho: " + arvore.tamanho());
		
		System.out.println("Existe 2: " + arvore.busca(2));
		
		System.out.println("Mínimo: " + arvore.minimo().valor);
		System.out.println("Máximo: " + arvore.maximo().valor);
		
		System.out.println("Piso: " + arvore.piso(4));
		System.out.println("Posto: " + arvore.posto(10));
		
		System.out.println("\n");
		
		arvore.imprimirArvore();
		/*
		arvore.removeMin();
		System.out.println("Existe 2: " + arvore.busca(2));
		*/
		
		System.out.println("\n");
		
		// arvore.remove(4);
		arvore.imprimirArvore();
		
		System.out.println("\n");
		arvore.inOrder();
		
		System.out.println("\n");
		arvore.preOrder();
		
		System.out.println("\n");
		arvore.postOrder();
		
		
		System.out.println("\n");
		System.out.println("Altura: " + arvore.altura());
		System.out.println("Folhas: " + arvore.contarFolhas());
		System.out.println("LCA: " + arvore.encontrarLCA(4, 11).valor);
		System.out.println("Grau raiz: " + arvore.tamanho());
	}

}
