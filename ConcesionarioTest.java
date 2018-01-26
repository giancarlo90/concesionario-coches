
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
        System.out.println("Creamos un objeto concesionario...");
        Concesionario concesio1 = new Concesionario();
        System.out.println("Creamos 4 objetos de la clase coche introduciendo sus caracteristicas...");
        concesio1.addCoche("Ford","Mustang",300,2015);;
        concesio1.addCoche("Ford","Fiesta",200,1990);;
        concesio1.addCoche("Honda","Civic",100,1980);;
        concesio1.addCoche("Ferrari","F430",450,2016);;
        System.out.println("Mostramos el listado de coches por pantalla...");
        concesio1.mostrarCoches();
        System.out.println("Mostramos el listado de coches ordenados por velocidad");
        concesio1.mostrarPorVelocidad();
        System.out.println("Mostramos el listado de coches ordenado por el año de fabricacion...");
        concesio1.mostrarPorFechaDeFabricacion();
        System.out.println("Introducimos un nuevo objeto de la clase coche con las mismas caracteristicas que otro");
        concesio1.addCoche("Ferrari","F430",450,2016);;
        System.out.println("Mostramos el listado de coches ordenado por velocidad fijandonos en el nuevo objeto con las mismas caracteristicas...");
        concesio1.mostrarPorVelocidad();
        System.out.println("Mostramos el listado de coches ordenado por año de fabricacion fijandonos en el nuevo objeto con las mismas caracteristicas...");
        concesio1.mostrarPorFechaDeFabricacion();
        System.out.println("Cambiamos la velocidad maxima del objeto con numero de bastidor pedido por parametro y le ponemos la nueva velocidad maxima introducida tambien por parametro... ");
        concesio1.cambiarVelocidad(0, 440);
        System.out.println("Mostramos nuevamente el listado de coches para comprobar que ha cambiado las caracteristicas del coche que hemos modificado...");
        concesio1.mostrarCoches();
        System.out.println("Eliminamos los objetos coche que tengan por modelo el nombre introducido por parametro en el metodo...");
        concesio1.eliminarPorModelo("fiesta");
        System.out.println("Mostramos nuevamente el listado de coches...");
        concesio1.mostrarCoches();
    }
}

