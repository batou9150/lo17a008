import java.io.*;
import java.util.Scanner;
//import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

public class TalMain {
	static Scanner scanner;
	static Lexic lexic;
	static Cleaner cleaner;

	/**
	 * Point d'entr� du programme Propose � l'utilisateur de saisir une demande
	 * � traduire en SQL jusqu'a la saisie d'un caract�re sp�ciale.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		scanner = new Scanner(System.in);
		lexic = new Lexic();
		cleaner = new Cleaner(lexic);

		// test(); // Test tout le corpus de questions

		String s;
		do {
			System.out.print("Texte : ");
			s = scanner.nextLine();
			System.out.println(toSQLQuery(s));
		} while (!s.equals("*"));

		scanner.close();
	}

	/**
	 * Permet de tester tout le corpus de questions
	 */
	public static void test() {
		int countOK = 0, countAll = 0;
		BufferedReader br = null;
		String chaine;
		String result;
		try {
			try {
				br = new BufferedReader(new FileReader(
						"ressources/corpusQuestionA09.txt"));
				while ((chaine = br.readLine()) != null) {
					result = toSQLQuery(chaine);
					countAll++;
					System.out.println(countAll + " : " + result);
					if (result != null && result != "select distinct") {
						System.out.println(chaine);
						countOK++;
					}
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
		System.out.println(100 * countOK / countAll);
	}

	/**
	 * Permet de traiter une requ�te dans la language native Et retourne la
	 * requ�te SQL correspondante
	 * 
	 * @param s
	 *            La requ�te dans la language native
	 * @return La requ�te SQL correspondante
	 */
	public static String toSQLQuery(String s) {
		String result = null;

		s = cleaner.cleanString(s);
		// System.out.println(s);

		try {
			GrammarLexer lexer = new GrammarLexer(new ANTLRReaderStream(
					new StringReader(s)));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			GrammarParser parser = new GrammarParser(tokens);

			result = parser.listerequetes();
			result = result.replaceAll("[\\(\\)\t]", "");
			result = result.trim();
			result = result.replaceAll("( )+", " ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return result;
	}
}
