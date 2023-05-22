package ProductDemo;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

public class ProductDB {
	
	Connection conn=null;

	public ProductDB() {
		try {
			conn=DriverManager.getConnection(
					 "jdbc:postgresql://localhost:5432/ProductDB", 
					"postgres",
					 "leee");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void save(Product p) throws SQLException {
		
		String query= "insert into product (name, type, place, warranty) values (?,?,?,?)";
		PreparedStatement st = conn.prepareStatement(query);
		st.setString(1, p.getName());
		st.setString(2, p.getType());
		st.setString(3, p.getPlace());
		st.setInt(4, p.getWarrnty());
		st.execute();
		
	}

	public List<Product> getAll() {
		List<Product> products = new ArrayList<>();
		String query="Select name, type, place, warranty from product";
		
		PreparedStatement st;
		try {
			st = conn.prepareStatement(query);
			ResultSet rs=st.executeQuery();
			while(rs.next()) {
				Product p  =new Product();
				p.setName(rs.getString(1));
				p.setType(rs.getString(2));
				p.setPlace(rs.getString(3));
				p.setWarrnty(rs.getInt(4));
				products.add(p);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return products;
	}
	
	public List<Product> getProductsByName(String name) {
		Product p= new Product();
		List<Product> products=new ArrayList<>();
		String query="Select name, type, place, warranty from product where name='"+name+"'" ;
		PreparedStatement st;
		
		try {
			st = conn.prepareStatement(query);
			ResultSet rs= st.executeQuery();
			while(rs.next()) {
				p.setName(rs.getString(1));
				p.setType(rs.getString(2));
				p.setPlace(rs.getString(3));
				p.setWarrnty(rs.getInt(4));
				products.add(p);
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return products;
	}
}
