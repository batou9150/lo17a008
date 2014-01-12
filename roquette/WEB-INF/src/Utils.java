public class Utils {
	static int coutInsertion = 3;
	static int coutSuppression = 4;
	static int coutSubstitution = 3;
	static int coutInversion = 1;

	static Integer prefixCountLimit = 10;

	static Integer seuilPrefix = 3;
	static Integer seuilDistanceLevenshtein = 6;

	static String removeAccents(String s) {
        s = s.replaceAll("[à]", "a");
        s = s.replaceAll("[éèëê]", "e");
        s = s.replaceAll("[îï]", "i");
        s = s.replaceAll("[öô]", "o");
        s = s.replaceAll("[ù]", "u");
        s = s.replaceAll("[ç]", "c");
		return s;
	}

	static String htmlAccents(String s) {
        s = s.replaceAll("[à]", "a");
        s = s.replaceAll("[é]", "&eacute;");
        s = s.replaceAll("[è]", "&egrave;");
        s = s.replaceAll("[ê]", "&ecirc;");
        s = s.replaceAll("[ë]", "e");
        s = s.replaceAll("[î]", "&icirc;");
        s = s.replaceAll("[ï]", "i");
        s = s.replaceAll("[ö]", "o");
        s = s.replaceAll("[ô]", "&ocirc;");
        s = s.replaceAll("[ù]", "&ugrave;");
        s = s.replaceAll("[ç]", "c");
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