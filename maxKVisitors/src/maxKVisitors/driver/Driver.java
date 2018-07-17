package maxKVisitors.driver;

import maxKVisitors.util.FileProcessor;
import maxKVisitors.util.MyLogger;
import maxKVisitors.util.Results;

public class Driver{

	
	public static void main(String[] args) {
		FileProcessor fileProcessorInputFile = null, fileProcessorDeleteFile=null;
		Results results = null, resultBackUp1= null, resultBackUp2=null;
		int debugLevel=-1;
		String line = null;
		/**
		 * Checking for valid arguments i.e 3
		 */
		if (args.length != 6) {
			System.out.println("Invaid number of arguments");
			System.exit(1);
		}
		
		/**
		 * Checking for valid debug level
		 */
		try {
			debugLevel = Integer.parseInt(args[5]);
			MyLogger.setDebugValue(debugLevel);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Invalid debug level");
			System.exit(1);
		}
		
		/**
		 * Checks if the debug level is in range or not
		 */
		if (debugLevel < 0 || debugLevel > 4) {
			System.out.println("Debug value out of range");
			System.exit(1);
		}
		
		/**
		 * Checking for empty input file
		 */
		
		fileProcessorInputFile = new FileProcessor(args[0]);
	}
	
}