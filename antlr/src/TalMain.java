import java.io.*;
import java.util.Scanner;
//import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

public class TalMain {

	/**
	 * Point d'entré du programme Propose à l'utilisateur de saisir une demande
	 * à traduire en SQL jusqu'a la saisie d'un caractère spéciale.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		Lexic lexic = new Lexic();
		Cleaner cleaner = new Cleaner(lexic);

		// test(cleaner); // Test tout le corpus de questions

		String s;
		do {
			System.out.print("Texte : ");
			s = scanner.nextLine();
			System.out.println(toSQLQuery(s, cleaner));
		} while (!s.equals("*"));

		scanner.close();
	}

	/**
	 * Permet de tester tout le corpus de questions
	 */
	public static void test(Cleaner cleaner) {
		int countOK = 0, countAll = 0;
		BufferedReader br = null;
		String chaine;
		String result;
		try {
			try {
				br = new BufferedReader(new FileReader(
						"../antlr/ressources/corpusQuestionA09.txt"));
				while ((chaine = br.readLine()) != null) {
					result = toSQLQuery(chaine, cleaner);
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
	 * Permet de traiter une requête dans la language native Et retourne la
	 * requâte SQL correspondante
	 * 
	 * @param s
	 *            La requête dans la language native
	 * @return La requâte SQL correspondante
	 */
	public static String toSQLQuery(String s, Cleaner cleaner) {
		String result = null;

		s = cleaner.cleanString(s);
		// System.out.println(s);

		try {
			GrammarLexer lexer = new GrammarLexer(new ANTLRReaderStream(
					new StringReader(s)));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			GrammarParser parser = new GrammarParser(tokens);

			result = parser.listerequetes();
			result = result.replaceAll("\t", "");
			result = result.trim();
			result = result.replaceAll("( )+", " ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return result;
	}
}
