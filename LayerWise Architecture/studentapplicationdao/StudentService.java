package com.evergent.corejava.studentapplicationdao;

public class StudentService {

	public int addStudentService(int studentId, String name, float marks) {
		String grade = "";

		if (marks <= 60) {
			grade = "C";
		} else if (marks <= 80) {
			grade = "B";
		} else {
			grade = "A";
		}

		StudentDAO bookDAO = new StudentDAO();
		StudentBean studentBean = new StudentBean();
		studentBean.setStudentid(studentId);
		studentBean.setName(name);
		studentBean.setMarks(marks);
		studentBean.setGrade(grade);

		int updateResult = bookDAO.addBook(studentBean);

		return updateResult;
	}
}
