package loja;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Produto {
	 private String nome;
	 private double preco;
	 private String codBarras;
	 
	    
}
