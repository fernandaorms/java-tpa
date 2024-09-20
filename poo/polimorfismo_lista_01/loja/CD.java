package loja;

import lombok.Data;

@Data
public class CD extends Produto {
	private int numFaixas;
	
	public CD(String nome, double preco, String codBarras, int numFaixas) {
		super(nome, preco, codBarras);
		
		this.numFaixas = numFaixas;
	}
	
	@Override
	public String toString() {
		return ("Nome: " + this.getNome() + "\n"
				+ "Preço: " + this.getPreco() + "\n"
				+ "Número de faixas: " + this.getNumFaixas());
	}
}
