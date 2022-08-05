package com.sahal.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sahal.web.dao.StudentDao;
import com.sahal.web.model.Student;

/**
 * Servlet implementation class GetStudentController
 */
public class GetStudentController extends HttpServlet {
	
	private StudentDao dao1 = new StudentDao();
	
	public GetStudentController() {
		this.dao1 = new StudentDao();
		
	}
	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	this.doGet(request, response);
	
//		int sid = Integer.parseInt(request.getParameter("sid"));
//		String sname= request.getParameter("sname");
//		int smarks = Integer.parseInt(request.getParameter("smarks"));
//		
//		Student stud = new Student();
//		stud.setSid(sid);
//		stud.setSname(sname);
//		stud.setSmarks(smarks);
//		
//		try {
//			dao1.registerStudent(stud);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
//		rd.forward(request, response);	
	}



	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String action = request.getServletPath();
		
		switch (action) {
		
		case "/getStudent":
			showStudent(request, response);
			break;
		case "/register":
			insertStudent(request, response);
			break;
		case "/delete":
			deleteStudent(request,response);
			break;
		case "/update":
			updateStudent(request, response);
			break;
		case "/back":
			back(request, response);
		default:
			break;
		
			
		}
//	int sid = Integer.parseInt(request.getParameter("sid"));
//	StudentDao dao = new StudentDao();
//	Student s1 = dao.getStudent(sid);
//	
//	
//	request.setAttribute("student", s1);
//	
//	
//	RequestDispatcher rd = request.getRequestDispatcher("showStudent.jsp");
//	rd.forward(request, response);
////	
	
	}
	
	protected void showStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int sid = Integer.parseInt(request.getParameter("sid4"));
		StudentDao dao = new StudentDao();
		Student s1 = dao.getStudent(sid);
		
		
		request.setAttribute("student", s1);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("showStudent.jsp");
		rd.forward(request, response);
		
	}
	
	protected void insertStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		int sid = Integer.parseInt(request.getParameter("sid"));
		String sname= request.getParameter("sname");
		int smarks = Integer.parseInt(request.getParameter("smarks"));
		
		Student stud = new Student();
		stud.setSid(sid);
		stud.setSname(sname);
		stud.setSmarks(smarks);
		
		try {
			dao1.registerStudent(stud);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);	
		
	}
	
	protected void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int sid2 = Integer.parseInt(request.getParameter("sid2"));
		try {
			dao1.deleteStudent(sid2);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);	
		
	}
	
	protected void updateStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int sid = Integer.parseInt(request.getParameter("sid3"));
		String sname= request.getParameter("sname2");
		int smarks = Integer.parseInt(request.getParameter("smarks2"));
		
		Student stud = new Student();
		stud.setSid(sid);
		stud.setSname(sname);
		stud.setSmarks(smarks);
		
		try {
			dao1.updateStudent(stud);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);	
	}
	
	protected void back(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		RequestDispatcher rd = request.getRequestDispatcher("studentregister.jsp");
		rd.forward(request, response);
	
	}
}

	





	
	