package assignment;

import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrintQ6 {
	private static final Logger LOGGER = Logger.getLogger(PrintQ6.class.getName());

	public static void main(String[] args) {

		Handler fileHandler = null;
		try {

			// Creating fileHandler
			fileHandler = new FileHandler("./PrintQ6.log", true);

			// Assigning handlers to LOGGER object
			LOGGER.addHandler(fileHandler);

			// Setting levels to handlers and LOGGER
			fileHandler.setLevel(Level.ALL);
			LOGGER.setLevel(Level.ALL);

			//LOGGER.config("Configuration done.");
				        
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			tablePrint(n);
	        
	        
			LOGGER.log(Level.FINE, "Finer logged");

		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error occured", e);
		}

	}

	private static void tablePrint(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n+"x"+i+"="+(i*n));
		}
	}

	
}
