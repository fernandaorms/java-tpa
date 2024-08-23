package pk01;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pessoa {
	private String nome;
	private Date nascimento;
	private String cpf;
	
	/*
	public Pessoa(String nome, Date nascimento, String cpf) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.cpf = cpf;
	}
	*/
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getNascimento() {
		return nascimento;
	}
	
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
