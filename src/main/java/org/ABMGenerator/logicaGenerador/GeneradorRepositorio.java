package org.ABMGenerator.logicaGenerador;



import java.lang.reflect.Method;



public class GeneradorRepositorio {

	
	public static String generarCodigo(String nombreClase) throws ClassNotFoundException
	{
		String Codigo = Archivos.verHojaEstiloDominio();
		
		Codigo = Codigo.replaceAll("<remplazar>PaqueteRepositorio</remplazar>", ObtecionDeRutas.obtenerRutaPackageRepositorio() );
		Codigo = Codigo.replaceAll("<remplazar>PaqueteDominio</remplazar>", ObtecionDeRutas.obtenerRutaPackageDominio() );
		Codigo = Codigo.replaceAll("<remplazar>Clase</remplazar>", nombreClase );
		Codigo = Codigo.replaceAll("<remplazar>AsignarSetters</remplazar>", generarAsignarGetters(nombreClase));
		
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
			salida = salida +clazz.getSimpleName()+"."+ metodos[i].getName()+"(null);"+(char)10;
			}		
		}
		
		return salida;
		
	}
	
	public static void GenerarArchivoPuntoJava() throws Exception
	{
	     String[] listaNombreArchivos = Archivos.obtenerArchivosDominio();
               for (int i=0;i<listaNombreArchivos.length;i++)
               {
            	   String codigo = generarCodigo(listaNombreArchivos[i]);
            	   System.out.println(codigo);
            	   
               }
	}
	
	
}
