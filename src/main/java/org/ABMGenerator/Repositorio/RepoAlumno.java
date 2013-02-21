package org.ABMGenerator.Repositorio;/*Paquete Repositorio*/
import java.util.ArrayList;
import java.util.List;
import org.ABMGenerator.Dominio.Alumno;
public class RepoAlumno/*Clase*/ {

	public static List<Alumno> getAll()
	{
		List</*clase*/Alumno> listaAlumno = new ArrayList<Alumno/*clase*/>();
		/*clase*/Alumno miAlumno = new /*clase*/Alumno();
        /*asignar obtener getters y setters*/
		miAlumno/*clase*/.setApellido("Matias");
		miAlumno/*clase*/.setLegajo(1);
		miAlumno/*clase*/.setApellido("Heredia");
		listaAlumno.add(miAlumno/*clase*/);
	}

	
}
