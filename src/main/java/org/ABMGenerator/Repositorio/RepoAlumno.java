
package org.ABMGenerator.Repositorio;
import java.util.ArrayList;
import org.ABMGenerator.Dominio.Alumno;
public class RepoAlumno {

	public ArrayList<Alumno> getAll()
	{
		ArrayList<Alumno> listaAlumno = new ArrayList<Alumno>();
		Alumno miAlumno = new Alumno();
        /*asignar obtener getters y setters*/
		
		listaAlumno.add(miAlumno);
		return listaAlumno;
	}

	
}
