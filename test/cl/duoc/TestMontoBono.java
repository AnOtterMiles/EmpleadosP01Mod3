package cl.duoc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestMontoBono {
    @Test
    public void testMontoBono(){
        System.out.println("Monto Bono");
        String rut = "18978177-6";
        BussEmpleado instance = new BussEmpleado();
        int esperado = 250000;
        int obtenido = instance.montoBono(rut);
        assertEquals(esperado, obtenido);
    }
}
