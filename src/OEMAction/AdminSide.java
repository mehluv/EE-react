package OEMAction;

import org.hibernate.Session;
import org.hibernate.Transaction;

import OEMEntities.LoginMaster;

public class AdminSide
{
	public static void addUser(LoginMaster l)
	{

		Session s = DAOLayer.HibDAOLayer.getSession();
		Transaction t = s.beginTransaction();
		s.save(l);
		t.commit();
		System.out.println("DATA SAVED!");
	}
}