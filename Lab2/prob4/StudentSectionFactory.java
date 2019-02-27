package lesson2.labs.prob4;

import java.util.*;

public class StudentSectionFactory {
	

	public Section createSection( String courseName, int secNum) {
		
		return new Section(courseName, secNum);
	}
	public Student createStudent(String id, String name) {
		
		return new Student(id,name);	
	}
	public void newTranscriptEntry(Student s, Section sect, String grade) {
		
		TranscriptEntry entry = new TranscriptEntry(s,sect,grade);
		
		s.getGrades().add(entry);
		sect.getGradeSheet().add(entry);
	
	}
	

	

}
