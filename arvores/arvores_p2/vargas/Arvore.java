package vargas;

public class Arvore {
	private No raiz;
	
	public Arvore(No raiz) {
		this.raiz = raiz;
	}
	
	
	/*  */
	public boolean busca(Integer valor) {
		return busca(raiz, valor);
	}
	
	private boolean busca(No x, Integer valor) {
		if (x == null) return false;
		
		int cmp = valor.compareTo(x.valor);
		
		if (cmp < 0) return busca(x.noEsquerda, valor);
		else if (cmp > 0) return busca(x.noDireita, valor);
		else return true;
	}
	
	
	/*  */
	public boolean buscaIterativa(Integer valor) {
		No x = raiz;
		int cmp;
		
		while(x != null) {
			cmp = valor.compareTo(x.valor);
			
			if (cmp < 0) {
				x = x.noEsquerda;
			} else if (cmp > 0) {
				x = x.noDireita;
			} else {
				return true;
			}
		}
		
		return false;
	}
	
	
	/*  */
	public void insere(Integer valor) {
		raiz = insere(raiz, valor);
	}
	
	private No insere(No x, Integer valor) {
		if(x == null) return new  No(valor, 1);
		
		int cmp = valor.compareTo(x.valor);
		
		if (cmp < 0) x.noEsquerda = insere(x.noEsquerda, valor);
		else if (cmp > 0) x.noDireita = insere(x.noDireita, valor);
		else x.valor = valor;
		
		x.tamanho = 1 + tamanho(x.noEsquerda) + tamanho(x.noDireita);
		
		return x;
	}
	
	
	/*  */
	public No minimo() {
		return minimo(raiz);
	}
	
	private No minimo(No x) {
		if (x.noEsquerda == null) return x;
		else return minimo(x.noEsquerda);
	}
	
	
	/*  */
	public No maximo() {
		return maximo(raiz);
	}
	
	private No maximo(No x) {
		if(x.noDireita == null) return x;
		else return maximo(x.noDireita);
	}
	
	
	/*  */
	public Integer piso(Integer valor) {
		No x = piso(raiz, valor);
		if (x == null) return null;
		else return x.valor;
	}
	
	private No piso(No x, Integer valor) {
		if  (x == null) return null;
		
		int cmp = valor.compareTo(x.valor);
		
		if (cmp == 0) return x;
		
		if (cmp < 0) return piso(x.noEsquerda, valor);
		
		No t = piso(x.noDireita, valor);
		
		if (t != null) return t;
		else return x;
	}
	
	
	/*  */
	public Integer tamanho() {
		return tamanho(raiz);
	}
	
	private int tamanho(No x) {
		if(x == null) return 0;
		return x.tamanho;
	}
	
	
	/*  */
	public Integer posto(Integer valor) {
		return posto(raiz, valor);
	}
	
	private Integer posto(No x, Integer valor) {
		if  (x == null) return 0;
		
		int cmp = valor.compareTo(x.valor);
		
		if (cmp < 0) return posto(x.noEsquerda, valor);
		else if (cmp > 0) return 1 + tamanho(x.noEsquerda) + posto(x.noDireita, valor);
		else return tamanho(x.noEsquerda);
	}
	
	
	/*  */
	public void removeMin() {
		raiz = removeMin(raiz);
	}
	
	private No removeMin(No x) {
		if (x.noEsquerda == null) return x.noDireita;
		
		x.noEsquerda = removeMin(x.noEsquerda);
		x.tamanho = 1 + tamanho(x.noEsquerda) + tamanho(x.noDireita);
		
		return x;
	}

	
	/*  */
	public void remove(Integer valor) {
		raiz = remove(raiz, valor);
	}
	
	private No remove(No x, Integer valor) {
		if (x == null) return null;
		
		int cmp = valor.compareTo(x.valor);
		
		if (cmp < 0) x.noEsquerda = remove(x.noEsquerda, valor);
		else if (cmp > 0) x.noDireita = remove(x.noDireita, valor);
		else {
			if (x.noDireita == null) return x.noEsquerda;
			if (x.noEsquerda == null) return x.noDireita;
			
			No t = x;
			
			x = minimo(t.noDireita);
			x.noDireita = removeMin(t.noDireita);
			x.noEsquerda = t.noEsquerda;
			
		}
		
		x.tamanho = tamanho(x.noEsquerda) + tamanho(x.noDireita) + 1;
		return x;
	}
	
	
	/*  */
	public void imprimirArvore() {
		 imprimirArvore(raiz);
	}
	
	private void imprimirArvore(No x) {
		if (x != null) {
			 System.out.print("(" + x.valor);
			 imprimirArvore(x.noEsquerda);
			 imprimirArvore(x.noDireita);
			 System.out.print(")");
		}
	 }
	
	
	/*  */
	public int calcularNumeroTotalNos() {
		 return calcularNumeroTotalNos(raiz);
	}

