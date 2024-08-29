package pk01;

import java.util.Date;

import lombok.Data;

@Data
public class Aluno extends Pessoa implements Logavel {
	public String matricula;
	
	
	public Aluno(String nome, Date nascimento, String cpf, String matricula) {
		super(nome, nascimento, cpf);
		
		this.matricula = matricula;
	}
	
	
	public void FazerMatricula() {
		System.out.println("Matricula realizada para o aluno: " + this.getNome()
				+ "\nNascimento: " + super.getNascimento());
	}
	
	@Override
	public boolean logar(String senha) {
		return (senha == "123");
	}
	
}
