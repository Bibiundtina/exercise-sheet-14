package de.unistuttgart.iste.rss.pse.exercisesheet14.streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsAndFilterExercise {

	public static void main(String[] args) {
		StudentRecord record = new StudentRecord();
		DataGenerator.fillRecordWithTestData(record);
		DataGenerator.fillRecordWithRealLifePSEMarks(record);

		getStudentName(record);
		getStudentsNameOlderThan(record, 23);
		getNumberOfStudentsOlderThan(record, 23);
		getStudentsFaildExam(record, 25, "PSE");

	}

	private static void getStudentName(StudentRecord record) {
	}

	private static void getNumberOfStudentsOlderThan(StudentRecord record, int olderThan) {
	}

	private static void getStudentsNameOlderThan(StudentRecord record, int olderThan) {
	}

	private static void getStudentsFaildExam(StudentRecord record, int olderThan, String exam) {

	}

}
