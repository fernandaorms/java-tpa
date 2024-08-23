package pk01;

import java.util.Date;

public class Aluno extends Pessoa {
	public String matricula;
	
	
	public Aluno(String nome, Date nascimento, String cpf) {
		super(nome, nascimento, cpf);
	}
	
	
	public void FazerMatricula() {
		System.out.println("Matricula realizada para o aluno: " + this.getNome()
				+ "\nNascimento: " + this.getNascimento());
	}
	
}
