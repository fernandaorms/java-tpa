import java.util.ArrayList;
import java.util.List;

public class Hash {
	
	private String [] vetor;
	int m = 3;
	private int size;
	List<String> keys = new ArrayList<>();
	
	
	public Hash(int size) {
		this.vetor = new String[size];
	}

	
	public int h(String k) {
		k = String.format("%8s", k);
		
		int index = 0;
		
		for(int x = 0; x < k.length(); x++) {
			index += ((int) k.charAt(x)) * Math.pow(m, k.length() - (x+1));
		}
		
		index %= vetor.length;
		
		return index;
	}
	
	public String retriveItem(String k) {
		return vetor[h(k)];
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
		/*
		int size = 0;
		
		for(int i = 0; i < this.getVetor().length; i++) {
			if(this.getVetor()[i] != null) size++;
			System.out.println(this.getVetor()[i]);
		}
		*/
		return this.size;
	}

	public String [] keySet() {
		return (String[]) keys.toArray(String[]::new);
	}
}
