public class Utils {

	static String removeAccents(String s) {
		s = s.replaceAll("[à]", "a");
		s = s.replaceAll("[éèëê]", "e");
		s = s.replaceAll("[îï]", "i");
		s = s.replaceAll("[öô]", "o");
		s = s.replaceAll("[ù]", "u");
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
