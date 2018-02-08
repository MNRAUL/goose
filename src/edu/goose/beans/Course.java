package edu.goose.beans;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Course {

	// Variables
	private int 			id;
	private String 			name;
	private String 			description;
	private LocalDate 	initialDate;
	private LocalDate 	endDate;

	// Contructors
	public Course(int id, String name, String description, LocalDate initialDate, LocalDate endDate) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.initialDate = initialDate;
		this.endDate = endDate;
	}

	// Getters / Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getInitialDate() {
		return initialDate;
	}

	public void setInitialDate(LocalDate initialDate) {
		this.initialDate = initialDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
}
