package loja;

import lombok.Data;

@Data
public class DVD extends Produto {
	private int duracao;
	
	public DVD(String nome, double preco, String codBarras, int duracao) {
		super(nome, preco, codBarras);
		
		this.duracao = duracao;
	}
	
	@Override
	public String toString() {
		return ("Nome: " + this.getNome() + "\n"
				+ "Preço: " + this.getPreco() + "\n"
				+ "Duração: " + this.getDuracao() + " min");
	}
}