	private int calcularNumeroTotalNos(No x) {
		if (x == null) {
			 return 0;
		 }
		
		return 1 + calcularNumeroTotalNos(x.noEsquerda) + calcularNumeroTotalNos(x.noDireita);
	}

	
	/*  */
	public int calcularSoma() {
		 return calcularSoma(raiz);
	 }
	
	private int calcularSoma(No x) {
		 if (x == null) {
			 return 0;
		 }
		 
		 return (Integer)x.valor + calcularSoma(x.noEsquerda) + calcularSoma(x.noDireita);
	 }
	
	
	/*  */
	public boolean verificarBST() {
		 return verificarBST(raiz);
	}
	
	private boolean verificarBST(No x) {
		if (x == null) {
			return true;
		}
		
		 if(x.noEsquerda != null){
			 if (x.valor.compareTo(x.noEsquerda.valor) < 0) {
				 return false;
			 }
		 }
		 if(x.noDireita != null){
			 if (x.valor.compareTo(x.noDireita.valor) > 0) {
				 return false;
			 }
		 }
		 return verificarBST(x.noEsquerda) && verificarBST(x.noDireita);
	 }

	
	/*  */
	void show() {
		 show(raiz, 0);
	 }
	
	void show(No x, int b) {
		 if (x == null) {
			 imprimirNo("*", b);
			 return;
		 }
		 
		 show(x.noDireita, b + 1);
		 imprimirNo(String.valueOf(x.valor), b);
		 show(x.noEsquerda, b + 1);
	 }
	
	void imprimirNo(String valor, int b) {
		 int i;
		 
		 for (i = 0; i < b; i++) {
			 System.out.print("---");
		 }
		 
		 System.out.printf("%s\n", valor);
	 }
	
	
	/*  */
	public void inOrder() {
		inOrder(raiz);
	}
	
	public void inOrder(No x) {
		if (x == null) return;
		
		inOrder(x.noEsquerda);
		System.out.print(x.valor + " ");
		inOrder(x.noDireita);
	}
	
	
	/*  */
	public void preOrder() {
		preOrder(raiz);
	}
	
	public void preOrder(No x) {
		if (x == null) return;
		
		System.out.print(x.valor + " ");
		preOrder(x.noEsquerda);
		preOrder(x.noDireita);
	}
	
	
	/*  */
	public void postOrder() {
		postOrder(raiz);
	}
	
	public void postOrder(No x) {
		if (x == null) return;
		
		postOrder(x.noEsquerda);
		postOrder(x.noDireita);
		System.out.print(x.valor + " ");
	}
	
	
	/*  */
	public int altura() {
        return altura(raiz);
    }
    
    private int altura(No x) {
        if (x == null) return 0;

        int alturaE = altura(x.noEsquerda);
        int alturaD = altura(x.noDireita);

        return Math.max(alturaE, alturaD) + 1;
    }
    
    
    /*  */
    public int contarFolhas() {
        return contarFolhas(raiz);
    }
    
    private int contarFolhas(No x) {
        if (x == null) return 0;

        if (x.noEsquerda == null && x.noDireita == null) return 1;

        return contarFolhas(x.noEsquerda) + contarFolhas(x.noDireita);
    }
    
    
    /*  */
    public No encontrarLCA(int valor1, int valor2) {
        if (busca(raiz, valor1) && busca(raiz, valor2)) {
            return encontrarLCA(raiz, valor1, valor2);
        }
        return null;
    }
    
    private No encontrarLCA(No x, int valor1, int valor2) {
        if (x == null) return null;

        if (x.valor == valor1 || x.valor == valor2) return x;

        No esquerda = encontrarLCA(x.noEsquerda, valor1, valor2);
        No direita = encontrarLCA(x.noDireita, valor1, valor2);
        
        if (esquerda != null && direita != null) return x;
        
        return (esquerda != null) ? esquerda : direita;
    }
    
    
    /*  */
    public boolean isBST() {
    	return isBST(raiz, null, null);
    }
    
    private boolean isBST(No x, Integer min, Integer max) {
    	if (x == null) return true;
    		
    	if ((min != null && x.valor <= min) || (max != null && x.valor >= max)) {
            return false;
        }
    	
    	return isBST(x.noEsquerda, min, x.valor) && isBST(x.noDireita, x.valor, max);
    }
    
    
    /*  */
    public int tamanho1() {
        return tamanho1(raiz);
    }

    private int tamanho1(No x) {
        if(x == null) return 0;

        return tamanho1(x.noEsquerda) + tamanho1(x.noDireita) + 1;
    }
    
    
    
    
}
