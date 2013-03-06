package org.ABMGenerator.logicaGenerador;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;

public class Archivos {
      public static String verHojaEstiloRepositorio()
      {
    	  String retorno="";
    	  File archivo = new File(ObtecionDeRutas.obtenerRutaPackageHojaEstiloRepositorio()+"/HojaEstiloRepo.txt"); 
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
	  
      public static String verHojaEstiloServicio()
      {
    	  String retorno="";
    	  File archivo = new File(ObtecionDeRutas.obtenerRutaPackageHojaEstiloRepositorio()+"/HojaEstiloServ.txt"); 
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
      
      
      
      
      
      public static String[] obtenerArchivosDominio()
      {
    	  File miDir = new File (ObtecionDeRutas.obtenerRutaAbsolutaDominio());
          
			
			String[] Archivos =miDir.list();
			for (int i=0;i<Archivos.length;i++)
			{
				Archivos[i]=Archivos[i].replaceAll(".java", "");
			}
			return Archivos;
      }
      
	
}
