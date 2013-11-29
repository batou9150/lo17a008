public class Utils {

	static String removeAccents(String s) {
		s = s.replaceAll("[а]", "a");
		s = s.replaceAll("[йилк]", "e");
		s = s.replaceAll("[мпо]", "i");
		s = s.replaceAll("[цф]", "o");
		s = s.replaceAll("[щ]", "u");
		s = s.replaceAll("[з]", "c");
		return s;
	}

	/**
	 * Remove all single characters
	 * 
	 * @param s
	 *            The string to clean
	 * @return The string cleaned
	 */
	static String deleteOneLetter(String s) {
		s = s.replaceAll("'", " ");
		String t = "";
		t = s.replaceAll(" [a-z] ", " ");
		while (!t.equals(s)) {
			s = t;
			t = s.replaceAll(" [a-z] ", " ");
		}
		s = t;
		s = s.replaceAll("^[a-z] ", "");
		s = s.replaceAll(" [a-z]$", "");
		s = s.replaceAll("^[a-z]$", "");
		return s;
	}

}
