import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainIndex {

	static int coutInsertion = 60;
	static int coutSuppression = 60;
	static int coutSubstitution = 60;
	static int coutInversion = 0;

	public static void main(String[] args) {
		Lexic lexic = new Lexic();
		// System.out.println(lexic.getLevenshteinProximity("abat", "abandon"));
		// String[] retour = lexic.getLevenshteinLemme("abat");
		// for (int i = 0; i < retour.length; i++) {
		// System.out.println(i + " : " + retour[i]);
		// }
		// System.out.println("Done");
		BufferedReader br = null;
		String chaine = null;
		do {
			try {
				try {
					br = new BufferedReader(new InputStreamReader(System.in));
					System.out.print("saisie : ");
					chaine = br.readLine();
					if (!chaine.equals(":quit")) {
						String[] results = lexic.search(chaine);
						if (results == null) {
							System.out
									.println("Aucun résultat n'a été trouvé!");
						} else {
							for (int i = 0; i < results.length; i++) {
								System.out.println(i + " : " + results[i]);
							}
						}
					}
				} catch (EOFException e) {
					br.close();
				}
			} catch (IOException e) {
				System.out.println("IO Exception");
			}
		} while (!chaine.equals(":quit"));
	}
}
