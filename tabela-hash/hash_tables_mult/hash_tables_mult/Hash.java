package hash_tables_mult;

public class Hash {
	private String [] vetor;
	int m = 3;
	
	
	public Hash(int size) {
		this.vetor = new String[size];
	}

	
	public int h(String k) {
		k = String.format("%8s", k);
		
		int size = this.vetor.length;
		int index = 0;
		double a = 0.9;
		
		for(int x = 0; x < k.length(); x++) {
			index += (int) k.charAt(x);
		}
			
		
		index = (int) ((((index * a) % 3) * size) % size);
		
		System.out.println(index);
		
		return index;
	}
	
	public String retriveItem(String k) {
		return vetor[h(k)];
	}
	
	public void insertItem(String k, String v) {
		vetor[h(k)] = v.toLowerCase();
	}
	
	public void deleteItem(String k) {
		vetor[h(k)] = null;
	}
}
