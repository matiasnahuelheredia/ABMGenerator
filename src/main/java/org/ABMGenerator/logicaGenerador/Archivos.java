package org.ABMGenerator.logicaGenerador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Archivos {
      public static String verHojaEstiloDominio()
      {
    	  String retorno="";
    	  File archivo = new File(ObtecionDeRutas.obtenerRutaPackageHojaEstiloRepositorio()+"HojaEstiloRepo.txt"); 
    	  try {
			FileReader reader = new FileReader(archivo);
			BufferedReader br = new BufferedReader(reader);
			String linea = null;
			while ((linea=br.readLine())!=null)
			{
			   retorno = retorno+(char)13+(char)10+linea;	
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  return retorno;
      }
	  
      public static String asignarGetters()
      {
    	  
		return null;
    	  
      }
	
}
