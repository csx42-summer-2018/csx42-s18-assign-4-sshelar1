package maxKVisitors.driver;

import maxKVisitors.util.FileProcessor;
import maxKVisitors.util.MaxHeapVisitor;
import maxKVisitors.util.ModifiedBubbleSortVisitor;
import maxKVisitors.util.MyArray;
import maxKVisitors.util.MyLogger;
import maxKVisitors.util.MyVector;
import maxKVisitors.util.PopulateVisitor;
import maxKVisitors.util.Results;

public class Driver{

	
	public static void main(String[] args) {
		FileProcessor fileProcessor = null;
		Results results = null;
		int debugLevel=-1;
		/**
		 * Checking for valid arguments i.e 3
		 */
		if (args.length != 3) {
			System.out.println("Invaid number of arguments");
			System.exit(1);
		}
		
		/**
		 * Checking for valid debug level
		 */
		try {
			debugLevel = Integer.parseInt(args[2]);
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
		
		fileProcessor = new FileProcessor(args[0]);
		results = new Results(args[1]);
		
		MyVector myVector_maxHeap = new MyVector();
		MyArray myArray_maxHeap = new MyArray();
		PopulateVisitor populateVisitor = new PopulateVisitor(fileProcessor);
		ModifiedBubbleSortVisitor bubbleSortVisitor = new ModifiedBubbleSortVisitor();

		myVector_maxHeap.accept(populateVisitor);
		myArray_maxHeap.accept(populateVisitor);
		fileProcessor.close();
		myVector_maxHeap.accept(bubbleSortVisitor);
		myArray_maxHeap.accept(bubbleSortVisitor);
		
		fileProcessor = new FileProcessor(args[0]);
		MyVector myVector_modifiedBubbleSort = new MyVector();
		MyArray myArray_modifiedBubbleSort = new MyArray();
		MaxHeapVisitor heapVisitor = new MaxHeapVisitor(fileProcessor);
		
		myVector_modifiedBubbleSort.accept(heapVisitor);
		myArray_modifiedBubbleSort.accept(heapVisitor);
		
		
	}
	
}