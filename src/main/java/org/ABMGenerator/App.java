package org.ABMGenerator;

import org.ABMGenerator.logicaGenerador.GeneradorRepositorio;
import org.ABMGenerator.logicaGenerador.GeneradorServicio;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        try
        {
        GeneradorRepositorio.GenerarArchivoPuntoJava();
        GeneradorServicio.GenerarArchivoPuntoJava();
        System.out.println("se ha generado el codigo del repositorio");
        System.out.println("Actualize para poder verlo correctamente");
        }
        catch (Exception ex)
        {
        	
        }
    }
}
