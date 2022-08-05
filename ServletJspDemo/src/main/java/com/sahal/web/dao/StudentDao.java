package com.sahal.web.dao;

import com.sahal.web.model.Student;
import java.sql.*;

public class StudentDao {
	
	
	public int registerStudent(Student stud) throws ClassNotFoundException{
		
		String insert_query = "insert into student (rollno, name, marks) values (?, ?, ?)";
		int result= 0;
		Class.forName("com.mysql.jdbc.Driver");

		try {
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentsdb","root","sahal123");
			PreparedStatement preparedStatement = con.prepareStatement(insert_query);
			preparedStatement.setInt(1, stud.getSid());
			preparedStatement.setString(2, stud.getSname());
			preparedStatement.setInt(3, stud.getSmarks());

			System.out.println(preparedStatement);
			result = preparedStatement.executeUpdate();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return result;
	}
	
	public int updateStudent(Student stud) throws ClassNotFoundException{
		
		String update_query = "update student set name = ?, marks = ? where rollno = ?";
		int result= 0;
		Class.forName("com.mysql.jdbc.Driver");

		try {
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentsdb","root","sahal123");
			PreparedStatement preparedStatement = con.prepareStatement(update_query);
			preparedStatement.setString(1, stud.getSname());
			preparedStatement.setInt(2, stud.getSmarks());
			preparedStatement.setInt(3, stud.getSid());

			System.out.println(preparedStatement);
			result = preparedStatement.executeUpdate();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return result;
	}
	
	public int deleteStudent(int sid) throws ClassNotFoundException{
		
		String delete_query = "delete from student where rollno = ?";
		int result= 0;
		Class.forName("com.mysql.jdbc.Driver");

		try {
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentsdb","root","sahal123");
			PreparedStatement preparedStatement = con.prepareStatement(delete_query);
			preparedStatement.setInt(1, sid);

			System.out.println(preparedStatement);
			result = preparedStatement.executeUpdate();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return result;
	}
	
	public Student getStudent(int sid) {
		
		Student s = new Student();
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentsdb","root","sahal123");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from student where rollno = " + sid);
			if(rs.next()) {
				
				s.setSid(rs.getInt("rollno"));
				s.setSmarks(rs.getInt("marks"));
				s.setSname(rs.getString("name")); 
			}
			
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return s;

	}

}
