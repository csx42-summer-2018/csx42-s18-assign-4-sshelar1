package maxKVisitors.util;

import java.util.Vector;

public class MyVector implements ADT_Interface, VisitorI{

	private Vector<Integer> integers;
	public MyVector() {
		// TODO Auto-generated constructor stub
		integers = new Vector<Integer>();
	}
	
	@Override
	public void addData(int data) {
		// TODO Auto-generated method stub
		integers.addElement(data);
	}

	@Override
	public void visit(ADT_Interface adt) {
		// TODO Auto-generated method stub
		
	}

	public void accept(VisitorI visitorI) {
		// TODO Auto-generated method stub
		visitorI.visit(this);
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return integers.size();
	}

	

	@Override
	public int getElement(int j) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setElement(int index, int data) {
		// TODO Auto-generated method stub
		integers.setElementAt(data, index);
	}

}
