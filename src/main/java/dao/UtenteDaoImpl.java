package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import javax.sql.DataSource;

import model.UtenteBean;
import utils.PasswordUtils;





public class UtenteDaoImpl implements UtenteDAO
{

private DataSource ds;

private static final String TABLE_NAME ="farmaciaweb.utente"; 


public UtenteDaoImpl(DataSource ds)
{

this.ds = ds;


}//ch.costr.




@Override
public synchronized void doSave(UtenteBean utente) throws SQLException
{

String stInsertSQL="INSERT INTO " + TABLE_NAME +"(email, password_hash, n_civ_sped, citta_sped,cap_sped, prov_sped,ruolo,nome,cognome,telefono,indirizzo_spedizione,data_registrazione) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)" ;



/*
INSERT INTO `farmaciaweb`.`utente` (`email`, `password_hash`, `n_civ_sped`, `citta_sped`, `cap_sped`, `prov_sped`, `ruolo`, `nome`, `cognome`, `telefono`, `indirizzo_spedizione`, `data_registrazione`) VALUES ('cciicco@gmail.com', '12344555', '34', 'roma', '80100', 'roma', 'user', 'francesco', 'rossi', '3285467', 'via giacomo leopardi', '34556');




*/



try (Connection con = ds.getConnection();
             PreparedStatement ps = con.prepareStatement(stInsertSQL)) {

            ps.setString(1, utente.getEmail());
            ps.setString(2,PasswordUtils.hashPassword(utente.getPassword()  ) );
            ps.setInt(3,utente.getnCiv() );
            ps.setString(4,utente.getCittaSpedizione() );
            ps.setString(5, utente.getCapSpedizione());
            ps.setString(6, utente.getProvSpedizione());

String ruolo=utente.getRuolo();
			if(ruolo.equals("user") )
			{
			ps.setInt(7,1);
			
			}
			else
			{
			ps.setInt(7,2);
			
			}




            
            ps.setString(8, utente.getNome());
            ps.setString(9, utente.getCognome());
	    ps.setString(10,utente.getTelefono());	
	    ps.setString(11, utente.getIndirizzoSpedizione());


            if (utente.getDataRegistrazione() != null) {
                ps.setDate(12, Date.valueOf(utente.getDataRegistrazione()));
            } else {
                ps.setDate(12, new Date(System.currentTimeMillis()));
            }

            

            ps.executeUpdate();


        }//ch.try






}//ch.metodo






@Override
public synchronized boolean doDelete(int idUtente) throws SQLException
{

//prototipo: delete from PiattAnnImmDB.Locale as L where( L.idImm = idI and L.tipoLocale = tipoLoc and L.num = n);

String stDeleteSQL="DELETE FROM " + TABLE_NAME +" WHERE(id_utente = ?)" ;


try (Connection con = ds.getConnection();
             PreparedStatement ps = con.prepareStatement(stDeleteSQL)) {

ps.setInt(1,idUtente);

int res=ps.executeUpdate();

return (res != 0);

}//ch.try


}//ch.metodo






/*attributi tabella Utente:  id_utente,email, password_hash, n_civ_sped, citta_sped,cap_sped, prov_sped,ruolo,nome,cognome,telefono,indirizzo_spedizione,data_registrazione*/


@Override
public  synchronized UtenteBean doRetrieveByKey(int idUtente) throws SQLException
{

UtenteBean utente= new UtenteBean();

String stQuerySQL="SELECT * FROM " + TABLE_NAME +" WHERE(id_utente = ?)" ;



      try (Connection con = ds.getConnection();
        		PreparedStatement ps = con.prepareStatement(stQuerySQL)) {
            ps.setInt(1,idUtente);
            try (ResultSet rs = ps.executeQuery()) {
                if(rs.next()) 
               {
                  

    utente.setIdUtente(rs.getInt("id_utente"));
        utente.setNome(rs.getString("nome"));
        utente.setCognome(rs.getString("cognome"));

        utente.setEmail(rs.getString("email"));

        utente.setPassword(rs.getString("password_hash"));

        utente.setTelefono(rs.getString("telefono"));

        utente.setIndirizzoSpedizione(rs.getString("indirizzo_spedizione"));

        utente.setnCiv(rs.getInt("n_civ_sped"));

        utente.setCittaSpedizione(rs.getString("citta_sped"));

        utente.setCapSpedizione(rs.getString("cap_sped"));


        utente.setProvSpedizione(rs.getString("prov_sped"));

       Date data = rs.getDate("data_registrazione");

       utente.setDataRegistrazione(data.toLocalDate());

       int ruolo= rs.getInt("ruolo"); 


       if(ruolo == 1)
       utente.setRuolo("user");
       else
       utente.setRuolo("admin");

            return utente;//se r.next() era true significa che la tupla c'era ed era unica 
       
       }//ch.if

	
            }//ch.try interno

        }//ch.try esterno

        return null;//restituisce null se la tupla non era stata trovata

}//ch.metodo






@Override
public  synchronized UtenteBean doRetrieveByEmail(String email) throws SQLException
{


if(email==null)
return null;



UtenteBean utente= new UtenteBean();

String stQuerySQL="SELECT * FROM " + TABLE_NAME +" WHERE(email = ?)" ;



      try (Connection con = ds.getConnection();
        		PreparedStatement ps = con.prepareStatement(stQuerySQL)) {
            ps.setString(1,email);
            try (ResultSet rs = ps.executeQuery()) {
                if(rs.next()) 
               {
                  

    utente.setIdUtente(rs.getInt("id_utente"));
        utente.setNome(rs.getString("nome"));
        utente.setCognome(rs.getString("cognome"));

        utente.setEmail(rs.getString("email"));

        utente.setPassword(rs.getString("password_hash"));

        utente.setTelefono(rs.getString("telefono"));

        utente.setIndirizzoSpedizione(rs.getString("indirizzo_spedizione"));

        utente.setnCiv(rs.getInt("n_civ_sped"));

        utente.setCittaSpedizione(rs.getString("citta_sped"));

        utente.setCapSpedizione(rs.getString("cap_sped"));


        utente.setProvSpedizione(rs.getString("prov_sped"));

       Date data = rs.getDate("data_registrazione");

       utente.setDataRegistrazione(data.toLocalDate());

       int ruolo= rs.getInt("ruolo"); 


       if(ruolo == 1)
       utente.setRuolo("user");
       else
       utente.setRuolo("admin");

            return utente;//se r.next() era true significa che la tupla c'era ed era unica 
       
       }//ch.if

	
            }//ch.try interno

        }//ch.try esterno

        return null;//restituisce null se la tupla non era stata trovata

}//ch.metodo






/*attributi tabella Utente:  id_utente,email, password_hash, n_civ_sped, citta_sped,cap_sped, prov_sped,ruolo,nome,cognome,telefono,indirizzo_spedizione,data_registrazione*/

@Override
public synchronized Collection<UtenteBean> doRetrieveAll(String order) throws SQLException
{


String stQuerySQL="SELECT * FROM " + TABLE_NAME ;

if(order != null && !order.trim().isEmpty())
{

stQuerySQL= stQuerySQL + " ORDER BY " + order;


}//ch.if

Collection<UtenteBean> listaUtenti = new ArrayList<UtenteBean>();





      try (Connection con = ds.getConnection();
        		PreparedStatement ps = con.prepareStatement(stQuerySQL);ResultSet rs = ps.executeQuery()) {
            
             
                while(rs.next()) 
               {
                  UtenteBean utente=new UtenteBean();

    utente.setIdUtente(rs.getInt("id_utente"));
        utente.setNome(rs.getString("nome"));
        utente.setCognome(rs.getString("cognome"));

        utente.setEmail(rs.getString("email"));

        utente.setPassword(rs.getString("password_hash"));

        utente.setTelefono(rs.getString("telefono"));

        utente.setIndirizzoSpedizione(rs.getString("indirizzo_spedizione"));

        utente.setnCiv(rs.getInt("n_civ_sped"));

        utente.setCittaSpedizione(rs.getString("citta_sped"));

        utente.setCapSpedizione(rs.getString("cap_sped"));


        utente.setProvSpedizione(rs.getString("prov_sped"));

       Date data = rs.getDate("data_registrazione");

       utente.setDataRegistrazione(data.toLocalDate());

       int ruolo= rs.getInt("ruolo"); 


       if(ruolo == 1)
       utente.setRuolo("user");
       else
       utente.setRuolo("admin");


           listaUtenti.add(utente);  
       
       }//ch.while

	
            

        }//ch.try esterno


return listaUtenti;




}//ch.metodo


/*
UPDATE table_name 
SET column1 = value1, column2 = value2,... 
WHERE condition;
*/

/*attributi tabella Utente:  id_utente,email, password_hash, n_civ_sped, citta_sped,cap_sped, prov_sped,ruolo,nome,cognome,telefono,indirizzo_spedizione,data_registrazione*/

@Override
public synchronized boolean doUpdate(UtenteBean utente) throws SQLException
{

if(utente == null)
return false;


String stQuerySQL="UPDATE " + TABLE_NAME + " SET email = ?, password_hash = ?, n_civ_sped = ?, citta_sped = ?,cap_sped = ?, prov_sped = ?,ruolo = ?,nome = ?,cognome = ?,telefono = ?,indirizzo_spedizione = ?,data_registrazione = ? WHERE id_utente = ?"; 


try (Connection con = ds.getConnection();
        		PreparedStatement ps = con.prepareStatement(stQuerySQL)){




            ps.setString(1, utente.getEmail());
            ps.setString(2,PasswordUtils.hashPassword(utente.getPassword()  ) );
            ps.setInt(3,utente.getnCiv() );
            ps.setString(4,utente.getCittaSpedizione() );
            ps.setString(5, utente.getCapSpedizione());
            ps.setString(6, utente.getProvSpedizione());

String ruolo=utente.getRuolo();
			if(ruolo.equals("user") )
			{
			ps.setInt(7,1);
			
			}
			else
			{
			ps.setInt(7,2);
			
			}




            
            ps.setString(8, utente.getNome());
            ps.setString(9, utente.getCognome());
	    ps.setString(10,utente.getTelefono());	
	    ps.setString(11, utente.getIndirizzoSpedizione());


            if (utente.getDataRegistrazione() != null) {
                ps.setDate(12, Date.valueOf(utente.getDataRegistrazione()));
            } else {
                ps.setDate(12, new Date(System.currentTimeMillis()));
            }


            ps.setInt(13,utente.getIdUtente() );

            return ps.executeUpdate() > 0;




}//ch.try





}//ch.metodo



/*attributi tabella Utente:  id_utente,email, password_hash, n_civ_sped, citta_sped,cap_sped, prov_sped,ruolo,nome,cognome,telefono,indirizzo_spedizione,data_registrazione*/

@Override
public synchronized UtenteBean checkCredenziali(String email,String passwordChiara) throws SQLException
{
	
if(email==null || passwordChiara==null)
return null;


UtenteBean utente= new UtenteBean();

String stQuerySQL="SELECT * FROM " + TABLE_NAME +" WHERE(email = ? AND password_hash = ?)" ;


      try (Connection con = ds.getConnection();
        		PreparedStatement ps = con.prepareStatement(stQuerySQL)) {
            ps.setString(1,email);
            ps.setString(2, PasswordUtils.hashPassword(passwordChiara));

            try (ResultSet rs = ps.executeQuery()) {
                if(rs.next()) 
               {
                  

    utente.setIdUtente(rs.getInt("id_utente"));
        utente.setNome(rs.getString("nome"));
        utente.setCognome(rs.getString("cognome"));

        utente.setEmail(rs.getString("email"));

        utente.setPassword(rs.getString("password_hash"));//penso che andrebbe assegnata la password chiara
//per non rendere disponibile direttamente la codifica(conservata nel db) insieme all'email 

        utente.setTelefono(rs.getString("telefono"));

        utente.setIndirizzoSpedizione(rs.getString("indirizzo_spedizione"));

        utente.setnCiv(rs.getInt("n_civ_sped"));

        utente.setCittaSpedizione(rs.getString("citta_sped"));

        utente.setCapSpedizione(rs.getString("cap_sped"));


        utente.setProvSpedizione(rs.getString("prov_sped"));

       Date data = rs.getDate("data_registrazione");

       utente.setDataRegistrazione(data.toLocalDate());

       int ruolo= rs.getInt("ruolo"); 


       if(ruolo == 1)
       utente.setRuolo("user");
       else
       utente.setRuolo("admin");

            return utente;//se r.next() era true significa che la tupla c'era ed era unica 
       
       }//ch.if

	
            }//ch.try interno

        }//ch.try esterno

        return null;//restituisce null se la tupla non era stata trovata







}//ch.metodo





}//ch.classe












