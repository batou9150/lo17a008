import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * Gives the methods to clean up queries
 * 
 */
public class Cleaner {

	private LinkedHashMap<String, String> lemme = new LinkedHashMap<String, String>();
	private LinkedHashMap<String, String> advancedLemme = new LinkedHashMap<String, String>();
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
				String[] splittedString;
				// Loading lemmes
				URL u = new URL(
						"http://tuxa.sme.utc/~lo17a008/ressources/lexiqueFull.txt");
				URLConnection uc = u.openConnection();
				InputStream is = uc.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				br = new BufferedReader(isr);

				while ((chaine = br.readLine()) != null) {
					splittedString = chaine.split("\t");
					if (splittedString.length == 2) {
						lemme.put(Utils.removeAccents(splittedString[0]),
								Utils.removeAccents(splittedString[1]));
					}
				}
				br.close();

				// Loading advancedLemme
				u = new URL(
						"http://tuxa.sme.utc/~lo17a008/ressources/advancedLemme.txt");
				uc = u.openConnection();
				is = uc.getInputStream();
				isr = new InputStreamReader(is);
				br = new BufferedReader(isr);

				while ((chaine = br.readLine()) != null) {
					splittedString = chaine.split("\t");
					if (splittedString.length == 2) {
						advancedLemme.put(
								Utils.removeAccents(splittedString[0]),
								Utils.removeAccents(splittedString[1]));
					}
				}
				br.close();

				// Loading the stoplist
				u = new URL(
						"http://tuxa.sme.utc/~lo17a008/ressources/stoplist.txt");
				uc = u.openConnection();
				is = uc.getInputStream();
				isr = new InputStreamReader(is);
				br = new BufferedReader(isr);

				while ((chaine = br.readLine()) != null) {
					stoplist.add(Utils.removeAccents(chaine));
				}
				br.close();
			} catch (EOFException e) {
				br.close();
			}
		} catch (IOException e) {
			System.out.println("Cleaner - IO Exception");
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
	 * Replace words by their advancedLemme
	 * 
	 * @param s
	 *            The string to clean
	 * @return The string cleaned
	 */
	String applyAdvancedLemme(String s) {
		for (String n : advancedLemme.keySet()) {
			s = s.replaceAll(" " + n + " ", " " + advancedLemme.get(n) + " ");
			s = s.replaceAll("^" + n + " ", advancedLemme.get(n) + " ");
			s = s.replaceAll(" " + n + "$", " " + advancedLemme.get(n));
			s = s.replaceAll("^" + n + "$", advancedLemme.get(n));
		}
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
		 System.out.println("Avant orthographique  : \"" + s + "\"");
		s = Utils.removeAccents(s);
		s = Utils.deleteOneLetter(s.toLowerCase());
		s = applyStoplist(s);
		s = s.replaceAll("( )+", " ");
		s = s.replaceAll("'", " ");
		 System.out.println("Après stop-list  : \"" + s + "\"");
		String[] split = s.split(" ");
		int i = 0;
		for (String n : split) {
			if (n.trim().equals("?"))
				continue;
			String[] result = lexic.search(n);
			if (result != null && result.length > 0) {
				System.out.println(split[i] + " - " + result[0]);
				split[i] = result[0];
			}
			i++;
		}
		s = "";
		for (String n : split) {
			s = s + n + " ";
		}
		 System.out.println("Après correction orthographique  : \"" + s + "\"");
		s = s.trim();
		s = applyStoplist(s);
		s = applyLemme(s);
		s = applyAdvancedLemme(s);
		s = s.replaceAll("[\\{\\}]", "");
		s = Utils.removeAccents(s);
		return s;
	}
}
