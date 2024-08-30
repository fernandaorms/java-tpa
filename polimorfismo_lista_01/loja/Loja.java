package loja;

import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {
		Produto[] produtos = new Produto[5];

        produtos[0] = new Livro("Harry Potter", 120.00, "ABC000", "J.K. Rowling");
        produtos[1] = new CD("Folklore", 150.00, "ABC001", 12);
        produtos[2] = new DVD("Hobbit", 70.00, "ABC002", 230);
        produtos[3] = new Livro("Senhor dos Anéis", 90.00, "ABC000", "J.R.R. Tolkien");
        produtos[4] = new CD("1989", 130.00, "ABC004", 13);

        for (Produto produto : produtos) {
            System.out.println(produto.toString());
            System.out.println("\n");
        }
        
        
        // To Do
        	// 6.2.
        	/* Sobrescreva o método equals() retornando true se dois produtos possuem o mesmo código de barras; */
        
        	// 6.3
        	/* Na classe Loja, implemente um simples procedimento de busca que, dado um
	        produto e um vetor de produtos, indique em que posição do vetor se encontra o
	        produto especificado ou imprima que o mesmo não foi encontrado; */
        
        	// 6.4. 
        	/* No método Loja.main(), após a impressão do vetor (feita na questão 5), escolha
	        um dos 5 produtos e crie duas novas instâncias idênticas a ele: uma com o
	        mesmo código de barras e outra com o código diferente. Efetue a busca deste
	        produto no vetor utilizando as duas instâncias e verifique o resultado. 
	        Produto produtoBuscar = new CD("Test", 150.00, "ABC001", 12); */

        	// 7
	        /* Ainda modificando o código do programa anterior, faça com que Produto
	        implemente a interface Comparable, e implemente a comparação por nome. Ao final
	        do método Loja.main(), ordene o vetor utilizando o método java.util.Arrays.sort() e
	        imprima-o novamente. Depois altere a implementação da comparação para ordenar 
	        por preço e verifique o resultado. */
	}
	
}
