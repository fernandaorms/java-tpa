package javaproject;

import pk01.Aluno;
import pk01.Bolsista;
import pk01.Pessoa;

public class Acesso {
		
	public static void main(String[] args) {
		char tipo = 'A';
		
		Pessoa p1;
		
		switch(tipo) {
		case 'A' :
			p1 = new Aluno(null, null, null, null);
			break;
		case 'B' :
			p1 = new Bolsista(null, null, null, null, null);
			break;
		default:
			throw new IllegalArgumentException("Acesso Negado - " + tipo);
		}

		System.out.println(p1.toString());
		System.out.println(p1.logar("123"));
		System.out.println(p1.logar("abc"));
	}

}
