package ed.examen.modelo;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CursoTest {

	Persona p = new Persona("18079115B", "Martin", "Aguado");
	Curso c = new Curso();

	@Test
	void testEliminarAlumno() {
		try {
			p.setDni("18079115B");
			assertEquals("18079115B", p.getDni());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Test
	void testAniadirAlumno() {
		int x = c.numeroAlumnos();
		c.aniadirAlumno(p);
		int y = c.numeroAlumnos();

		assertEquals(x + 1, y);
	}

	@Test
	void testEstaRegistrado() {
		Boolean encontrado = c.estaRegistrado("180791125B");
		assertFalse(encontrado);
		assertEquals(false, c.estaRegistrado("18079115B"));
	}

	@Test
	void testCurso() {
		equals(c.numeroAlumnos());
	}

	@Test
	void testNumeroAlumnos() {
		equals(c.numeroAlumnos());
	}

}
