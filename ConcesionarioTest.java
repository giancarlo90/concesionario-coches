
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ConcesionarioTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ConcesionarioTest
{
    /**
     * Default constructor for test class ConcesionarioTest
     */
    public ConcesionarioTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void Test()
    {
        System.out.println("Creamos un objeto de la clase concesionario...");
        Concesionario concesio1 = new Concesionario();
        System.out.println("");
        System.out.println("Añadimos varios coches...");
        concesio1.addCoche("Ford","Fiesta",120,1990);;
        concesio1.addCoche("Ford","Mustang",315,2015);;
        concesio1.addCoche("Honda","Civic",230,2010);;
        concesio1.addCoche("Ferrari","F430",470,2014);;
        concesio1.addCoche("Ford","Fiesta",120,1992);;
        concesio1.addCoche("Ford","Fiesta",120,1990);;
        System.out.println("");
        System.out.println("Imprimimos por pantalla el listado de coches...");
        concesio1.mostrarCoches();
        System.out.println("");
        System.out.println("Mostramos los coches ordenados por su velocidad maxima...");
        concesio1.mostrarPorVelocidad();
        System.out.println("");
        System.out.println("Mostramos los coches ordenados por su fecha de fabricacion...");
        concesio1.mostrarPorFechaDeFabricacion();
        System.out.println("");
        System.out.println("Cambiamos la velocidad maxima de un coche en funcion del numero de bastidor introducido...");
        concesio1.cambiarVelocidad(0, 205);
        System.out.println("");
        System.out.println("Volvemos a mostrar los coches ordenados por su velocidad maxima...");
        concesio1.mostrarPorVelocidad();
        System.out.println("");
        System.out.println("Eliminamos los coches que tengas por nombre la palabra introducida...");
        concesio1.eliminarPorModelo("fiesta");
        System.out.println("");
        System.out.println("Volvemos a mostrar los coches...");
        concesio1.mostrarCoches();
    }
}

