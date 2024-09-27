package org.HashSet;
import java.util.Set;
import java.util.HashSet;


public class HashSet2 {

	public static void main(String[] args) {
		Set<Student> student = new HashSet();
		student.add(new Student("sushant", 11));
		student.add(new Student("pratik", 20));
		student.add(new Student("duggu", 15));
		student.add(new Student("sushant", 11));

		System.out.println(student);
	}

}