package chirp.client;

import java.util.stream.Collectors;

import chirp.client.api.DefaultApi;

public class Main {
	public static void main(String[] args) throws ApiException, InterruptedException {
		DefaultApi api = new DefaultApi();

		// TODO: Implement automated Chirp Client
		
		// For example, this prints all followers of the user with ID 10:
		System.out.println(api.getFollowers(10).stream()
				.map(f -> f.toString())
				.collect(Collectors.joining(", ")));
	}
}
