package com.syntax.class18;

public class Task02 {
	/*
	 * /Write a java program of Class Students that takes students name and 3
	 * subject grades. Inside your class also have a method to Calculate Average
	 * Grade. Test Student class for 5 different students with different marks. Your
	 * program should print an average mark of each students name. NOTE: please use
	 * different names for instance and local variables.
	 */
	String StudentsName;
	int gradeA;
	int gradeB;
	int gradeC;
	int gradeD;
	int gradeE;

	void Averge() {
		int average = (gradeA + gradeB + gradeC + gradeD + gradeE) / 5;
		System.out.println("student " + StudentsName + " Average grade is " + average);
	}

	Task02(String newName, int newgradeA, int newgradeB, int newgradeC, int newgradeD, int newgradeE) {
		StudentsName = newName;
		gradeA = newgradeA;
		gradeB = newgradeB;
		gradeC = newgradeC;
		gradeD = newgradeD;
		gradeE = newgradeE;
	}

	public static void main(String[] args) {
		Task02 st1 = new Task02("Ahmet", 100, 80, 60, 70, 90);
		Task02 st2 = new Task02("Mahady", 100, 90, 80, 75, 95);
		Task02 st3 = new Task02("faisl", 100, 80, 60, 70, 90);
		Task02 st4 = new Task02("Saif", 100, 90, 80, 85, 95);
		Task02 st5 = new Task02("Esmat", 100, 90, 80, 70, 95);

		st1.Averge();
		st2.Averge();
		st3.Averge();
		st4.Averge();
		st5.Averge();
	}
}