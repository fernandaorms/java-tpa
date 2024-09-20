package binaria;

public class No {
	int info;
	
	No noEsquerda;
	No noDireita;
	
	public No(int info) {
		this.info = info;
	}
	
	public No() {}
	
	public void inserir(int info) {
		inserir(this, info);
	}
	
	public void inserir(No n, int info) {
		if(info < n.info) {
			if(n.noEsquerda != null) {
				inserir(n.noEsquerda, info);
			} else {
				n.noEsquerda = new No(info);
			}
		} else if(info > n.info) {
			if(n.noDireita != null) {
				inserir(n.noDireita, info);
			} else {
				n.noDireita = new No(info);
			}
		}
	}
	
	public void remover(int info) {
		remover(this, info);
	}
	
	public void remover(No n, int info) {
		if (n == null) return;
		
		if(info < n.info) {
			if(n.noEsquerda.info == info) {
				if((n.noEsquerda.noEsquerda == null) && (n.noEsquerda.noDireita == null)) n.noEsquerda = null;
				else System.out.println("\n\nElemento " + info + " não é folha\n");
			}
				
			remover(n.noEsquerda, info);
		} else if(info > n.info) {
			if(n.noDireita.info == info) {
				if((n.noDireita.noEsquerda == null) && (n.noDireita.noDireita == null)) n.noDireita = null;
				else System.out.println("\n\nElemento " + info + " não é folha\n");
			}
			remover(n.noDireita, info);
		}
		
	}
	
	public void pre_order() {
		pre_order(this);
	}

	public void pre_order(No n) {
		if(n == null) return;
		
		System.out.print(n.info + " ");
		
		/*System.out.println("\tE:" + (n.noEsquerda != null ? n.noEsquerda.info : n.noEsquerda));
		System.out.println("\tD:" + (n.noDireita != null ? n.noDireita.info : n.noDireita));*/
		
		pre_order(n.noEsquerda);
		
		pre_order(n.noDireita);
	}
	
	public void order() {
		pre_order(this);
	}

	
	public void order(No n) {
		if(n == null) return;
		
		if(n.noEsquerda != null) pre_order(n.noEsquerda);
		else System.out.print(n.info + " ");
		
		if(n.noDireita != null) pre_order(n.noDireita);
		else System.out.print(n.info + " ");
		
	}
}
