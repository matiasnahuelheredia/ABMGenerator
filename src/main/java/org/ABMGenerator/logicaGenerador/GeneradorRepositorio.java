package org.ABMGenerator.logicaGenerador;

public class GeneradorRepositorio {

	
	public static String generarCodigo()
	{
		String Codigo = Archivos.verHojaEstiloDominio();
		Codigo = Codigo.replaceAll("<remplazar>PaqueteRepositorio</remplazar>", ObtecionDeRutas.obtenerRutaPackageRepositorio() );
		Codigo = Codigo.replaceAll("<remplazar>PaqueteDominio</remplazar>", ObtecionDeRutas.obtenerRutaPackageDominio() );
		Codigo = Codigo.replaceAll("<remplazar>Clase</remplazar>", "Alumno" );
		
		return Codigo;
	}
	
}
