package chirp.client;

import java.util.Random;

import chirp.client.api.DefaultApi;
import chirp.client.model.Timeline;
import chirp.client.model.Tweet;

public class Main {
	public static void main(String[] args) throws ApiException, InterruptedException {
		DefaultApi api = new DefaultApi();
		Random r = new Random();
		
		while(true){
			Tweet newTweet = new Tweet();
			newTweet.setContent("It is " + System.currentTimeMillis() / 1000 + " in Unix Time.");
			newTweet.setOriginatorId(r.nextInt(2000));
			
			System.out.println("Post:");
			
			System.out.println(newTweet);
			
			api.postTweet(newTweet);
			
			System.out.println("Timeline:");
			
			Timeline timeline = api.getTimeline(1);
			timeline.getTweets().forEach(tweet -> {
				System.out.println(tweet);
			});
			
			Thread.sleep(3000);
		}
	}
}
