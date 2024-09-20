package hash_tables_mult;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hash h = new Hash(101);
		
		
		h.insertItem("ABC", "AGDA");
		h.insertItem("CBA", "FERNANDA");
		
		System.out.println(h.retriveItem("ABC"));
		System.out.println(h.retriveItem("CBA"));
	}

}
