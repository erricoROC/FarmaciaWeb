package utils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordUtils
{
	
	
	public static String hashPassword(String passwordChiara)
	{

	try
	{

	MessageDigest md =MessageDigest.getInstance("SHA-512");

	byte[] digestBytes =md.digest(passwordChiara.getBytes(StandardCharsets.UTF_8));

	/*l'array digestBytes dovrebbe essere di 128 elementi che contengono i byte(caratteri) corrispondenti alla codifica esadecimale data all'array di partenza*/

	StringBuilder sb = new StringBuilder();

	for(byte b:digestBytes)
	{
		sb.append(String.format("%02x",b));


	}//ch.for

	return sb.toString();

	}//ch.try
	catch(NoSuchAlgorithmException e)
	{
		throw new RuntimeException("Algoritmo SHA-512 non disponibile",e);

	}



	}//ch.metodo
	
	

}//ch.classe
