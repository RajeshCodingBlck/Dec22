package Graph1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {

	int rollNumber;
	int marks;

	Student(int rollNumber, int marks) {
		this.rollNumber = rollNumber;
		this.marks = marks;
	}

}

class cmp2 implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub

		if (s1.marks > s2.marks) {
			return 1;
		} else {
			return -1;
		}
	}

}
class cmp implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub

		if (o1 < o2) {
			return 1;
		} else {
			return -1;
		}
	}

}

public class CustomizedSorting {

	
	public static void display(ArrayList<Student> arr) {
		
		
		for(Student s : arr) {
			System.out.println(s.rollNumber+ " "+ s.marks);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> arr = new ArrayList();

		arr.add(new Student(1, 100));
		arr.add(new Student(2, 45));
		arr.add(new Student(3, 102));

		display(arr);
		System.out.println();
		Collections.sort(arr, new cmp2());
		display(arr);

//		ArrayList<Integer> arr= new ArrayList();
//		
//		arr.add(100);
//		arr.add(-2);
//		arr.add(300);
//		
//		System.out.println(arr);
//		Collections.sort(arr,  new cmp());
//		System.out.println(arr);

	}

}
