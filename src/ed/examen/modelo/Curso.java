package ed.examen.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	private List<Persona> listaAlumnos;

	/*
	 * @author Martin Aguado
	 * 
	 * @version 0.1 06/05/2020
	 * 
	 * @param dni
	 * 
	 * @return dni
	 * 
	 * @throws exception cuando la longitud del String introducido no es igual a 9
	 */
	public void eliminarAlumno(String dni) throws Exception {
		if (dni.length() == 9) {// comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); // solo hace falta el dni
		} else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}

	/*
	 * @param persona
	 */
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}

	/*
	 * @param dni
	 * 
	 * @return devuelve si el dni introducido esta registrado
	 */
	public Boolean estaRegistrado(String dni) {
		int i = 0;
		Boolean encontrado = false;
		while (!encontrado && i < listaAlumnos.size()) {
			if (listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado = true;
			}
			i++;
		}
		return encontrado;
	}

	/*
	 *
	 */
	public Curso() {
		listaAlumnos = new ArrayList<Persona>();
	}

	/*
	 * @return nos devuelve el numero de elementos de listaAlumnos
	 */
	public Integer numeroAlumnos() {
		return listaAlumnos.size();
	}

	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}
