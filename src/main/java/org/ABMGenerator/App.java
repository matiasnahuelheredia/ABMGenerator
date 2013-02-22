package org.ABMGenerator;

import org.ABMGenerator.logicaGenerador.Archivos;
import org.ABMGenerator.logicaGenerador.GeneradorDominio;
import org.ABMGenerator.logicaGenerador.GeneradorRepositorio;
import org.ABMGenerator.logicaGenerador.ObtecionDeRutas;
import org.ABMGenerator.logicaGenerador.ReemplazoDeCodigo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException
    {
        System.out.println(GeneradorRepositorio.generarCodigo());
    }
}
