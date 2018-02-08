package edu.goose.model;

public class ExamManager {
	private static ExamManager examManager;

	private ExamManager() {

	}

	public static ExamManager getExamManager() {
		if (examManager == null) {
			examManager = new ExamManager();
		}
		return examManager;
	}
}
