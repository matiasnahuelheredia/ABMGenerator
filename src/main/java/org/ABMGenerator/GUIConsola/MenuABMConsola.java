package org.ABMGenerator.GUIConsola;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

import java.io.InputStreamReader;


import java.util.*;







public class MenuABMConsola {

	static final String ruta = "src/main/java/org/ABMGenerator/Dominio/";
	 final String paqueteDominio="org.ABMGenerator.Dominio.";//modificar al cambiar el nombre
	 static ArrayList<String> listaMenu = new ArrayList<String>(); 
	public int SeleccionarOpcionMenu()
	{
	    int respuesta;
		do
	    {
        System.out.println("Menu ABM (Alta-Baja-Modificacion)");
     
	    for (int i=0;i<listaMenu.size();i++)
	    {
	    System.out.print(i+"- ABM ");
		System.out.println(listaMenu.get(i));
	    }
	    respuesta = PreguntaEntero("Seleccione una opcion valida");
	    }
	    while(validarOpcionObjeto(respuesta)==false);
		return respuesta;
	}
	
	
	public int SeleccionarOpcionABM(int opt)
	{
	    int respuesta;
		do
	    {
        System.out.println("Menu ABM de"+listaMenu.get(opt));
     
        System.out.println("0-Mostrar lista de "+listaMenu.get(0));
        System.out.println("1-Alta Modificacion "+listaMenu.get(0));
        System.out.println("2-Borrar un "+listaMenu.get(0)+" de la Base de datos");
	    respuesta = PreguntaEntero("Seleccione una opcion valida");
	    }
	    while(validarOpcionABM(respuesta)==false);
		return respuesta;
	}
	private boolean isInteger(String str) {
	    try {
	        Integer.parseInt(str);
	        return true;
	    } catch (NumberFormatException nfe) {}
	    return false;
	}
	private int PreguntaEntero(String preguntar)
	{
		String linea = null;
		do{
		System.out.println(preguntar);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 try {
			linea = br.readLine();
		} catch (IOException e) {
		}
		
		}while (isInteger(linea)==false);
		return Integer.parseInt(linea);
	}
	private boolean validarOpcionABM(int opt)
	{
		if (opt>=0&&opt<3)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	private boolean validarOpcionObjeto(int opt)
	{
		if (opt>=0&&opt<listaMenu.size())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void mostrarMenu()
	{
		SeleccionarOpcionABM(SeleccionarOpcionMenu());
	}
	
	public MenuABMConsola()
	{
		File dir = new File(ruta);
		String[] listaDirectorio = dir.list();
		for (int i=0;i<listaDirectorio.length;i++)
	    {
			listaDirectorio[i] = listaDirectorio[i].replace(".java", "");
			try {
				Class clazz = Class.forName(paqueteDominio+listaDirectorio[i]);
				//Method[] metodos =clazz.getClass().getMethods();
				
				
				if((clazz.getModifiers()==1))
				{
				listaMenu.add(listaDirectorio[i]);
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
		
	}
}
