package filter;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.UtenteBean;


@WebFilter("/*")
public class AuthFilter extends HttpFilter
{

	private static final long serialVersionUID = 1L;
	
	
	
	@Override
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
	        throws IOException, ServletException
	{
	    String path = request.getServletPath();
	    
	    	// Se l'URL non è protetto, lascia passare
	    if (!path.startsWith("/admin/") && !path.startsWith("/common/") && !path.startsWith("/user/")) 
	    {
	    	chain.doFilter(request, response);
	        return; // Per evitare che il codice che segue venga eseguito
	    }
	    
	    
	    // Controllo che il token sia in sessione
	    HttpSession session = request.getSession(false);
	    UtenteBean utente = (session != null) ? (UtenteBean) session.getAttribute("utente") : null;
	    
	    String role =(utente != null) ? utente.getRuolo() : null;
	    
	    // Controllo autenticazione e autorizzazione
	    boolean autorizzato = false;
	    
	    if (role != null) {
	    		if (path.startsWith("/admin/"))
	    		{
	            autorizzato = role.equals("admin");
	            
	        } else if (path.startsWith("/common/")) 
	        {
	            autorizzato = role.equals("admin") || role.equals("user");
	        }
	        else if(path.startsWith("/user/"))
	        {
	        	autorizzato = role.equals("user");
	        	
	        }
	    }
	    if (autorizzato)
	    {
	        chain.doFilter(request, response);
	    } else {
	        response.sendRedirect(request.getContextPath() + "/index");
	    }
	}//ch.metodo
	
	
	
	
	
}//ch.classe
