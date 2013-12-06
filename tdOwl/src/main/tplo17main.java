package main;

import java.io.FileInputStream;

import org.apache.jena.larq.IndexBuilderString;
import org.apache.jena.larq.IndexLARQ;
import org.apache.jena.larq.LARQ;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.query.ResultSetFormatter;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

public class tplo17main {
	public static String ontoFilename = "documents/lo17.owl";
	public static String ontoFilenameN3 = "documents/lo17.n3";
	public static String kbUTF8Filename = "documents/kblo17-utf8.owl";
	public static Logger logger = Logger.getLogger("com.hp");

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BasicConfigurator.configure();
		logger.setLevel(Level.INFO);
//		q2();
		q3();
		q4();

	}

	// Réponse question 2
	public static void q2() {
		Model model = null;
		model = ModelFactory.createDefaultModel();
		try {
			// build a model
			model.read(new FileInputStream(ontoFilename), "RDF/XML");
			query2_a(model);
			query2_b(model);
			query2_c(model);
			query2_d(model);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	// Question 2 a
	public static void query2_a(Model model) {
		Query q1 = readFileQuery("queries/query_concept.sparql");
		System.out.println("===== Concepts =====");
		runQuery(q1, model);
	}

	// Question 2 b
	public static void query2_b(Model model) {
		Query q1 = readFileQuery("queries/query_relation.sparql");
		System.out.println("===== Relation =====");
		runQuery(q1, model);
	}

	// Question 2 c
	public static void query2_c(Model model) {
		Query q1 = readFileQuery("queries/query_attribut.sparql");
		System.out.println("===== Attribut =====");
		runQuery(q1, model);
	}

	// Question 2 d
	public static void query2_d(Model model) {
		Query q1 = readFileQuery("queries/query_d.sparql");
		System.out.println("===== Domaines liés à hasTitreArticle & hasAuteur =====");
		runQuery(q1, model);
	}

	// Réponse question 3
	public static void q3() {
		Model model = null;
		model = ModelFactory.createDefaultModel();
		try {
			// build a model
			model.read(new FileInputStream(kbUTF8Filename), "RDF/XML");
			query3_a(model);
			query3_b(model);
			query3_c(model);
			query3_d(model);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	// Question 3 a
	public static void query3_a(Model model) {
		Query q1 = readFileQuery("queries/query_3a.sparql");
		System.out.println("===== Auteur des UNES =====");
		runQuery(q1, model);
	}
	
	// Question 3 b
	public static void query3_b(Model model) {
		Query q1 = readFileQuery("queries/query_3b.sparql");
		System.out.println("===== Thème des gros titres =====");
		runQuery(q1, model);
	}

	// Question 3 c
	public static void query3_c(Model model) {
		Query q1 = readFileQuery("queries/query_3c.sparql");
		System.out.println("===== Résumé Canada =====");
		runQuery(q1, model);
	}
	// Question 3 d
	public static void query3_d(Model model) {
		Query q1 = readFileQuery("queries/query_3d.sparql");
		System.out.println("===== Résumé 2003 à 2009 =====");
		runQuery(q1, model);
	}

	// Réponse question 4
	public static void q4() {
		Model model = null;
		model = ModelFactory.createDefaultModel();
		try {
			// build a model
			model.read(new FileInputStream(kbUTF8Filename), "RDF/XML");
//			query4_a(model);
//			query4_b(model);
//			query4_c(model);
//			query4_d(model);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	// return a query from a file
	public static Query readFileQuery(String filename) {
		return QueryFactory.read(filename);
	}

	// return a query from a string
	public static Query readStringQuery(String queryString) {
		return QueryFactory.create(queryString);
	}

	// run a query on a model
	public static void runQuery(Query q, Model model) {
		QueryExecution queryExecution = QueryExecutionFactory.create(q, model);
		ResultSet r = queryExecution.execSelect();
		ResultSetFormatter.out(System.out, r);
		queryExecution.close();
	}

	// returns the index based on all model literals
	public static IndexLARQ getWholeStringIndex(Model model) {
		IndexBuilderString larqBuilder = new IndexBuilderString();
		larqBuilder.indexStatements(model.listStatements());
		larqBuilder.closeWriter();
		model.unregister(larqBuilder);
		return larqBuilder.getIndex();
	}

	// run a query using a LARQ index
	public static void queryIndex(Query q, IndexLARQ index, Model model) {
		QueryExecution queryExecution = QueryExecutionFactory.create(q, model);
		LARQ.setDefaultIndex(queryExecution.getContext(), index);
		ResultSet r = queryExecution.execSelect();
		ResultSetFormatter.out(System.out, r);
		queryExecution.close();
	}
}
