package assignment;

import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrintQ5 {
	private static final Logger LOGGER = Logger.getLogger(PrintQ5.class.getName());

	public static void main(String[] args) {

		Handler fileHandler = null;
		try {

			// Creating fileHandler
			fileHandler = new FileHandler("./PrintQ5.log", true);

			// Assigning handlers to LOGGER object
			LOGGER.addHandler(fileHandler);
			
			// Setting levels to handlers and LOGGER
			fileHandler.setLevel(Level.ALL);
			LOGGER.setLevel(Level.ALL);

			// print fibonacci with iteration
			printFibonacciIterative(50);

			// print fibonacci with recursion
			for (int i = 0; i < 50; i++) {
				System.out.print(printFibonacciRecursive(i)+" ");
			}

			LOGGER.log(Level.FINE, "Finer logged");

		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error occured", e);
		}

	}

	private static void printFibonacciIterative(int n) {
		long a = 1;
		long b = 1;
		long c = 0;
		System.out.print("1 1 ");
		for (int i = 2; i < n; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;

		}
		System.out.println("\n");
	}

	private static long printFibonacciRecursive(int n) {
		if (n <= 1)
			return 1;
		return printFibonacciRecursive(n - 1) + printFibonacciRecursive(n - 2);
	}
}
