package edu.goose.beans;

public class Exam {

	// Variables
	private int 	id;
	private String 	text;
	private int 	time;

	// Constructors
	public Exam(int id, String text, int time) {
		super();
		this.id = id;
		this.text = text;
		this.time = time;
	}

	// Getters / Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
}