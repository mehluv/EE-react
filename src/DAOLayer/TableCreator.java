package DAOLayer;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import OEMEntities.LoginMaster;

/**Demoniser and Labh Lee
 *Creates the tables for OEW database
 * 
 */
public class TableCreator
{

    public static void main(String[] args)
    {
	Configuration cfg;
	cfg = new Configuration();
	
	cfg.addAnnotatedClass(LoginMaster.class);
	cfg.configure();//gets info from database
	SchemaExport se = new SchemaExport(cfg);
	se.create(true, true);//1. to implement query building and display in log,2. execute build query
	System.out.println("TABLE CREATED");
    }
}
