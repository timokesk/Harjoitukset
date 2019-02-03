package model;

import java.sql.*;
import java.util.ArrayList;

public class ValuuttaAccessObject implements ValuuttaDAO_IF {
	
	private Connection myCon;
	
	public ValuuttaAccessObject() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			myCon = DriverManager.getConnection("jdbc:mysql://localhost/valuuttakanta", "olso", "olso");
		} catch (Exception e) {
			System.err.println("Virhe tietokantayhteyden muodostamisessa.");
			System.exit(-1);
		}
	}
	
	@Override
	protected void finalize() {
		try {
			if (myCon != null)
				myCon.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean createValuutta(Valuutta valuutta) {
		boolean onnistunut = false;
		Statement statement = null;
		try {
			statement = myCon.createStatement();
			String tunnus = valuutta.getTunnus();
			double vaihtokurssi = valuutta.getVaihtokurssi();
			String nimi = valuutta.getNimi();
			statement.execute("INSERT INTO valuutta (tunnus,vaihtokurssi,nimi) VALUES ('" + tunnus + "'," + vaihtokurssi + ",'" + nimi + "')");
			onnistunut = true;
		} catch (SQLException e) {
			do {
				System.err.println("Viesti: " + e.getMessage());
				System.err.println("Virhekoodi: " + e.getErrorCode());
				System.err.println("SQL-tilakoodi: " + e.getSQLState());
			} while (e.getNextException() != null);
		}
		
		return onnistunut;
	}

	@Override
	public Valuutta readValuutta(String tunnus) {
		Valuutta valuutta = null;
		try (PreparedStatement myStatement = myCon.prepareStatement("SELECT * FROM valuutta WHERE tunnus=?"))
		{
			myStatement.setString(1, tunnus);
			ResultSet myRs = myStatement.executeQuery();
			if (myRs.next()) {
				String rs_tunnus = myRs.getString("tunnus");
				double rs_vaihtokurssi = myRs.getDouble("vaihtokurssi");
				String rs_nimi = myRs.getString("nimi");
				valuutta = new Valuutta(rs_tunnus, rs_vaihtokurssi, rs_nimi);
			}
		} catch (SQLException e) {
			do {
				System.err.println("Viesti: " + e.getMessage());
				System.err.println("Virhekoodi: " + e.getErrorCode());
				System.err.println("SQL-tilakoodi: " + e.getSQLState());
			} while (e.getNextException() != null);
		}
		
		return valuutta;
	}

	@Override
	public Valuutta[] readValuutat() {
		ArrayList<Valuutta> list = new ArrayList();
		
		try {
			Statement statement = myCon.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM valuutta");
			while (rs.next()) {
				String rs_tunnus = rs.getString("tunnus");
				double rs_vaihtokurssi = rs.getDouble("vaihtokurssi");
				String rs_nimi = rs.getString("nimi");
				Valuutta valuutta = new Valuutta(rs_tunnus, rs_vaihtokurssi, rs_nimi);
				list.add(valuutta);
			}
		} catch (SQLException e) {
			do {
				System.err.println("Viesti: " + e.getMessage());
				System.err.println("Virhekoodi: " + e.getErrorCode());
				System.err.println("SQL-tilakoodi: " + e.getSQLState());
			} while (e.getNextException() != null);
		}
		
		Valuutta[] returnArray = new Valuutta[list.size()];
		return (Valuutta[])list.toArray(returnArray);
	}

	@Override
	public boolean updateValuutta(Valuutta valuutta) {
		boolean onnistunut = false;
		
		try {
			PreparedStatement myStatement = myCon.prepareStatement("SELECT * FROM valuutta", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet myRs = myStatement.executeQuery();
			try {
				while (myRs.next()) {
					if (valuutta.getTunnus().equals(myRs.getString("tunnus"))) {
						myRs.updateDouble("vaihtokurssi", valuutta.getVaihtokurssi());
						myRs.updateString("nimi", valuutta.getNimi());
						myRs.updateRow();
						onnistunut = true;
					}
				}
			} catch (SQLException e) {
				System.err.println("Tulosjoukon käsittely epäonnistui.");
			} finally {
				myRs.close();
			}
			
		} catch (SQLException e) {
			do {
				System.err.println("Viesti: " + e.getMessage());
				System.err.println("Virhekoodi: " + e.getErrorCode());
				System.err.println("SQL-tilakoodi: " + e.getSQLState());
			} while (e.getNextException() != null);
		} 

		
		return onnistunut;
	}

	@Override
	public boolean deleteValuutta(String tunnus) {
		boolean onnistunut = false;
		try {
			if (readValuutta(tunnus) == null) {
				return onnistunut;
			}
			PreparedStatement kysely = myCon.prepareStatement("DELETE FROM valuutta WHERE tunnus=?");
			kysely.setString(1, tunnus);
			kysely.executeUpdate();
			onnistunut = true;
		} catch (SQLException e) {
			System.err.println("Poisto meni vihkoon.");
		}
		return onnistunut;
	}
	
	/*@Override
	public String[] getVaihtoehdot() {
		Valuutta[] valuutat = readValuutat();
		String[] vaihtoehdot = new String[valuutat.length];
		for (int i = 0; i < valuutat.length; i++) {
			vaihtoehdot[i] = valuutat[i].getNimi();
		}
		return vaihtoehdot;
	}
	
	@Override
	public double muunna(int lahto, int kohde, double maara) {
		Valuutta[] valuutat = readValuutat();
		double tulos;
		double euroina;
		euroina = maara / valuutat[lahto].getVaihtokurssi();
		tulos = euroina * valuutat[kohde].getVaihtokurssi();
		return tulos;
	}*/

}
