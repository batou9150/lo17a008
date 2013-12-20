import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;

public class Lexic {

	Hashtable<String, String> lemme;
	Integer prefixCountLimit = 10;
	Integer seuilPrefix = 3;
	Integer seuilDistanceLevenshtein = 6;
	Hashtable<String, String> proximityKeyboard = new Hashtable<String, String>();

	Lexic() {
		proximityKeyboard.put("a", "zq");
		proximityKeyboard.put("z", "asqde");
		proximityKeyboard.put("e", "zsdfr");
		proximityKeyboard.put("r", "edfgt");
		proximityKeyboard.put("t", "ryfgh");
		proximityKeyboard.put("y", "tujgh");
		proximityKeyboard.put("u", "yihjk");
		proximityKeyboard.put("i", "uojkl");
		proximityKeyboard.put("o", "ipklm\"");
		proximityKeyboard.put("p", "o^lm�%)");
		proximityKeyboard.put("q", "azsw<>");
		proximityKeyboard.put("s", "qdzewx");
		proximityKeyboard.put("d", "sferxc");
		proximityKeyboard.put("f", "gdrtcv");
		proximityKeyboard.put("g", "fhtyvb");
		proximityKeyboard.put("h", "gjbnyu");
		proximityKeyboard.put("j", "hkui,n?");
		proximityKeyboard.put("k", "jlio,;?.");
		proximityKeyboard.put("l", "kmop;:./");
		proximityKeyboard.put("m", "l�%p^:/!�");
		proximityKeyboard.put("w", "<>xqs");
		proximityKeyboard.put("x", "wsdc");
		proximityKeyboard.put("c", "xvfd");
		proximityKeyboard.put("v", "bcfg");
		proximityKeyboard.put("b", "vngh");
		proximityKeyboard.put("n", "b,?hj");

		lemme = new Hashtable<String, String>();
		BufferedReader br = null;
		String chaine;
		try {
			try {
				URL u = new URL(
						"http://tuxa.sme.utc/~lo17a008/ressources/lexiqueFull.txt");
				URLConnection uc = u.openConnection();
				InputStream is = uc.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				br = new BufferedReader(isr);
				String[] splittedString;
				while ((chaine = br.readLine()) != null) {
					splittedString = chaine.split(" \t");
					lemme.put(Utils.removeAccents(splittedString[0]),
							Utils.removeAccents(splittedString[1]));
				}
			} catch (EOFException e) {
				br.close();
			}
		} catch (IOException e) {
			System.out.println("Lexic - IO Exception");
		}
	}

	String get(String search) {
		return lemme.get(search);
	}

	/**
	 * Get the proximity of the two strings by the prefix algorithm
	 * 
	 * @param s1
	 *            First string
	 * @param s2
	 *            Second string
	 * @return The proximity of the two strings
	 */
	Integer getPrefixProximity(String s1, String s2) {
		if (s1.length() < seuilPrefix || s2.length() < seuilPrefix) {
			return 0; // Chaines trop petites
		} else if (s1.length() - s2.length() > seuilPrefix) {
			return 0; // Chaines trop diff�rentes
		} else {
			int i = 0;
			while (i < s1.length() && i < s2.length()
					&& s1.charAt(i) == s2.charAt(i)) {
				i++;
			}
			return i; // Nombre de lettre identique
		}
	}

