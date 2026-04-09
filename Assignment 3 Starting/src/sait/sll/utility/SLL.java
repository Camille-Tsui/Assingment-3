package sait.sll.utility;

import java.io.Serializable;

public class SLL implements LinkedListADT, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4207147896437339801L;
	
	private SLLnode head, tail;
	private int size;
	
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void clear() {
		head = null;
		tail = null;
		size = 0;
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
		SLLnode newNode = new SLLnode(data);
		if (head == null) {
			tail = head = newNode;
		}
		else {
			newNode.setNext(head);
			head = newNode;
		}
		
		size++;
	}
		
	

	@Override
	public void insert(Object data, int index) throws IndexOutOfBoundsException {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		else if (index == 0) {
			prepend(data);
		}
		else if (index == size) {
			append(data);
		}
		else {
			SLLnode temp = head;
			for (int i = 0; i < index - 1; i++ ) {
				temp = temp.getNext();
			}
			SLLnode newNode = new SLLnode(data);
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
			size ++;
		}
		
	}

	@Override
	public void replace(Object data, int index) throws IndexOutOfBoundsException {
		if (index < 0 || index > size - 1) {
			throw new IndexOutOfBoundsException();
		}
		else {
			SLLnode temp = head;
			for (int i = 0; i < index; i++) {
				temp = temp.getNext();
			}
			temp.setData(data);
		}
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void delete(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index > size - 1) {
			throw new IndexOutOfBoundsException();
		}
		else if (index == 0) {
			head = head.getNext();
			size--;
			
			if (size == 0) {
				tail = null;
			}
		}
		else {
			SLLnode temp = head;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.getNext();
			}
			
			SLLnode nodeToDelete = temp.getNext();
			temp.setNext(nodeToDelete.getNext());
			
			if (nodeToDelete == tail) {
				tail = temp;
			}
			
			size--;
		}
	}

	@Override
	public Object retrieve(int index) throws IndexOutOfBoundsException {
		
		if (index < 0 || index > size -1) {
			throw new IndexOutOfBoundsException();
		}
		else {
			SLLnode temp = head;
			
			for (int i = 0; i < index; i++) {
				temp = temp.getNext();
			}
			return temp.getData();
		}
	}

	@Override
	public int indexOf(Object data) {
		SLLnode temp = head;
		int index = 0;
		
		while (temp != null) {
			if (temp.getData() == null && data == null) {
				return index;
			}
			else if (temp.getData() != null && temp.getData().equals(data)) {
				return index;
			}
			temp = temp.getNext();
			index++;
		}
		return -1;
	}

	@Override
	public boolean contains(Object data) {
		SLLnode temp = head;
		
		while (temp != null) {
			if (temp.getData() == null && data == null) {
				return true;
			}
			else if (temp.getData() != null && temp.getData().equals(data)) {
				return true;
			}
			temp = temp.getNext();
		}
		return false;
	}

}
