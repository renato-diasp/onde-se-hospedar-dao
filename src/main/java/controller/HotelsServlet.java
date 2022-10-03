package controller;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Hotel;

@WebServlet("/hotels")
public class HotelsServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, 
             HttpServletResponse response) 
          throws IOException, ServletException {

		ArrayList<Hotel> hotels = new ArrayList<Hotel>();
		hotels.add(new Hotel(1,
				"Blue Tree Premium Morumbi",
				"Endereço: Avenida Cruzeiro Do Sul, 1709, Santana, São Paulo, CEP 02031-000",
				350,
				"https://www.bluetree.com.br/hotel/blue-tree-premium-morumbi/",
				"./assets/img/hotels/blue-tree.jpg",
				"blue-tree",
				" Com Wi-Fi gratuito e localizado em frente ao Shopping Morumbi, o Blue Tree Premium\n"
				+ "          Morumbi oferece quartos com TV a cabo. O hotel possui piscina coberta com deck e piscina ao\n"
				+ "          ar livre com uma área de 20 metros para tomar sol.\n"
				+ "          Todos os quartos do Morumbi Blue Tree Premium têm ar-condicionado, frigobar e janelas com\n"
				+ "          isolamento acústico. O serviço de quarto está disponível 24 horas por dia. As suítes contam\n"
				+ "          com TV LCD.\n"
				+ "          O Noah Jonnie Space, restaurante do hotel, oferece diversas especialidades, incluindo\n"
				+ "          refeições leves e típicas de várias regiões. O restaurante serve buffet internacional no almoço\n"
				+ "          e menu à la carte no jantar.\n"
				+ "          O Blue Tree Premium Morumbi fica a 15 minutos de carro do Transamérica Expo Center e a\n"
				+ "          30 minutos de carro do São Paulo Expo (centro de convenções). O Consulado dos EUA está\n"
				+ "          situado a 1,4 km do hotel."));
		
		hotels.add(new Hotel(2,
				"Confort Ibirapuera",
				"Endereço: Av. Sabiá, 825 - Indianópolis, São Paulo - SP, CEP: 04515-001",
				380,
				"https://www.reserveatlantica.com.br/",
				"./assets/img/hotels/confort.jpg",
				"confort",
				"O Confort Ibirapuera possui 79 confortáveis e aconchegantes apartamentos. Oferecemos\n"
				+ "          também facilidades como fitness center, piscina com solarium e deslumbrante vista de São\n"
				+ "          Paulo, room-service até às 23 horas, restaurante, recepção 24 horas e sala para eventos até 35\n"
				+ "          pessoas.\n"
				+ "          Localizado em Moema, uma das melhores regiões de São Paulo, em frente a Moema do Metro\n"
				+ "          e estamos próximo a ótimos bares e restaurantes, a 1km do Shopping Ibirapuera e Parque do\n"
				+ "          Ibirapuera, e a 3,5km do aeroporto de Congonhas.\n"
				+ "          Nosso estacionamento possui o custo fixo de R$ 21,00 + 5% de ISS com serviço de manobristas\n"
				+ "          de segunda a sábado das 07h às 19h, após esse horário, domingos e feriados o próprio\n"
				+ "          hóspede precisa manobrar seu veículo."));
		
		hotels.add(new Hotel(3,
				"Mercure Pamplona",
				"Endereço: R. Pamplona, 1315 - Jardim Paulista, São Paulo - SP, CEP: 01405-002",
				330,
				"https://all.accor.com/hotel/6284/index.pt.shtml?utm_campaign=seo+maps&utm_medium=seo+maps&utm_source=google+Maps",
				"./assets/img/hotels/mercure.jpg",
				"mercure",
				"Se você procura um hotel em São Paulo confortável para sua viagem de negócios ou \n"
				+ "          aproveitar a cidade ao máximo, o Mercure São Paulo Pamplona é para você.\n"
				+ "          Os quartos são espaçosos e tem uma decoração moderna, com opções de room office. \n"
				+ "          Todos climatizados e com wi-fi grátis.\n"
				+ "          O Restaurante Le Jadys serve o melhor da cozinha internacional em um agradável ambiente. Faça sua reunião em nossa equipada sala de eventos, e aproveite da nossa área de lazer completa com piscina, academia e sauna para relaxar.\n"
				+ "          Preocupado com o que fazer em São Paulo? O hotel Mercure São Paulo Pamplona está cercado de ótimas opções de lazer, cultural e boêmio. Além de ser um hotel perto da Paulista, a Rua Augusta está a 3 km de carro, com uma agitada vida noturna."));
		
		String id = request.getParameter("id");
		
		if (id != null) {
			int idInt = Integer.parseInt(id);
			int index = idInt - 1;
			Hotel hotel = hotels.get(index);
			request.setAttribute("Hotel", hotel);
			RequestDispatcher dispatcher =getServletContext().getRequestDispatcher("/hotel.jsp");
			dispatcher.forward(request, response);
		}
		else {			
			request.setAttribute("Hotels", hotels);
			RequestDispatcher dispatcher =getServletContext().getRequestDispatcher("/index.jsp");
			dispatcher.forward(request, response);
		}
		
	}

}
