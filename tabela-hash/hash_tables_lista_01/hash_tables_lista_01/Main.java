package hash_tables_lista_01;

public class Main {

	public static void main(String[] args) {
		HashTable tabela = new HashTable(10);
		
		tabela.put("FERNANDA", 23);
		tabela.put("Mariana", 22);
		tabela.put("Alda", 22);
		tabela.put("Felipe", 12);
		
		
		System.out.println("Felipe - " + tabela.get("Felipe") + " anos");
		System.out.println("Alda - " + tabela.get("Alda") + " anos");
		System.out.println("Mariana - " + tabela.get("Mariana") + " anos");
		System.out.println("Fernanda - " + tabela.get("Fernanda") + " anos");
	}

}
