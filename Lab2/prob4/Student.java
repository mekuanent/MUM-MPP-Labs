package lesson2.labs.prob4;

import java.util.*;

public class Student {
	String name;
	String id;
	private List<TranscriptEntry> grades;
	

	public Transcript getTranscript() {
		return new Transcript(grades, this);
		
	}
	
	public List<TranscriptEntry> getGrades() {
		return grades;
	}
	
	public void setGrades(List<TranscriptEntry> grades) {
		this.grades = grades;
	}
	
	public Student(String name, String id) {		
		grades = new ArrayList<TranscriptEntry>();
		this.name = name;
		this.id = id;
	}
}
