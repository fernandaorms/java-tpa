package javaproject;

import pk01.Aluno;
import pk01.Bolsista;
import pk01.Logavel;

public class Acesso2 {

	public static void main(String[] args) {
		Logavel l1 = new Aluno(null, null, null, null);
		System.out.println(l1.logar("123"));
		
		int i = 3;
		System.out.println((float) i);
		
		Logavel l2 = new Bolsista(null, null, null, null, null);
		System.out.println(l2.logar("abc"));
	}

}
