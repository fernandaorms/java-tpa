
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hash h = new Hash(101);
		
		h.insertItem("AGDA", "AGDA");
		h.insertItem("GABRIEL", "GABRIEL");
		h.insertItem("TRACY", "TRACY");
		h.insertItem("BIANCA", "BIANCA");
		h.insertItem("FERNANDA", "FERNANDA");
		h.insertItem("WELINGTON", "WELINGTON");
		h.insertItem("ESCOLASTICA", "ESCOLASTICA");
		h.insertItem("CACILDA", "CACILDA");
		
		
		h.insertItem("ABC", "Teste 1");
		h.insertItem("CBA", "Teste 2");
		
		System.out.println("Tamanho: " + h.size() + "\n");
		
		for(String s: h.keySet()) {
			System.out.println(s);
		}
	}

}
