package org.ABMGenerator.logicaGenerador;

import java.io.File;

import org.hibernate.metamodel.domain.Superclass;

public class ObtecionDeRutas {
	
	public static String obtenerRutaPackagePrincipal()
	{
		
	 
		String Obtencion="";
	 	String[] separador= ObtecionDeRutas.class.getName().split("\\.");
	 	int hasta=2;	
	 	for (int i=0;i<hasta;i++)
		{
	        Obtencion = Obtencion  + separador[i];
	        if (hasta-1>i)
	        {
	        	Obtencion = Obtencion +".";
	        }
		}
		return Obtencion;
	}
	
	public static String obtenerRutaPackageDominio()
	{
		return obtenerRutaPackagePrincipal()+".Dominio";
	}
	
	public static String obtenerRutaPackageRepositorio()
	{
		return obtenerRutaPackagePrincipal()+".Repositorio";
	}
	
	
	public static String obtenerRutaPackageServicio()
	{
		return obtenerRutaPackagePrincipal()+".Servicio";
	}
	public static String obtenerRutaAbsolutaRepositorio()
	{
		File miDir = new File("src/main/java/org/ABMGenerator/Repositorio/");	
		return miDir.getAbsolutePath();
	}
	public static String obtenerRutaAbsolutaServicio()
	{
		File miDir = new File("src/main/java/org/ABMGenerator/Servicio/");	
		return miDir.getAbsolutePath();
	}
	public static String obtenerRutaAbsolutaDominio()
	{
		File miDir = new File("src/main/java/org/ABMGenerator/Dominio/");	
		return miDir.getAbsolutePath();
	}
	public static String obtenerRutaPackageHojaEstiloRepositorio()
	{
		
		File miDir = new File("src/main/java/org/ABMGenerator/HojaEstilo/Repositorio/");	
		return miDir.getAbsolutePath();
	}
	public static String obtenerRutaPackageHojaEstiloServicio()
	{
		
		File miDir = new File("src/main/java/org/ABMGenerator/HojaEstilo/Servicio/");	
		return miDir.getAbsolutePath();
	}
}
