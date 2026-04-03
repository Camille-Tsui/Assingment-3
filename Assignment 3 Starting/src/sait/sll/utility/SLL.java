package sait.sll.utility;

import java.io.Serializable;

public class SLL implements LinkedListADT, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4207147896437339801L;
	
	private SLLnode element;
	private SLLnode head, tail;
	private int size;
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void append(Object data) {
		
		SLLnode newNode = new SLLnode(data);
		if (head == null) {
			tail = head = newNode;
		}
		else {
			tail.setNext(newNode);
			tail = newNode;
		}
		
		size++;
	}

	@Override
	public void prepend(Object data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(Object data, int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void replace(Object data, int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object retrieve(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object data) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(Object data) {
		// TODO Auto-generated method stub
		return false;
	}

}
