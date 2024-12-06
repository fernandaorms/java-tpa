package vargas;

public class No {
	public Integer valor;
	public No noEsquerda;
	public No noDireita;
	public Integer tamanho;
	
	public No (Integer valor, Integer tamanho) {
		this.valor = valor;
		this.tamanho = tamanho;
	}
}
