package javaproject;

import java.util.Date;

import pk01.Aluno;
import pk01.Bolsista;

public class Main {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Fernanda", new Date("07/13/2001"), "111.111.111-11");
		System.out.println(a1.getNome());
		
		a1.setNome("Fernanda Oliveira");
		a1.FazerMatricula();
		
		Bolsista b1 = new Bolsista("Mariana", new Date("26/04/2002"), "111.111.111-11", "(28)99999-9999");
		
		System.out.println(b1.getFone());
		b1.FazerMatricula();
	}
}
