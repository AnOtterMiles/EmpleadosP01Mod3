package cl.duoc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCrear {
    @Test
    public void testCrear() {
        System.out.println("Crear");
        Empleado empleado = new Empleado("18978177-6", "Camilo Orellana", 24, 5);
        BussEmpleado instance = new BussEmpleado();
        boolean esperado = true;
        boolean obtenido = instance.Crear(empleado);
        assertEquals(esperado, obtenido);
    }
}
