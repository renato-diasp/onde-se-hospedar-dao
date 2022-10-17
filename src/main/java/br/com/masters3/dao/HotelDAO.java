package br.com.masters3.dao;

import br.com.masters3.model.Hotel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class HotelDAO implements DAO<Hotel> {
	private DataSource dataSource;
	
	public HotelDAO(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public DataSource getDataSource() {
		return this.dataSource;
	}

	public ArrayList<Hotel> getAll() {
		try {
			String SQL = "select * from TB_HOTEL";
			PreparedStatement stm = dataSource.getConnection().prepareStatement(SQL);
			ResultSet rs = stm.executeQuery();
			ArrayList<Hotel> listHotel = new ArrayList<Hotel>();
			while (rs.next()) {
				Hotel hotel = new Hotel();
				hotel.setId(rs.getInt("ID"));
				hotel.setName(rs.getString("NAME"));
				hotel.setAddress(rs.getString("ADDRESS"));
				hotel.setPrice(rs.getInt("PRICE"));
				hotel.setSite(rs.getString("SITE"));
				hotel.setImagePath(rs.getString("IMAGE"));
				hotel.setDescription(rs.getString("DESCRIPTION"));
				listHotel.add(hotel);
			}
			return listHotel;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	@Override
	public void create(Hotel hotel) {
		try {
			String SQL = "insert into TB_HOTEL (name, address, price, site, image, rating, description)"
					+ "values (?, ?, ?, ?, ?, ?, ?, ?)";
			
			PreparedStatement stm = dataSource.getConnection().prepareStatement(SQL);
			stm.setString(1, hotel.getName());
			stm.setString(2, hotel.getaddress());
			stm.setInt(3, hotel.getPrice());
			stm.setString(4, hotel.getSite());
			stm.setString(5, hotel.getImagePath());
			stm.setString(6, hotel.getDescription());
			
			int res = stm.executeUpdate();
			
			if (res != 0) {
				System.out.println("Hotel criado com sucesso");
			} else {
				throw new RuntimeException("Erro ao inserir usuario");
			}
			
		} catch(Exception e) {
			System.out.println("HotelDAO.CREATE => " + e.getMessage());
		}
		
	}

	@Override
	public Hotel read(int id) {
		try {
			String SQL = "select * from TB_HOTEL where id = ?";
			PreparedStatement stm = dataSource.getConnection().prepareStatement(SQL);
			
			stm.setInt(1, id);
			
			ResultSet rs = stm.executeQuery();
			
			if (rs.next()) {
				Hotel result = new Hotel();
				result.setId(rs.getInt("ID"));
				result.setName(rs.getString("NAME"));
				result.setAddress(rs.getString("ADDRESS"));
				result.setPrice(rs.getInt("PRICE"));
				result.setSite(rs.getString("SITE"));
				result.setImagePath(rs.getString("IMAGE"));
				result.setDescription(rs.getString("DESCRIPTION"));
				return result;
			} else {
				return null;
			}
			
		} catch (Exception e) {
			System.out.println("HotelDAO.READ => " + e.getMessage());
		}
		return null;
	}

	@Override
	public void update(Hotel hotel) {
		try {
			String SQL = "update TB_HOTEL name = ?, address = ?,"
					+ "price = ?, site = ?, image = ?, rating = ?, description = ? where id = ?";
			PreparedStatement stm = dataSource.getConnection().prepareStatement(SQL);
			
			stm.setString(1, hotel.getName());
			stm.setString(2, hotel.getaddress());
			stm.setInt(3, hotel.getPrice());
			stm.setString(4, hotel.getSite());
			stm.setString(5, hotel.getImagePath());
			stm.setString(6, hotel.getDescription());
			stm.setInt(7, hotel.getId());
			
			int res = stm.executeUpdate();
			if (res != 0) {
				System.out.println("Hotel alterado com sucesso");
			} else {
				throw new RuntimeException("Erro ao atualizar hotel");
			}
		} catch (Exception e) {
			System.out.println("HotelDAO.UPDATE => " + e.getMessage());
		}
		
	}

	@Override
	public void delete(Hotel hotel) {
		try {
			String SQL = "delete from TB_HOTEL where ID = ?";
			PreparedStatement stm = dataSource.getConnection().prepareStatement(SQL);
			stm.setInt(1, hotel.getId());
			
			int res = stm.executeUpdate();
			if (res != 0) {
				System.out.println("Hotel excluido com sucesso");
			} else {
				throw new RuntimeException("ERRO ao apagar hotel");
			}
			
		} catch (Exception e) {
			System.out.println("HotelDAO.DELETE => " + e.getMessage());
		}
		
	}
}
