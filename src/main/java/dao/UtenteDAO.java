package dao;

import java.sql.SQLException;
import java.util.Collection;

import model.UtenteBean;



public interface UtenteDAO
{
	
public void doSave(UtenteBean utente) throws SQLException;

public boolean doDelete(int idUtente) throws SQLException;

public UtenteBean doRetrieveByKey(int idUtente) throws SQLException;

public UtenteBean doRetrieveByEmail(String email) throws SQLException;

public Collection<UtenteBean> doRetrieveAll(String order) throws SQLException;

public boolean doUpdate(UtenteBean utente) throws SQLException;


public UtenteBean checkCredenziali(String email,String passwordChiara) throws SQLException;
	

}//ch.interfaccia
