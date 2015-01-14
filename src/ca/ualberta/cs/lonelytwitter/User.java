package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;

public abstract  class User extends Object implements UserLike{ /// there is an implied 'extends object' at the end
	protected String name;

	public String getName() {
		return name;
	}

	public abstract void setName(String name) throws IOException; 
	//	this.name = name; // this refers to the current object
	

	public User(String name) {
		super();  // refers to the superclass
		this.name = name;
		
		/* if we were to change the input 'name' to 
		 * something other than name, 
		 * we would not have to use 'this'
		 * there is an implied this in front of 
		 * class variables 
		 */ 
		
	} 
	public User(){ //if there is not a string provided 
		super(); 
		name = "anonymous";
	}
	
	
}