	Integer getLevenshteinProximity(String s1, String s2) {
		Integer[][] distance = new Integer[s1.length() + 1][s2.length() + 1];
		int i, j, cout = 0;
		for (i = 0; i < s1.length() + 1; i++) {
			distance[i][0] = i;
		}
		for (j = 0; j < s2.length() + 1; j++) {
			distance[0][j] = j;
		}
		for (i = 1; i < s1.length() + 1; i++) {
			for (j = 1; j < s2.length() + 1; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					String tmp = proximityKeyboard.get(String.valueOf(s1
							.charAt(i - 1)));
					if (tmp == null || (tmp != null && tmp.isEmpty())) {
						// System.out.println(String.valueOf(s1.charAt(i - 1)) +
						// " NOT FOUND");
						cout = mainIndex.coutSubstitution / 3;
					} else if (s1.length() != i
							&& tmp.indexOf(String.valueOf(s1.charAt(i))) != -1) {
						cout = 0;
					} else {
						cout = mainIndex.coutSubstitution / 3;
					}
				} else {
					if (s1.length() != i && s2.length() != j
							&& s1.charAt(i - 1) == s2.charAt(j)
							&& s1.charAt(i) == s2.charAt(j - 1)) {
						cout = mainIndex.coutInversion;
					} else {
						cout = mainIndex.coutSubstitution;
					}
				}
				distance[i][j] = getMin(distance[i - 1][j]
						+ mainIndex.coutSuppression, distance[i][j - 1]
						+ mainIndex.coutInsertion, distance[i - 1][j - 1]
						+ cout);
			}
		}
		// return Math.max(s1.length() , s2.length()) -
		// distance[s1.length()][s2.length()];
		return distance[s1.length()][s2.length()];
	}

	Integer getMin(Integer a, Integer b, Integer c) {
		return Math.min(Math.min(a, b), c);
	}

	/**
	 * 
	 * @param search
	 * @return
	 */
	String[] getPrefixLemme(String search) {
		search = search.toLowerCase();
		Hashtable<String, Integer> tempList = new Hashtable<String, Integer>();
		for (String n : lemme.keySet()) {
			Integer i = 0;
			i = getPrefixProximity(search, n);
			if (i > seuilPrefix) {
				if (!tempList.containsKey(lemme.get(n))) {
					tempList.put(lemme.get(n), i);
				} else if (tempList.get(lemme.get(n)) < i) {
					tempList.put(lemme.get(n), i);
				}
			}
		}
		// Tri � bulle
		Set<String> keys = tempList.keySet();
		Collection<Integer> values = tempList.values();
		Object[] keysArray = keys.toArray();
		Object[] valuesArray = values.toArray();
		boolean flag = false;
		do {
			flag = false;
			for (int j = 0; j < valuesArray.length - 1; j++) {
				if ((Integer) valuesArray[j] < (Integer) valuesArray[j + 1]) {
					String keyTemp = (String) keysArray[j];
					keysArray[j] = keysArray[j + 1];
					keysArray[j + 1] = keyTemp;

					Integer valueTemp = (Integer) valuesArray[j];
					valuesArray[j] = valuesArray[j + 1];
					valuesArray[j + 1] = valueTemp;

					flag = true;
				}
			}
		} while (flag);
		if (keysArray.length > 0) {
			String[] returnList = new String[Math.min(prefixCountLimit,
					keysArray.length)];
			for (int i = 0; i < Math.min(prefixCountLimit, keysArray.length); i++) {
				returnList[i] = (String) keysArray[i];
			}
			return returnList;
		}
		return null;
	}

	String[] getLevenshteinLemme(String search) {
		search = search.toLowerCase();
		Hashtable<String, Integer> tempList = new Hashtable<String, Integer>();
		for (String n : lemme.keySet()) {
			Integer i = 0;
			i = getLevenshteinProximity(search, n);
			if (i <= seuilDistanceLevenshtein) {
				tempList.put(lemme.get(n), i);
			}
		}
		// Tri � bulle
		Set<String> keys = tempList.keySet();
		Collection<Integer> values = tempList.values();
		Object[] keysArray = keys.toArray();
		Object[] valuesArray = values.toArray();
		boolean flag = false;
		do {
			flag = false;
			for (int j = 0; j < valuesArray.length - 1; j++) {
				if ((Integer) valuesArray[j] > (Integer) valuesArray[j + 1]) {
					String keyTemp = (String) keysArray[j];
					keysArray[j] = keysArray[j + 1];
					keysArray[j + 1] = keyTemp;

					Integer valueTemp = (Integer) valuesArray[j];
					valuesArray[j] = valuesArray[j + 1];
					valuesArray[j + 1] = valueTemp;

					flag = true;
				}
			}
		} while (flag);
		if (keysArray.length > 0) {
			String[] returnList = new String[Math.min(prefixCountLimit,
					keysArray.length)];
			for (int i = 0; i < Math.min(prefixCountLimit, keysArray.length); i++) {
				returnList[i] = (String) keysArray[i];
			}
			return returnList;
		}
		return null;
	}

	String[] search(String search) {
		search = search.toLowerCase();
		String[] prefixResults = getPrefixLemme(search);
		if (prefixResults != null) {
			// System.out.println("Utilisation du prefix");
			return prefixResults;
		}
		String[] levenshteinResults = getLevenshteinLemme(search);
		if (levenshteinResults != null) {
			// System.out.println("Utilisation de levenshtein");
			return levenshteinResults;
		}
		return null;
	}
}
