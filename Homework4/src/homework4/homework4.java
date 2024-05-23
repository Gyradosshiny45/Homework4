package homework4;

import java.util.Scanner;

public class homework4 {
	public static void main (String [] args) {
		Scanner scnr = new Scanner (System.in);
		
		float maxGrades = Float.NEGATIVE_INFINITY;
		float minGrades = Float.POSITIVE_INFINITY;
		float sum = 0;
		int numGrades = 10;
	
		for (int i=0;i<numGrades;i++) {
			System.out.print("Enter grade " + (i+ 1) + "/"+numGrades +": ");
			float grade = scnr.nextFloat();
			sum += grade;
			if (grade > maxGrades) {
				maxGrades = grade;
			}
			if(grade< minGrades) {
				minGrades = grade;
			}
		}
		
		
		System.out.println("Grade average :" + (sum /numGrades)); 
		System.out.println("Max Grade is:" + maxGrades);
		System.out.println("Min Grade is:" + minGrades);
		scnr.close();
	}
}

