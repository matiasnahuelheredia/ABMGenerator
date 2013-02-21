package org.ABMGenerator.logicaGenerador;

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
	
	public static String obtenerRutaPackageHojaEstiloRepositorio()
	{
		

		return "/home/mati89/workspace/ABMGenerator/src/main/java/org/ABMGenerator/HolaEstilo/Repositorio/";
	}
}
