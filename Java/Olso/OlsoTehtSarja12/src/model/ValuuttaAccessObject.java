package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ValuuttaAccessObject implements ValuuttaDAO_IF {
	
	SessionFactory istuntotehdas = null;
	final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
	{
	try {
		istuntotehdas = new MetadataSources(registry).buildMetadata().buildSessionFactory();
	} catch (Exception e) {
		System.out.println("Pieleen meni!");
		StandardServiceRegistryBuilder.destroy(registry);
		e.printStackTrace();
	}
	}
	
	public ValuuttaAccessObject() {

	}
	

	@Override
	public boolean createValuutta(Valuutta valuutta) {
		boolean onnistunut = false;
		Session istunto = istuntotehdas.openSession();
		Transaction transaktio = null;
		try {
			transaktio = istunto.beginTransaction();
			Valuutta v = new Valuutta(valuutta.getTunnus(), valuutta.getVaihtokurssi(), valuutta.getNimi());
			istunto.saveOrUpdate(v);
			transaktio.commit();
			onnistunut = true;
		} catch (Exception e) {
			if (transaktio != null) transaktio.rollback();
			throw e;
		} finally {
			istunto.close();
		}
		
		return onnistunut;
	}

	@Override
	public Valuutta readValuutta(String tunnus) {
		Valuutta valuutta = null;
		Session istunto = istuntotehdas.openSession();
		try {
			istunto.beginTransaction();
			istunto.load(valuutta, tunnus);
			istunto.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("Virhe valuuttaa lukiessa!");
		} finally {
			istunto.close();
		}
		
		return valuutta;
	}

	@Override
	public Valuutta[] readValuutat() {
		ArrayList<Valuutta> list = new ArrayList();
		
		Session istunto = istuntotehdas.openSession();
		
		try {
			istunto.beginTransaction();
			@SuppressWarnings("unchecked")
			List<Valuutta> result = istunto.createQuery("from Valuutta").getResultList();
			for (Valuutta v : result) {
				list.add(v);
			}
			istunto.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("Virhe valuuttoja lukiessa!");
		} finally {
			istunto.close();
		}
		
		Valuutta[] returnArray = new Valuutta[list.size()];
		return (Valuutta[])list.toArray(returnArray);
	}

	@Override
	public boolean updateValuutta(Valuutta valuutta) {
		boolean onnistunut = false;
		
		Session istunto = istuntotehdas.openSession();
		
		try {
			istunto.beginTransaction();
			
			Valuutta v = (Valuutta)istunto.get(Valuutta.class, valuutta.getTunnus());
			if (v != null) {
				v.setVaihtokurssi(valuutta.getVaihtokurssi());
				v.setNimi(valuutta.getNimi());
				istunto.getTransaction().commit();
				onnistunut = true;
			}
			
		} catch (Exception e) {
			System.out.println("Päivitys epäonnistunut!");			
		} finally {
			istunto.close();
		}
		
		return onnistunut;
	}

	@Override
	public boolean deleteValuutta(String tunnus) {
		boolean onnistunut = false;
		
		Session istunto = istuntotehdas.openSession();
		
		try {
			istunto.beginTransaction();
			Valuutta v = (Valuutta)istunto.get(Valuutta.class, tunnus);
			
			if (v!= null) {
				istunto.delete(v);
				istunto.getTransaction().commit();
				onnistunut = true;
			}

		} catch (Exception e) {
			System.out.println("Poisto meni vihkoon.");
		} finally {
			istunto.close();
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