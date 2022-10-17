package br.com.masters3.controller;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.masters3.dao.DataSource;
import br.com.masters3.dao.HotelDAO;
import br.com.masters3.model.Hotel;

@WebServlet("/home")
public class IndexServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, 
             HttpServletResponse response) 
          throws IOException, ServletException {

		try {
			DataSource dataSource = new DataSource();
			HotelDAO hotelDAO = new HotelDAO(dataSource);

			ArrayList<Hotel> hotels = hotelDAO.getAll();
			dataSource.getConnection().close();
			request.setAttribute("Hotels", hotels);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
			dispatcher.forward(request, response);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Deu ruim");
		}
		
	}

}
