package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;

public class Tweet extends User {
	
	@Override
	public void setName(String name) throws IOException {
		// TODO Auto-generated method stub
		
	}
	
	public void NewTweet(String user){
		String message = "this is the tweet";
		name = user; 
	}

	public void DeleteTweet(String TweetId){
		//something to delete tweets form the implemented record
		
	}
	
	public void Retweet(String author, String tweetId){
		// add a field for the original poster,
		// post tweet using method for such 
	}
}
