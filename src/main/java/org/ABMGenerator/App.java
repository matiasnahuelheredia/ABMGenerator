package org.ABMGenerator;

import org.ABMGenerator.logicaGenerador.GeneradorDominio;
import org.ABMGenerator.logicaGenerador.ObtecionDeArchivos;
import org.ABMGenerator.logicaGenerador.ReemplazoDeCodigo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Bienvenido al generador de Formularios ABM con DDD" );
        System.out.println(ObtecionDeArchivos.obtenerRuta());
        
    }
}
