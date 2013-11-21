import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Cleaner {

	LinkedHashMap<String, String> lemme = new LinkedHashMap<String, String>();
	ArrayList<String> stoplist = new ArrayList<String>();

	Cleaner() {
		BufferedReader br = null;
		String chaine;
		try {
			try {
				// Loading lemmes
				br = new BufferedReader(new FileReader("ressources/lemme.txt"));
				String[] splittedString;
				while ((chaine = br.readLine()) != null) {
					splittedString = chaine.split("\t");
					if (splittedString.length == 2) {
						System.out.println(splittedString[0] + " "
								+ splittedString.length);
						lemme.put(splittedString[0], splittedString[1]);
					}
				}
				br.close();
				
				// Loading the stoplist
				br = new BufferedReader(new FileReader("ressources/stoplist.txt"));
				while ((chaine = br.readLine()) != null) {
					stoplist.add(chaine);
				}
				br.close();
			} catch (EOFException e) {
				br.close();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Fichier introuvable");
		} catch (IOException e) {
			System.out.println("IO Exception");
		}
	}

	String applyStoplist(String s) {
		for (int i = 0; i < stoplist.size(); i++) {
			s = s.replaceAll(" " + stoplist.get(i) + " ", " ");
			s = s.replaceAll("^" + stoplist.get(i) + " ", "");
			s = s.replaceAll(" " + stoplist.get(i) + "$", "");
			s = s.replaceAll("^" + stoplist.get(i) + "$", "");
		}
		return s;
	}

	String applyLemme(String s) {
		for (String n : lemme.keySet()) {
			s = s.replaceAll(" " + n + " ", " " + lemme.get(n) + " ");
			s = s.replaceAll("^" + n + " ", lemme.get(n) + " ");
			s = s.replaceAll(" " + n + "$", " " + lemme.get(n));
			s = s.replaceAll("^" + n + "$", lemme.get(n));
		}
		return s;
	}

	String deleteOneLetter(String s) {
		s = s.replaceAll("'", " ");
		String t = "";
		t = s.replaceAll(" [a-z] ", " ");
		while (!t.equals(s)) {
			s = t;
			t = s.replaceAll(" [a-z] ", " ");
		}
		s = t;
		System.out.println(s);
		s = s.replaceAll("^[a-z] ", "");
		System.out.println(s);
		s = s.replaceAll(" [a-z]$", "");
		System.out.println(s);
		s = s.replaceAll("^[a-z]$", "");
		System.out.println(s);
		return s;
	}

	String cleanString(String s) {
		return applyLemme(applyStoplist(deleteOneLetter(s.toLowerCase())));
	}
}
