package assignment;

import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrintQ4 {
	private static final Logger LOGGER = Logger.getLogger(PrintQ4.class.getName());

	public static void main(String[] args) {

		Handler fileHandler = null;
		try {

			// Creating fileHandler
			fileHandler = new FileHandler("./PrintQ4.log", true);

			// Assigning handlers to LOGGER object
			LOGGER.addHandler(fileHandler);

			// Setting levels to handlers and LOGGER
			fileHandler.setLevel(Level.ALL);
			LOGGER.setLevel(Level.ALL);

			//LOGGER.config("Configuration done.");
			
	        LOGGER.warning("Can cause ArrayIndexOutOfBoundsException");

			int arr[] = new int[100];
			for (int i = 0; i < 100; i++) {
				arr[i] = (int) (Math.random() * 100);
			}

			// Iterate and print the array using for i = 0 style of loop
			for (int i = 0; i < 100; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println("\n");

			// Iterate and print the array using for each style of loop
			for (int i : arr) {
				System.out.print(arr[i] + " ");

			}
			LOGGER.log(Level.FINE, "Finer logged");

		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error occur in FileHandler.", e);
		}

	}
}
