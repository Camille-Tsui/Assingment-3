package sait.sll.utility;

import java.io.Serializable;

import sait.sll.problemdomain.User;

public class SLLnode implements Serializable{
	
	private Object data;
	private SLLnode next;

	/**
	 * 
	 */
	private static final long serialVersionUID = -4557626414187024239L;
	
	public SLLnode(Object data) {
		this.data = data;
	}
	
	public SLLnode(Object data, SLLnode next) {
		this.data = data;
		this.next = next;
	}

	
	public Object getData() {
		return data;
	}

	public SLLnode getNext() {
		return next;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public void setNext(SLLnode next) {
		this.next = next;
	}
	

}
