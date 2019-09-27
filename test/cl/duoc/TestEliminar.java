package cl.duoc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestEliminar {
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        Empleado empleado = new Empleado("18978177-6", "Camilo Orellana", 24, 5);
        String codigo = "18978177-6";
        BussEmpleado instance = new BussEmpleado();
        instance.Crear(empleado);
        boolean esperado = true;
        boolean obtenido = instance.Eliminar(codigo);
        assertEquals(esperado, obtenido);
    }
}
