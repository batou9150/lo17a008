public class Utils {
	static int coutInsertion = 3;
	static int coutSuppression = 4;
	static int coutSubstitution = 3;
	static int coutInversion = 1;
	
	static Integer prefixCountLimit = 10;
	
	static Integer seuilPrefix = 3;
	static Integer seuilDistanceLevenshtein = 6;

	static String removeAccents(String s) {
		s = s.replaceAll("[א]", "a");
		s = s.replaceAll("[יטכך]", "e");
		s = s.replaceAll("[מן]", "i");
		s = s.replaceAll("[צפ]", "o");
		s = s.replaceAll("[ש]", "u");
		s = s.replaceAll("[ח]", "c");
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