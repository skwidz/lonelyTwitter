package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;

public class Viewer extends User {
	public void setName(String name) throws IOException { 
		if (name.length() > 8){
			throw new IOException("Too Long");
		}
		this.name = name; // this refers to the current object
	}
}
