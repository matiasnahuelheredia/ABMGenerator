package org.ABMGenerator.logicaGenerador;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Method;

public class GeneradorServicio {

	public static String generarCodigo(String nombreClase) throws ClassNotFoundException
	{
		String Codigo = Archivos.verHojaEstiloServicio();
		
		Codigo = Codigo.replaceAll("<remplazar>PaqueteServicio</remplazar>", ObtecionDeRutas.obtenerRutaPackageServicio() );
		Codigo = Codigo.replaceAll("<remplazar>PaqueteRepositorio</remplazar>", ObtecionDeRutas.obtenerRutaPackageRepositorio() );
		Codigo = Codigo.replaceAll("<remplazar>PaqueteDominio</remplazar>", ObtecionDeRutas.obtenerRutaPackageDominio() );
		Codigo = Codigo.replaceAll("<remplazar>Clase</remplazar>", nombreClase );
		
		
		return Codigo;
	}

	public static String generarAsignarGetters(String nombreDeClase) throws ClassNotFoundException 
	{
		Class<?> clazz = Class.forName(ObtecionDeRutas.obtenerRutaPackageDominio()+"."+nombreDeClase);
		Method metodos[] = clazz.getMethods();
		String salida="";
		for (int i=0;i<metodos.length;i++)
		{
			if (metodos[i].getName().substring(0, 3).equals("set"))
			{
			salida = salida +"mi"+clazz.getSimpleName()+"."+ metodos[i].getName()+"(null);"+(char)10;
			}		
		}
		
		return salida;
		
	}
	
	public static void GenerarArchivoPuntoJava() throws Exception
	{
	     String[] listaNombreArchivos = Archivos.obtenerArchivosDominio();
               for (int i=0;i<listaNombreArchivos.length;i++)
               {
            	  
            	   File archivo = new File(ObtecionDeRutas.obtenerRutaAbsolutaServicio()+"/Serv"+listaNombreArchivos[i]+".java");
            	   
            	   FileWriter fw = new FileWriter(archivo);
            	   
            	   String codigo = generarCodigo(listaNombreArchivos[i]);
            	   fw.write(codigo);
            	   System.out.println(codigo);
            	   fw.close();
            	   
               }
               
	}
	
}
