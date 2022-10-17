package br.com.masters3.controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.masters3.dao.DataSource;


@WebServlet("/admin")
public class AdminServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, 
             HttpServletResponse response) 
          throws IOException, ServletException {

		try {
//			DataSource dataSource = new DataSource();
//			dataSource.getConnection().close();
//			HotelDAO hotelDAO = new HotelDAO(dataSource);
//
//			ArrayList<Hotel> hotels = hotelDAO.getAll();
//			request.setAttribute("Hotels", hotels);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/admin.jsp");
			dispatcher.forward(request, response);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
