package pk01;

import java.util.Date;

public class Bolsista extends Aluno {
	private String fone;
	
	public Bolsista(String nome, Date nascimento, String cpf, String fone) {
		super(nome, nascimento, cpf);
		
		this.fone = fone;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}
	
	@Override
	public void FazerMatricula() {
		System.out.println("Matricula realizada para o aluno: " + this.getNome()
				+ "\nNascimento: " + this.getNascimento()
				+ "\nTelefone: " + this.getFone());
	}
	 
}
