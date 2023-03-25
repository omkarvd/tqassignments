/*Q2. Consider an ArrayList of Movie  
Movie has (int movieid, String  moviename, List<String> actor)
Find “Amitabh bachchan has acted in how many movies*/

package com.question2;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> actor = new ArrayList<>();
		actor.add("Amitabh bachhan");
		// actor.add("Amitabh bachhan");
		// actor.add("Amitabh bachhan");

		List<Movie> movies = new ArrayList<>();

		movies.add(new Movie(1, "Sholay", actor));
		movies.add(new Movie(2, "Deewar", actor));
		movies.add(new Movie(3, "Zanjeer", actor));

		int amitabhMovies = 0;

		for (Movie movie : movies) {
			if (movie.getActors().contains("Amitabh bachhan")) {
				amitabhMovies++;
			}
		}

		System.out.println("Amitabh Bachchan has acted in " + amitabhMovies + " movies.");
	}
}
