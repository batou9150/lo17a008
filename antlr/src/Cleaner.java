import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * Gives the methods to clean up queries
 * 
 */
public class Cleaner {

	private LinkedHashMap<String, String> lemme = new LinkedHashMap<String, String>();
	private ArrayList<String> stoplist = new ArrayList<String>();
	private Lexic lexic;

	/**
	 * Constructor of Cleaner
	 */
	public Cleaner(Lexic lexic) {
		this.lexic = lexic;
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
						lemme.put(splittedString[0], splittedString[1]);
					}
				}
				br.close();

				// Loading the stoplist
				br = new BufferedReader(new FileReader(
						"ressources/stoplist.txt"));
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

	/**
	 * Remove all characters which are in the stop-list
	 * 
	 * @param s
	 *            The string to clean
	 * @return The string cleaned
	 */
	String applyStoplist(String s) {
		for (int i = 0; i < stoplist.size(); i++) {
			s = s.replaceAll(" " + stoplist.get(i) + " ", " ");
			s = s.replaceAll("^" + stoplist.get(i) + " ", "");
			s = s.replaceAll(" " + stoplist.get(i) + "$", "");
			s = s.replaceAll("^" + stoplist.get(i) + "$", "");
		}
		return s;
	}

	/**
	 * Replace words by their lemme
	 * 
	 * @param s
	 *            The string to clean
	 * @return The string cleaned
	 */
	String applyLemme(String s) {
		for (String n : lemme.keySet()) {
			s = s.replaceAll(" " + n + " ", " " + lemme.get(n) + " ");
			s = s.replaceAll("^" + n + " ", lemme.get(n) + " ");
			s = s.replaceAll(" " + n + "$", " " + lemme.get(n));
			s = s.replaceAll("^" + n + "$", lemme.get(n));
		}
		return s;
	}

	/**
	 * Remove all single characters
	 * 
	 * @param s
	 *            The string to clean
	 * @return The string cleaned
	 */
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

	/**
	 * Clean the string
	 * 
	 * @param s
	 *            The string to clean
	 * @return The string cleaned
	 */
	String cleanString(String s) {
		s = applyStoplist(deleteOneLetter(s.toLowerCase()));
		String[] result = lexic.search(s);
		if (result != null && result.length > 0)
		{
			s = result[0];
		}
		s = applyLemme(s);
		s = s.replaceAll("[\\{\\}]", "");
		// todo : Remove all accents
		return s;
	}
}
