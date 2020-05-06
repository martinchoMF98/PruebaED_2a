package ed.examen.modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PersonaTest {

	Persona p = new Persona("18079115B", "Martin", "Aguado");

	@Test
	void testPersonaStringStringString() {
		assertEquals("18079115B", "Martin", "Aguado");
	}

	@Test
	void testGetDni() {
		assertEquals("18079115B", p.getDni());
	}

	@Test
	void testSetDni() {
		try {
			p.setDni("18079115B");
		} catch (Exception e) {
			// TODO: handle exception
			assertEquals("18079115B", p.getDni());
		}
	}

	@Test
	void testGetNombre() {
		assertEquals("Sergio", p.getNombre());
	}

	@Test
	void testSetNombre() {
		p.setNombre("Martin");
		assertEquals("Martin", p.getNombre());
	}

	@Test
	void testGetApellido1() {
		assertEquals("Ruiz", p.getApellido1());
	}

}
