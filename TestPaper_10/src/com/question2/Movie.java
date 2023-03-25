package com.question2;

import java.util.List;

class Movie {
	private int movieId;
	private String movieName;
	private List<String> actors;

	public Movie(int movieId, String movieName, List<String> actors) {
		this.movieId = movieId;
		this.movieName = movieName;
		this.actors = actors;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public List<String> getActors() {
		return actors;
	}

	public void setActors(List<String> actors) {
		this.actors = actors;
	}
}
