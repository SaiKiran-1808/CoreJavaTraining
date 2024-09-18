package com.evergent.corejava.studentapplicationdao;

import java.sql.Connection;

import com.mysql.jdbc.PreparedStatement;

public class StudentDAO {

	public int addBook(StudentBean studentBean) {
		try {
//			ArrayList<Object> studentList = new ArrayList<>();
//			studentList.add(studentBean.getStudentid());
//			studentList.add(studentBean.getName());
//			studentList.add(studentBean.getMarks());
//			studentList.add(studentBean.getGrade());
//
//			System.out.println(studentList);
//
//			System.out.println("Student ID :" + studentBean.getStudentid());
//			System.out.println("Student Name :" + studentBean.getName());
//			System.out.println("Student Marks :" + studentBean.getMarks());
//			System.out.println("Student Grade :" + studentBean.getGrade());
//

			Connection con = DB.getConnection();
			String query = "Insert into student values(?,?,?,?)";
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(query);
			
			ps.setInt(1, studentBean.getStudentid());
			ps.setString(2, studentBean.getName());
			ps.setDouble(3, studentBean.getMarks());
			ps.setString(4, studentBean.getGrade());
			
			int t = ps.executeUpdate();

			return t;

		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}

}
