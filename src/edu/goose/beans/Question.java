package edu.goose.beans;

public class Question {

	// Variables
	private int 		id;
	private String 		text;
	private Answer[] 	answers;
	
	// Contructors
	public Question(int id, String text, Answer[] answers) {
		super();
		this.id = id;
		this.text = text;
		this.answers = answers;
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
	
	public Answer[] getAnswers() {
		return answers;
	}
	
	public void setAnswers(Answer[] answers) {
		this.answers = answers;
	}
}