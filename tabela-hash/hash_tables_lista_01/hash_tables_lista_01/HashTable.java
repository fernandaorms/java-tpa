package hash_tables_lista_01;

public class HashTable {
	private int [] idades;
	
	int mult = 3;
	
	public HashTable(int size) {
		this.idades = new int[size];
	}

	private int hash(String key) {
		key = key.toUpperCase();
		
		int index = 0;
		int pow;
		
		for(int i = 0; i < key.length(); i++) {
			pow = key.length() - i;
			
			index += ((int) key.charAt(i)) * (Math.pow(mult, pow));
		}
		
		index %= 10;
		
		return index;
	}
	
	public void put(String key, int value) {
		key = key.toUpperCase();
		
		int index = hash(key);
				
		this.idades[index] = value;
	}
	
	public int get(String key) {
		key = key.toUpperCase();
		
		int index = hash(key);
		
		return this.idades[index];
	}
	
	public void remove(String key) {
		key = key.toUpperCase();
		
		int index = hash(key);
		
		this.idades[index] = (Integer) null;
	}
}
