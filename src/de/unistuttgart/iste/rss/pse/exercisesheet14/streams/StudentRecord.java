package de.unistuttgart.iste.rss.pse.exercisesheet14.streams;

import java.util.HashSet;
import java.util.Set;

public class StudentRecord {

	private final Set<Student> students;

	public StudentRecord() {
		this.students = new HashSet<Student>();
	}

	public void addStudent(final Student student) {
		students.add(student);
	}

	public Set<Student> getAllStudents() {
		return students;
	}

}
