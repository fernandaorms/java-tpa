package hash_colisoes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTable hash_table = new HashTable(101);
		
		// String palavras = "exceto, cínico, idôneo, âmbito, néscio, mister, índole, vereda, apogeu, inócuo, convém, defina, utopia, escopo, sádico, ênfase, idiota, mérito, alusão, casual, hostil, anseio, cético, legado, gentil, hétero, pressa, alheio, paixão, nocivo, clichê, infame, exímio, afável, dádiva, adorno, também, êxtase, larica, sóbrio, aferir, otário, astuto, adesão, sessão, solene, glória, limiar, julgar, embora, ensejo, lábaro, hábito, apreço, formal, ímpeto, eficaz, outrem, nuance, dispor, júbilo, ocioso, perene, alento, difuso, escusa, cessão, facção, exílio, ilação, lúdico, abster, objeto, acesso, alçada, desejo, mulher, acento, axioma, buscar, tácito, etéreo, sanção, isento, quando, mazela, cortês, cobiça, penhor, sisudo, eximir, avidez, prazer, receio, vulgar, remoto, sempre, fático, nômade, adágio";

		//String [] splt = palavras.split(", ");
		//System.out.println(splt.length);
		//for (String s: splt) {
			//hash_table.insertItem(s, s);
		//}
		
		hash_table.insertItem("AGDA", "AGDA");
		hash_table.insertItem("GABRIEL", "GABRIEL");
		hash_table.insertItem("TRACY", "TRACY");
		hash_table.insertItem("BIANCA", "BIANCA");
		hash_table.insertItem("FERNANDA", "FERNANDA");
		hash_table.insertItem("WELINGTON", "WELINGTON");
		hash_table.insertItem("ESCOLASTICA", "ESCOLASTICA");
		hash_table.insertItem("CACILDA", "CACILDA");
		
		
		hash_table.insertItem("âmbito", "âmbito");
		hash_table.insertItem("índole", "índole");
		hash_table.insertItem("utopia", "utopia");
		hash_table.insertItem("CACILDA", "CACILDA");
		
		for(String s: hash_table.keySet()) {
			System.out.println(s);
		}
		
		// System.out.println(vetor[h(k)].length)
	}

}
