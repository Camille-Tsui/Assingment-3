package sait.sll.utility;

import java.io.Serializable;

import sait.sll.problemdomain.User;

public class SLLnode implements Serializable{
	
	private User user;
	private SLLnode next;

	/**
	 * 
	 */
	private static final long serialVersionUID = -4557626414187024239L;
	
	public SLLnode(User user) {
		this.user = user;
	}
	
	public SLLnode(User user, SLLnode next) {
		this.user = user;
		this.next = next;
	}

	
	public User getUser() {
		return user;
	}

	public SLLnode getNext() {
		return next;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setNext(SLLnode next) {
		this.next = next;
	}
	

}
