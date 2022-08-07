package javaUnaryOperators;

public class Example5 {

	public static void main(String[] args) {
		
		int studentSubjectMarks[] = {65, 75, 59, 65, 70, 50};
		
		int subjectsCount = 0;
		
		//System.out.println(studentSubjectMarks.length);
		
		for(int studentSubjectMark: studentSubjectMarks)
		{
			subjectsCount++;
		}

		System.out.println(subjectsCount);
	}

}

