package de.unistuttgart.iste.rss.pse.exercisesheet14.streams;


public class StreamsAndFilterExercise {

	public static void main(String[] args) {
		StudentRecord record = new StudentRecord();
		DataGenerator.fillRecordWithTestData(record);
		DataGenerator.fillRecordWithRealLifePSEMarks(record);

//		getStudentName(record);
//		getStudentsNameOlderThan(record, 23);
//		getNumberOfStudentsOlderThan(record, 23);
		getStudentsFaildExam(record, 25, "PSE");

	}

	private static void getStudentName(StudentRecord record) {
		record.getAllStudents().stream().forEach(n -> System.out.println(n.getName()));	
		
		record.getAllStudents().stream().map(Student::getName).forEach(System.out::println);
	}

	private static void getNumberOfStudentsOlderThan(StudentRecord record, int olderThan) {
//		int numberOfStudentOverX
//		= record.getAllStudents().stream().filter(n -> n.getAge()>= 15).sum();
//		
//		System.out.println(numberOfStundentOverX);
		
		int numberOfStudentOverX
		= record.getAllStudents().stream().filter(n -> n.getAge()> olderThan).mapToInt(n -> 1).sum();
		
		System.out.println(numberOfStudentOverX);
	}

	private static void getStudentsNameOlderThan(StudentRecord record, int olderThan) {
		record.getAllStudents().stream().filter(n -> n.getAge()>olderThan).map(Student::getName).forEach(System.out::println);
	}

	private static void getStudentsFaildExam(StudentRecord record, int olderThan, String exam) {
		record.getAllStudents().stream().filter(n -> n.getAge() > olderThan).filter(n -> n.getExam(exam).getMark() <= 4).map(Student::getName).forEach(System.out::println);
		
	}

}
