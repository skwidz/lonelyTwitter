package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.ArrayList;

public class Followers extends User  {

	@Override
	public void setName(String name) throws IOException {
		// TODO Auto-generated method stub
		
		
	}
	public ArrayList<User> GetFollowers(String user){
		ArrayList<User> followers = new ArrayList<User>();
		//code here to get users
		return followers; 
		
	}
	
	public ArrayList<User> GetFollowing(String user){
		ArrayList<User> following = new ArrayList<User>();
		//code here to get the users
		
		return following;
	}
	
	public void SetFollow(String user, String Follow){
	
		
		//add the follow user to the list of users being followed
	}
	public void RemoveFollow(String user, String follow){
		//remove the user from the list of followed users. 
	}
}

