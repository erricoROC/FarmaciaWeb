package storage.farmaciaweb;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;




@WebListener
public class SourceDbContext implements ServletContextListener
{

	@Override
	public  void contextInitialized(ServletContextEvent sce)
	{
		
		ServletContext context = sce.getServletContext();
		DataSource ds = null;
		try 
		{
			Context initCtx = new InitialContext();
			Context envCtx = (Context) initCtx.lookup("java:comp/env");
			ds = (DataSource) envCtx.lookup("jdbc/farmaciaweb");
			
			
		} catch (NamingException e)
		{
			System.out.println("Error:" + e.getMessage());
		}
		
		context.setAttribute("DataSource", ds);//att. ds potrebbe essere null va controllato nelle servlet che usano il DataSource
		
		
		
		
		
		
	}//ch.metodo
	
	
	
	
	@Override
	public void contextDestroyed(ServletContextEvent sce)
	{
	
		
	}



		
	
	
}//ch.classe
