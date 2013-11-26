import java.io.*;
import java.util.Scanner;
//import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

public class TalMain {

	public static void main(String args[]) {
		Lexic lexic = new Lexic();
		Cleaner cleaner = new Cleaner(lexic);
		Scanner scanner = new Scanner(System.in);

		System.out.print("Texte : ");
		String s = scanner.nextLine();
		s = cleaner.cleanString(s);
		System.out.println(s);
		while (!s.equals("*")) {
			try {
				Tal_simpleLexer lexer = new Tal_simpleLexer(
						new ANTLRReaderStream(new StringReader(s)));
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				Tal_simpleParser parser = new Tal_simpleParser(tokens);
				String arbre = parser.listephrases();
				System.out.println(arbre);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.print("Texte : ");
			s = scanner.nextLine();
			s = cleaner.cleanString(s);
			System.out.println(s);
		}
		scanner.close();
	}
}
