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
	void testSetDni() {
		assertEquals("18079115B", p.getDni());
	}

}
