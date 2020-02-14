package assignment;




	import java.io.IOException;
	import java.util.logging.ConsoleHandler;
	import java.util.logging.FileHandler;
	import java.util.logging.Handler;
	import java.util.logging.Level;
	import java.util.logging.Logger;

	public class temp {

		private static final Logger LOGGER = Logger.getLogger(temp.class.getName());
		public static void main(String[] args) {

			//Handler consoleHandler = null;
			Handler fileHandler  = null;
			try{
				//Creating consoleHandler and fileHandler
			//	consoleHandler = new ConsoleHandler();
				fileHandler  = new FileHandler("./javacodegeeks.log",true);
				
				//Assigning handlers to LOGGER object
				//LOGGER.addHandler(consoleHandler);
				LOGGER.addHandler(fileHandler);
				
				//Setting levels to handlers and LOGGER
			//	consoleHandler.setLevel(Level.ALL);
				fileHandler.setLevel(Level.ALL);
				LOGGER.setLevel(Level.ALL);
				
				LOGGER.config("Configuration done.");
				//int i[]=new int[]{1,2,3};
				try {
					int i=2/0;
					System.out.println(i);
				} catch (Exception e) {
					LOGGER.log(Level.SEVERE, "Error occur in FileHandler.", e);
				}
			
				//Console handler removed
				//LOGGER.removeHandler(consoleHandler);
				
				LOGGER.log(Level.FINE, "Finer logged");
			}catch(Exception exception){
				LOGGER.log(Level.SEVERE, "Error occur in FileHandler.", exception);
			}
			
			LOGGER.finer("Finest example on LOGGER handler completed.");
			
		}

	}
