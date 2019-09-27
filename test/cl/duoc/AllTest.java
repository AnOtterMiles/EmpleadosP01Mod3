package cl.duoc;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
            TestCrear.class,
            TestBuscar.class,
            TestMontoBono.class,
            TestModificar.class,
            TestEliminar.class
        }
)

public class AllTest {

}
