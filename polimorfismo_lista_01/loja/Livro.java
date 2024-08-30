package loja;

import lombok.Data;

@Data
public class Livro extends Produto {
	private String autor;
	
	public Livro(String nome, double preco, String codBarras, String autor) {
		super(nome, preco, codBarras);
		
		this.autor = autor;
	}
	
	@Override
	public String toString() {
		return ("Nome: " + this.getNome() + "\n"
				+ "Preço: " + this.getPreco() + "\n"
				+ "Autor: " + this.getAutor());
	}

}
