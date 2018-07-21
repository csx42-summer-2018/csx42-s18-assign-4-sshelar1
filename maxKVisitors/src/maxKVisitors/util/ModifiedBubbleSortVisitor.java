package maxKVisitors.util;

public class ModifiedBubbleSortVisitor implements VisitorI{

	@Override
	public void visit(ADT_Interface adt) {
		// TODO Auto-generated method stub
		bubbleSort(adt);
	}

	private void bubbleSort(ADT_Interface adt) {
		// TODO Auto-generated method stub
		int size = adt.getSize();
		for (int i = 0; i < size-1; i++) {
			for (int j = 0; j < size-i-1; j++) {
				if (adt.getElement(j) > adt.getElement(j+1)) {
					int temp = adt.getElement(j);
					adt.setElement(j, adt.getElement(j+1));
					adt.setElement(j+1, temp);
				}
			}
		}
	}

}
