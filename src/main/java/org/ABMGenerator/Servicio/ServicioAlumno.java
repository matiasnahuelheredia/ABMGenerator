package org.ABMGenerator.Servicio;

import java.util.ArrayList;

import org.ABMGenerator.Dominio.Alumno;
import org.ABMGenerator.Repositorio.RepoAlumno;
public class ServicioAlumno {

	public ArrayList<Alumno> getAlumno()
	{
		RepoAlumno repAlu = new RepoAlumno();
		return repAlu.getAll();
	}
}
