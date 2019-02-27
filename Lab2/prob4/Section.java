package lesson2.labs.prob4;

import java.util.ArrayList;
import java.util.List;

public class Section {
	String courseName;
	int sectionNumber;
	private List<TranscriptEntry> gradeSheet;
	
	public Section(String courseName, int sectionNumber ) {
		gradeSheet = new ArrayList<TranscriptEntry>();
		this.courseName = courseName;
		this.sectionNumber = sectionNumber;
	}
	
	public List<TranscriptEntry> getGradeSheet() {
		return gradeSheet;
	}
	
	public void setGradeSheet(List<TranscriptEntry> gradeSheet) {
		this.gradeSheet = gradeSheet;
	}
	
}
