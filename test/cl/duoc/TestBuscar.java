package cl.duoc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestBuscar {
    @Test
    public void testBuscar() {
        System.out.println("Buscar");
        String rut = "18978177-6";
        BussEmpleado instance = new BussEmpleado();
        instance.Crear(new Empleado("18978177-6", "Camilo Orellana", 24, 5));
        String esperado = "18978177-6";
        Empleado obtenido = instance.Buscar(rut);
        assertEquals(esperado, obtenido.getRut());
    }
}
