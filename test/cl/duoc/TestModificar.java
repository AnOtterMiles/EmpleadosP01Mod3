package cl.duoc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestModificar {
    @Test
    public void testModificar() {
        System.out.println("Modificar");
        Empleado empleado = new Empleado("18978177-6", "Camilo Orellana", 24, 5);
        BussEmpleado instance = new BussEmpleado();
        boolean esperado = true;
        empleado = new Empleado("67718798-1", "Camilo Modificado", 32, 10);
        boolean obtenido = instance.Modificar(empleado);
        assertEquals(esperado, obtenido);
    }
}
