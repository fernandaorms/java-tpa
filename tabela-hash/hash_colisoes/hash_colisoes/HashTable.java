package hash_colisoes;

import java.util.ArrayList;
import java.util.List;

public class HashTable {
	private String [][] vetor;
	int max_colisoes = 17;
	
	int a = 3;
	int a2 = 11;
	
	private int size;
	List<String> keys = new ArrayList<>();
	
	public HashTable(int size) {
		this.vetor = new String[size][max_colisoes];
	}
	
	public int h(String k, int a, int lenght) {
		k = String.format("%8s", k);
		
		int index = 0;
		
		for(int x = 0; x < k.length(); x++) {
			index += ((int) k.charAt(x)) * Math.pow(a, k.length() - (x+1));
		}
		
		index %= vetor.length;
		
		return index;
	}
	
	public String retriveItem(String k) {
		return vetor[h(k, a, vetor.length)][h(k, a2, vetor[0].length)];
	}
	
	public void insertItem(String k, String v) {
		vetor[h(k)] = v.toLowerCase();
		size++;
		keys.add(k);
	}
	
	public void deleteItem(String k) {
		vetor[h(k)] = null;
		size--;
		keys.remove(k);
	}
	
	public int size() {
		return this.size;
	}
	
	public String [] keySet() {
		return (String[]) keys.toArray(String[]::new);
	}
}
