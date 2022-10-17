package br.com.masters3.controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.masters3.dao.DataSource;
import br.com.masters3.dao.HotelDAO;
import br.com.masters3.model.Hotel;

@WebServlet("/hotel")
public class HotelServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, 
             HttpServletResponse response) 
          throws IOException, ServletException {
		
		try {
			
			String id = request.getParameter("id");
			int index = Integer.parseInt(id);
			
			
			if (index > 0) {				
				DataSource dataSource = new DataSource();
				HotelDAO hotelDAO = new HotelDAO(dataSource);
				Hotel hotel = hotelDAO.read(index);
				dataSource.getConnection().close();
				request.setAttribute("Hotel", hotel);
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/hotel.jsp");
				dispatcher.forward(request, response);
			} else {
				throw new RuntimeException("id não encontrado"); 
			}
			
			
			
		} catch (Exception e) {
			System.out.println("Falha na requisição a rota /hotel");
		}
		
	}

}
